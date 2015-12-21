**GRAPS : principios o patrones de asignacion de responsabilidades**
Ayudan a hacer un analisis/diseño de clases

**1 - Experto en la informacion**
Otorgasr metodos a la clase que contiene la informacion requerida.

**2 - Clases Dios**
Es una clase que intenta tener todas las responsabilidades del sistema
Se duplica codigo
Dificilmente reutilizar
Limite maximo 200 llineas
Tope de 5 atribuitos por clase
Tope de 20 metodos por clase
reagrupar los miembros en clases que los relacionen
si es una interfaz, separa los datos y cálculos del dominio en
una clase de entidad.

**3 - Estrategias de analisis de clases - Como Encontrar las clases**
- **descripcion informal**skys
	Coger requisitos del sistema
    Los sustantivos son clases o miembros de esta y los verbos son metodos.
    Erradicar sinonimos, anaforas...
    Cosificacion : hacer un sustantivos de un verbo

- **analisis clasico**
	Las clases surgen a partir de elementos de la realidad
    Tangibles : coches, datos de telemetria, sensores de presion...
    No tangibles : pueden ser utilizados para llevar un seguimiento de las entidades reales , prestamos reuniones, interseccion.
    Cosas que pasan: eventos deportivos, aterrizaje, interrupcion, solicitud.
    Gentes, seres humanos, roles: madre, politico, profesores.
    Organizaciones : departamentos, grupo de alumnos.
    Lugares fisicos: zonas reservadas para la interaccion con las entidades.
    Dispositivos: elementos inertes con especificidad : sensor de temperatura, velocimetro, servidor.

- **analisis del dominio**
	En base a la descripcion del cliente (expertos del dominio), nuestro sistema debe estar representado lo mas aproximado a los elementos que ellos nos describen.
    Debes respetar el vocabulario y los conceptos de los expertos.

- **analisis del reparto de responsabilidades**
	Nos preguntamos *que debe hacer* un objeto y *que debe conocer* un objeto.
    Una responsabilidad *NO son los metodos*.
    Se puede pensar como una familia de metodos que en su conjunto llevan a cabo una responsabilidad del sistema.
    Para este analisis se acude a las targetas CRC (class-responsability-colaboration), las cuales son un diagrama en formato de tabla, representando este tipo de analisis.

- **requisitos de casos de uso**
	Por cada cosa (logica de negocio) que tiene que hacer la aplicacion, se realiza un analisis de responsabilidades, colaboracion...donde se extraen las clases.


- **Evitar las clases de utilidad o Helpers**
	Sulelen ser clases de mertodos estaticos sin razon de ser insanciadas.
    Es la ausencia de analisis, se acudde como unltimo recurso.

> **Conclusiones : **
> Bajo todas principios / patrones por las que obtenemos y entendemos  las entidades de nuestro sistema, debemos cumplir otras dos premisas:
Alta cohesion y bajo acoplamiento.


> Se estudia  cada una de las clases extraidas, se complementa con sus metodos y propiedades, y revisa si las respoinsabilidades de cada uno son oportunas y no se pisan entre smi (alta cohesion), las clases se relacinan entre si (con un bajo acoplamiento).


> Ciertas clases con una proyeccion de la BBDD.

> Un buen diseño es obtener clases con una sola responsabilidad