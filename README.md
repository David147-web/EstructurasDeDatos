Proyecto: ED_202526_Practica3
=================================

Descripción
- - - - - - - -
Repositorio con la práctica 3 de la asignatura Estructuras de Datos. El objetivo principal es trabajar con árboles de expresión y una tabla estadística implementada como árbol binario. El código está en Java y contiene implementaciones auxiliares (pila, cola, nodos) y utilidades para convertir expresiones infijas a postfijas.

Estructura del proyecto
- - - - - - - - - - - -
- src/: código fuente Java
  - ArbolExpresion.java     : Árbol de expresión. Contiene constructores y métodos para recorrer, evaluar y transformar expresiones. Varias funciones están marcadas como TODO por ejercicios (1..8).
  - NodoArbol.java          : Nodo del árbol de expresiones
  - Utilidades.java         : Funciones auxiliares (pasar a entero, detectar operadores/operandos, conversión infija->postfija)
  - Pila.java / Cola.java   : Estructuras auxiliares usadas por ArbolExpresion
  - TablaEstadistica.java   : Construcción de tabla desde CSV y consultas sobre un árbol balanceado
  - NodoTablaEstadistica.java: Nodo para la tabla estadística
  - Pruebas.java            : Main de prueba que muestra un ejemplo de uso (convierte infija a postfija, construye árbol, muestra operaciones)

Archivos adicionales
- - - - - - - -
- normal_distribution.csv  : CSV de ejemplo que puede cargarse con TablaEstadistica.cargarDesdeFichero
- .gitignore               : patrones de archivos a ignorar

Requisitos
- - - - - -
- JDK (Java 8+)

Compilar y ejecutar desde línea de comandos
- - - - - - - - - - - - - -
1. Compilar todas las clases (desde la raíz del proyecto):

   javac -d out -cp . src/*.java

   Esto generará las clases compiladas en el directorio out (o el que prefieras).

2. Ejecutar la clase de pruebas de ejemplo:

   java -cp out Pruebas

   Salida esperada (ejemplo):
   Infija: ((5+2) * (8-3))/4
   Postfija: 52+83-*4/
   Arbol construido: (se muestra la expresión)
   ¿Division por 0?: false
   Valor calculado: 8.75

Notas relevantes
- - - - - - - - - -
- La función Utilidades.infijaAPostFija lanza excepción si detecta operandos de más de un dígito: esta práctica asume operandos de un solo dígito o la variable 'x'.
- Muchos métodos del ArbolExpresion y TablaEstadistica están etiquetados como TODO en el código; en este repositorio se incluyen implementaciones de varios ejercicios y plantillas para otros.
- Pruebas.java contiene un ejemplo mínimo — puedes crear tus propios casos o usar la CSV con TablaEstadistica.cargarDesdeFichero.

Siguientes pasos sugeridos
- - - - - - - - - - - - -
1. Revisar los TODO en ArbolExpresion.java y TablaEstadistica.java para completar las funciones marcadas por la práctica.
2. Añadir más ejemplos y pruebas unitarias.
3. Añadir un script o Gradle/Maven para compilar/ejecutar automáticamente.

Contacto
- - - -
Si quieres que añada el README al control de versiones (commit) y lo suba a GitHub, dime y lo hago.
