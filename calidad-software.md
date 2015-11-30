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

#### tiposde reusabilidad
- **reusabilidad de codigo :** Bibliotecas, API, clases controladoras...
- **reusabilidad de diseño :** patrones de comportamiento de softaware propuestas y testeadas.
- **reusabilidad de codigo y de diseño, Frameworks :** decisiones arquitectonicas importantes. En este caso se produce una _inversion de control_, El framework llama a nuestra aplicacion.


#### metodologias de diseño de software
- **Poblemas que se solucian :** Falta de involucracion del usuario, requerimienetos y especificaciones claras, cambios de requerimientos y especificaciones, expectativas poco realistas, objetivos poco claros, tiempos poco realistas.


- **Metodologia en cascada : **aplicar la disdciplina de requisitos entera, es decir ,se requisitar, analizar y diseñar como procesos completos, después se programa, y después se entrega. En otras ingenierias, civil, industrial, es un proceso comun. En software solop encaja en sistemas concretos.


- **Metodologias  Iterativas :** (modelo espira de Bohen) se planifica por fases, para esa entrega en concreto se requisita, se analiza y se diseña lo necesario, despues se programa y testea. Al final de cada iteracion (sprint), hay una entrega en el que se culminan los cambios de esta fase (sersion del proyecto).

- **Metodolologia RUP (Rational Unifies Process):** marco de metodologias pesadas. Cada dos o tres semanas aplicacar una cascada de necesidades de diseño del software (caracter miterativo). en cada iteracion se requisita, analiza y diseña menos y en ultimas fases se programa mas  yt se entraga mas.
```markdown
    DO {
        - Requisitar
        - Analizar
        - Diseñar
        - Programas
        - Testear
        - Deplegar

    } WHILE (isFinishedProyect)
```

Es habitual hacer diagramas de todo tipo : de casos de uso, diagramas de clases, diagramas de despliegue,. diagrama de componentes.
Los costes del softawware se pactan al principio del proyecto.
Dan una estimacion de tiempo y coste del proyecto (presupuesto cerrado).
El desarrollo del software se empieza por aquellas partes que se consideran mas complicadas (lo mas arriesgado de construir).
Analizan durante un 15% del tiempo de proyecto la propuesta de arquitectura (estudian como se va a programar absolutamente todo).

- **Metodolologia SCRUM + XP (Extrem Programming):**
```markdown
    DO {
        - Requisitar + Analizar
        - Testear + Diseñar
        - Programas + Rediseñar
        - Deplegar
    } WHILE (isFinishedProyect)
```

*Requisitar + Analizar :* requiere que el cliente este presente.
*Testear + Diseñar :* primero se escribe el codigo de prueba y luego se escribe el de produccion.
*Programas + Rediseñar :* se programa con TDD, E2E desarrollo direigido por pruebas, y se recfatoriza a medida que se construye.
*Deplegar :* CI, herramientas de integracion continua, sistematicamente se tiene funcionando toda la aplicacion en los servidores de preproduccion, pasando pruebas constantemente ante cada cambio dele rsistema durante las fases.

Se hacen diagramas en caso extrictos y se suelen hacer ingenieria inversa para crear UML o graficas.
Los costes del software se van definiendo a medida que avanzan las iteraciones.
Al preveer un sprint (fin de la fase) se pacta el coste de esa fase.
A priori no se ofrece esimaciones ni en tiempo ni en dinero.

Xp (Extream programing) : es el concepto de las metodologias tecnicas de ejecucion del proyecto anteriormente citadas, para llevar  acabo esto se se utiliza la guia de gestion de equipos del proyecto SCRUM (una metodologia agil).

