package ticTacToe.v330.views;

import ticTacToe.v330.controllers.OperationController;
import ticTacToe.v330.models.Coordinate;
import ticTacToe.v330.utils.IO;

class BoardView {

	private OperationController controller;

	BoardView(OperationController controller) {
		assert controller != null;
		this.controller = controller;
	}

	void write() {
		IO io = new IO();
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				io.write(controller.getColor(new Coordinate(i, j))
						+ " ");
			}
			io.writeln();
		}
	}
}
