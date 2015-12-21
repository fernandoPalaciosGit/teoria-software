#Diseño del software
- Hablamos del diseño de software de Bajo nivel, es el que se refiere a las reglas o/y patrones de progracion d ecodigo.
- Hablamos de reglas aceptadeas durante tiempo por la comunidad, pero prevalece las reglas de cada comunidad o nicho represesentativo de una tecnologia en concreto.
- O hacemos caso a los gurus o a la documentaciond del equipo de persoinas que mantienen una tecnologia en concreto.

**Reglas de formato de codigo limpio**
- Solo una linea en blanco debajo de cada bloque logico de codigo.
- Los atributos de una clase deben declararse al principio de su declaracion.
- los metodos invocados desde otro, deben estar lo mas proximos (mejor declarados primero el nombrado y despues quien lo llama). Cuando son muchos llamdos se establecen reglas de compromiso.
- Agrupar los metodos por opecaciones parecidas (relaciones), NO por orden alfabetico o por tipos de modifiocadores de acceso (el metodo de dar de alta y dar de baja van uno detras de otro).
- Las variables se declaran tan cerca como sea posible de su utilizacion.
- Las lineas deben se cortas (80/120 caracteres).
- La jerarquia de bloques / scopes, se rerspetan o diferencian con el sangrado.
- NO utilizar el sangrado para representar los grupos de variables por coloumna.
- nunca romper las reglas de sangrado. Aunque sea por un sola linea de codigo

**No subestimes la eficiencia del compilador / interprete de maquina**
La efiniencia es muy muy importante, pero por debajo de:
- Entregas a tiempo del proyecto
- mantenibilidad de codigo
- calidad del diseño : Encapsulacion, modularidad, jerarquia, abstraccion
- Los señores de la programacion han estudiado que la eficiencia de los algoritymos de bajo nivel (ordenacion, hash...) muestran graficas de ejecucion en el software que decaen en lugares que en la mayoria de casos NO son visibles si no es con una herramienta de monitorizacion. Es muy trivial e incierto decir a priori que un fragmento de codigo decae la eficiencia del programa (el 80% de las veces son estupideces).

**Comentarios mal colocados**
- El codigo no se comenta, se programa como si fuera poesia
- No dejar comentarios en los encabezados de los modulos
- No utilizar guias de estilos en los comentarios.
- No se dejan discusiones de codigo (Aclaraciones de logica o de diseño).
- no dejar codigo abandonado que no se usa.
- Un monton de codigo sobre una pesima impleementacion no es excusa para entendenlo.
- variables de clases, metodos u objetos comentadas.
- atribucion de desarrollador o propietario (VCS)
- Comentarios no mantenidos.

**comentarios bien colocados**
- Codigo claro y expresivo con algunos pocos comentarios, es muy superior a un codigo desordebado y complejo con un monton de comentarios.
- Expresiones regulares
- comentarios legales

**Framework de Comentarios : javadoc, jsdoc, phpdocumentor**
- Si se va a crear una biblioteca
- API de publicacion de recursos externos
- Si la documentacion no se consulta es sintoma de inutilidad.

**No comentes codigo malo, reescribelo**

**Formacion de nombres**
- **Crear nombres descriptivos de la funcionalidad que no requieran comentarios.**
- Legibles (en camelcase y que se puedan leer) y con la longitud que sea necesaria
- Excepcion de los Acronimos internacional.
- Excepcion de las constantes (como son nombres en mayusculas, se corrompe la lectura)
- Todos los nombres empiezan en minusculas.
- Solo se Capitaliza un nombre : camelcase, Clases, constantes.
- No se cambian los nombres preestablecidos por la comunidad, por ejemplo i/j/k de las iteraciones.
- Los metodos son verbos
- Las clases, atributos y paquetes son sustantivos.
- Evitar la anotacion Hungara : NO preceder los nombres con un acronimo de su tipo de dato o modificador (intValueComplet, arrPersonalProverbs).

**descomposicion funcional** [doo/src/main/java/ticTacToe/v040]
Se revelan cuando nombramos con verbos a las clases
Tambien porque en cada una de ellas debemos instanciarlas con una copia de nuestra propiedad esatructura de datos clave (en el ejemplo 'Start, Put, Move' reciben el array de tokens).
Suelen tener un unico metodo como miembro
Estas clases pierden todo polimorfismo, herencia y reutilizacion
