package ticTacToe.v320.views;

import ticTacToe.v320.models.Coordinate;
import ticTacToe.v320.utils.IO;
import ticTacToe.v320.utils.LimitedIntDialog;

class CoordinateView {
	
	private String title;
	
	private Coordinate coordinate;
	
	CoordinateView(String title, Coordinate coordinate) {
		assert title != null;
		assert coordinate != null;
		this.title = title;
		this.coordinate = coordinate;
	}

	void interact() {
		new IO().writeln(title + " qué casilla?");
		coordinate.setRow(new LimitedIntDialog("Fila?", Coordinate.DIMENSION)
				.read() - 1);
		coordinate.setColumn(new LimitedIntDialog("Columna?",
				Coordinate.DIMENSION).read() - 1);
	}
}
