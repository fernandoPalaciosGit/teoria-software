#La calidad del foftware
**comportamiento, fiabidad, eficiencia, integridad, usabilidad, facilidad de mantenimiento, flexibilidad, facilidad de prueba, portabilidad, reusabilidad, interoperatividad entre sistemas externos**

Todos dependen de los requisitos de diseño cumplidos.

#### El diseño de software
- determinar objetos y clases con sus responsabilidades.
- interfaces de cada clase.
- tamaño y comportamiento de cada modulo.
- definir las jerarquias de herencia.
- dependencias de cada clase (grado de acoplamiento)


#### diseño rigido vs flexible
**rigido** : sistema en el que hay demasido grado de acoplamiento y por cada funcionalidad hay que tocar varias partes.

**flexible** : sistema reutilizable y granular.
Poco acoplado y cohesivo en sus modulos.


####  diseño  fragil vs robusto
**fragil** : sistema que se desestabiliza (a petar) al tocar pocas parte.

**robusto** : sus partes son distinguobles por funcionalidad, faciles de localizar y configurar.


#### diseño viscoso vs legible
**viscoso** : es horroroso de leer, maraña, ininteligible.

**legible** : sistema sencillo de leerlo por logica, entendible  su funcionamiento al darle una si,ple pasada.

#### diseño inmovil vs reutilizable
disenos muy acoplados y poco cohesivos


#### causas de un mal diseño
- continuos cambios de requisitos. Esto es porque el usuario nunca sabe lo que quiere, por una parte hay que cambiar el diseño  en el momento en el que se requira el cambio de funcionalidad (cada requisito requiere su logica).
- Gestion de dependencias : hay que controlar el tamaño, la responsabilidad, la cohesion, las dependencias....de cada modulo.


#### propuestas de un buen diseño
- calidad de software de bajo nivel : instrucciones de modulos, logica de instrucciones cohesivas (Lo que se revisa en lo PR).
Hay reglas de programacion para evitar codigo mal oliente (cosas que no se pueden hacer).

- calidad de software de medio nivel : diseño de las clases, interfaces, paquetes, sus herencias, responsabiliodad...
Principios SOLID, GRASP, asignacnion de responsabilidades

- calidad de software de alto nivel : contexto de aplicacion, clases y cilos del sistema...

- patrones de diseño / programacion (princios del software para asignar responsabilidades) : patuas qeu te ayudan a proponer el analisis del sistema.

- evitar los antipatrones de diseño / programacion.
