### Princios fundamentales del diseño

- **Experto en la informacion**
Repartir responsabilidades, ¿Quien tiene que hacer esto, y cuantas responsabidades se el asigna?

- **Alta Cohesion**
¿Tienen sentido las responsabilidades que asignamos a un miembro de clase?.

- **Bajo acoplamineto**
para competer mis labores ¿En que cantidad (directa o indirecta) dependo de otros mienmbros?

- **Invencion Pura**
Si ningun esquema de diseño no nos ayuda a encontramos una relacion directa con la estructura de una clase que buscamos...nos la inventamos, aunque no exista en la realidad.
Ejemplos: una clase que nos relacione los miembros de los tipos de Rimas de una clase Cancion, o Poema.
Entonces sabemos que existe la sufiente relacion como para inventarnos un clase con ciertos miembros en nuestro sistema, aunque nos saltemos principiuos como el experto en la informacion (miembros susceptibles de pertenecer a una clase deben estar agrupados por cohesion), porque mas importante es que nuestra clase sea mantenible.


- **Librerias incompleta**
Es un tipo de invencion Pûra de clase que te encapsula las funcionalidades a bajo nivel para que se pueda absatraer a major nivel y trabajar comodo con los acoplamientos en otras clases donde se inyecta.
Asi obtendremos metodos pequeños, lñegibdles.
Coincide con la definición del patron Adapter o Facade (Fachada).


**Analisis de TicTacToe version - clase grande**
Al principio tenemos solo una clase con la responsabilidad completa del sistema.
Separamos la responsabilidades en : Tablero, Ficha, IO(libreria nativa de JDK poco manejable, de invencion pura).

IO : la unica que le los eventos del cliente (Bufer reader), un read y un write por cada tipo de primitivo que vayamos a usar. Contiene 28 metodos, es una clase gorda, pero como no tenemos ningun criterio para partirlo es adecuada (Se podria  partir en dos : una ,para Inmput y otrsa para output). Nos damos cuenta que es una excepcion a las mentricas anteriormente citadas, pero NO PASA NADA si tiene 28 metodos.

Board : inicializa los Tokens en su conbstriuctor, y sus metodos  son cohesivos.

Token : Una clase con la unica responsabilidad de inicializar su propia ficha del juigador, casi nada, empieza a oler mal.




> CONCLUSIONES
> Patron Adapter : Es una clase que Oculta funcionalidades de bajo Nivel, por ejemplo metodos de validacion o de compatibilidad de sistema (los tipicos checkers de tipos).

> Patron Fachada : Nuestro IO : Es un Wrapper de metodos que oculta la complejidad ed un subsistema, coincide con la tecnica de Diseño por *Libreria incompleta*

> Pogramamcion Parametrizada  la implementacion de una metodo depende de sus parametros.
> En nuestra clase IO es un claro ejemplo en el que nos simplificaria toda la clase, porque sistematicamente los metodos de entrada y salida son iguales

> mejoras en el la version Mejorada de Tic Tac Toe :
> Separa la clase IO en dos, una de entrada dy oehtra de salida.
> Aplicar programacion parameetrizada en la clase IO.



51:10