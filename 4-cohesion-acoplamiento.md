#Cohesion y Acoplamiento
Como mantener la complejidad manejable.

### Alta Cohesion
Una clase con mucha responsabilidad tiene de todo y es muy compleja.
Hay que organizar nuestros modulos para que dependan lo suficiente unos de los otros (bajo acoplamiento) pero que tengan una unica responsabilidad necesaria para ser requerisodos  (alta cohesion).

**Cohesion funcional** : es la medida que representa la fuerza con la que estan relacionadas y enfocadas las responsabilidades de un elemento.

**Cohesion de una clase** : buscar metodos y atributos cuya relacion este estrechamente relacionada.
Los miembros de una clase tienen que colaborar unos con los otros.

Especial atencion a las clases de datos a evitar, son clases que solo tienen getters y setters y cuyos miembros solo se utilizan desde otras entidades, la clase en si seria debilmente cohesiva ya que sus partes no colaboran entre si.

trucos para diferenciar la cohesion de una clase : si quitas un miembro deja de tener sentido los otros. Si puedes agrupar miembros de una clase eso huele mal (podrian ser dos clases o extraer de ahi una interfaz).

**clases contradictorias a evitar** : Helpers, Utils, Clases de Datos.



### Bajo Acoplamiento
Grado de dependencia de otros, alto si dependo de muchos, bajo o debil si dependo de pocos y en menor magnitud.

Si dependo de muchos tengo un un grado alto de proabilidades de que me repercutan si alguno de cambia (en implementacion).

lo interesante es tener un **numero reducido de dependencias** con los otros elementos del sistema de los que dependo, para reducir el acoplamiento.



###Formas de Acoplamientos segun la relacion con el sistema
**ACOPLAMIENTO DIRECTO**
Por dependencia de un modulo dentro de otro.

- **acoplamiento por herencia de clases o interfaces y composicion de objetos**
Se tienen una dependencia directa tanto de la interfaz como de la implementacion de aquellos atributos privados que se heredan tando de superclases o interfaces, o por objetos compuestos de otras clases.


- **acoplamiento por mensajes**
Se tiene dependencia de los atributos que se invocan pasando por parametros objetos de otras clases, o servicios de metodos estaticos, metodos que devuelven objetos de otro tipo...En definitiva Todo aquello que afecte a la implementacion de de cualquier miemnbro de un clase.


**ACOPLAMIENTO INDIRECTO**
cuando a traves de un acoplamiento directo obtenemos un tipo diferente al que llamamos;


> **CONCLUSIONES**
> Metricas de acoplamiento: hay que limitarse a una dependencia de *3/5 clases*.
> Mas dependencias dentro de un atributo de clase, complica el entendimiento del codigo y perjudica el acoplamiento en dificultad cuando se quiera cambiar el comportamientode ese elemento en concreto.
>
> No se entra a discutir de cuantos metodos se esta acoplado de una clase especifica, dentro de un miembro de una clase, porque los metodos son lo sufientemente cortos.
> ¿Te cuantas clases estas acolplado en un metodo tal...?
>
> El principio *Opoen Close* permite las dependencias.
> El principio de inversion de dependencias añade acoplamiento (son mas sanos porque dependo de interfaces).
>
> Los diseños se corrompen por:
> - Los cambios de requisitos.
> - Por una mala gestion de dependencias.
>
> Una manera de reducir las dependencias es reducir las responsabilidades de un metodo,
> pero no hay que dejar de lado que no hay que repetir codigo, es decir, si un metodo necesita varias dependencias para expresarse lo suficientemente cohesivo...pues se le dá.