ED Practica 2
=================

Descripción
-----------
Proyecto de prácticas de Estructuras de Datos. Contiene dos ejercicios principales:

- DefUsoListas: implementación sencilla de listas enlazadas, nodos, iterador y clases de ejemplo para gestionar evaluaciones y alumnos.
- EtiquetasHTML: comprobador de etiquetas HTML usando una pila (implementación propia y otra con java.util.Stack).

Estructura del proyecto
-----------------------

Raíz
- .gitignore
- prueba1.html .. prueba5.html  (ficheros de ejemplo para el comprobador HTML)
- src/  (código fuente en Java con paquetes)

Paquetes Java
- src/DefUsoListas: Lista, Nodo, Iterador, Evaluacion, Alumno, AlumnoBib, Pruebas (main de ejemplo)
- src/EtiquetasHTML: HTML (main que ejecuta el comprobador), Pila, Nodo, Fichero

Requisitos
----------

- Java JDK 8 o superior
- Herramientas: javac y java (línea de comandos) o un IDE (IntelliJ, Eclipse, NetBeans)

Compilar desde línea de comandos
-------------------------------

1. Desde la raíz del proyecto crea la carpeta de salida y compila todo:

    mkdir -p out
    javac -d out src/DefUsoListas/*.java src/EtiquetasHTML/*.java

2. Ejecutar las clases main:

    java -cp out DefUsoListas.Pruebas

    java -cp out EtiquetasHTML.HTML

Ejemplos de uso
---------------

- Pruebas (DefUsoListas.Pruebas)
  Ejecuta ejemplos que crean evaluaciones y alumnos, muestra asignaturas aprobadas, medias y algunos mensajes por consola.

- Comprobador de HTML (EtiquetasHTML.HTML)
  Al ejecutar te pedirá el nombre del fichero HTML a comprobar. Puedes usar los ficheros de ejemplo en la raíz, por ejemplo:

    prueba1.html

Notas y recomendaciones
-----------------------

- El proyecto usa paquetes Java; al compilar con javac usa la opción -d para generar las clases con la estructura de paquetes en el directorio de salida.
- Hay un fichero .gitignore incluido en el repositorio. Si añades archivos generados por el IDE (IntelliJ, etc.) revisa su contenido antes de commitear.
- Algunas partes del código contienen comentarios que parecen apuntar a tareas pendientes o ajustes. Si quieres, puedo revisar y corregir esos puntos.

Contribuciones
--------------

Si quieres mejorar el proyecto (corregir errores, añadir tests, o documentar más), crea un fork o una rama y abre un pull request.

Autor
-----
David Martin Yanguas

Licencia
--------
MIT License — véase el fichero LICENSE si quieres añadirlo (no incluido por defecto).
