public class Pruebas {
    public static void main(String[] args) {
        pruebaUtilidadesYConstructor();
        pruebaMostrarExpresionYCalcularValor();
        pruebaDivisionPorCero();
        pruebaSimplificarIdentidades();
        pruebaPodarAnulaciones();
        pruebaSustituirIncognita();
        pruebaTablaEstadistica();
    }

    private static void pruebaUtilidadesYConstructor() {
        String exprInfija = "((5+2)*(8-3))/4";
        String exprPostFija = Utilidades.infijaAPostFija(exprInfija);
        ArbolExpresion arbol = new ArbolExpresion(exprPostFija);

        System.out.println("=== Ejercicio 1 ===");
        System.out.println("Infija:   " + exprInfija);
        System.out.println("Postfija: " + exprPostFija);
        System.out.println("Preorden esperado tras implementar el constructor:");
        System.out.println("/ * + 5 2 - 8 3 4");
        arbol.preOrden();
        System.out.println();
    }

    private static void pruebaMostrarExpresionYCalcularValor() {
        ArbolExpresion arbol = new ArbolExpresion("52+83-*4/");

        System.out.println("=== Ejercicios 2 y 3 ===");
        System.out.println("Expresion esperada: ((5+2)*(8-3))/4");
        arbol.mostrarExpresion();
        System.out.println("Valor esperado: 8.75");
        System.out.println("Valor obtenido: " + arbol.calcularValor());
        System.out.println();
    }

    private static void pruebaDivisionPorCero() {
        ArbolExpresion sinDivisionPorCero = new ArbolExpresion("42/");
        ArbolExpresion conDivisionPorCero = new ArbolExpresion("40/");

        System.out.println("=== Ejercicio 4 ===");
        System.out.println("42/ -> esperado false: " + sinDivisionPorCero.hayDivisionPorCero());
        System.out.println("40/ -> esperado true:  " + conDivisionPorCero.hayDivisionPorCero());
        System.out.println();
    }

    private static void pruebaSimplificarIdentidades() {
        ArbolExpresion arbol = new ArbolExpresion("50+1*21//");

        System.out.println("=== Ejercicio 5 ===");
        System.out.println("Preorden original:");
        arbol.preOrden();
        arbol.simplificarIdentidades();
        System.out.println("Preorden esperado tras simplificar:");
        System.out.println("/ 5 2");
        arbol.preOrden();
        System.out.println();
    }

    private static void pruebaPodarAnulaciones() {
        ArbolExpresion arbol = new ArbolExpresion("52+83-0*+");

        System.out.println("=== Ejercicio 6 ===");
        System.out.println("Preorden original:");
        arbol.preOrden();
        arbol.podarAnulaciones();
        System.out.println("Preorden esperado tras podar:");
        System.out.println("+ + 5 2 0");
        arbol.preOrden();
        System.out.println();
    }

    private static void pruebaSustituirIncognita() {
        ArbolExpresion base = new ArbolExpresion("x4*");
        ArbolExpresion sustitucion = new ArbolExpresion("53+");

        System.out.println("=== Ejercicio 7 ===");
        System.out.println("Base esperada antes de sustituir: (x*4)");
        base.mostrarExpresion();
        System.out.println("Sustitucion esperada: (5+3)");
        sustitucion.mostrarExpresion();
        base.sustituirIncognita(sustitucion);
        System.out.println("Base esperada tras sustituir: ((5+3)*4)");
        base.mostrarExpresion();
        System.out.println();
    }

    private static void pruebaTablaEstadistica() {
        TablaEstadistica tabla = TablaEstadistica.cargarDesdeFichero("normal_distribution.csv");

        System.out.println("=== Ejercicio 8 ===");
        if (tabla == null) {
            System.out.println("No se pudo cargar normal_distribution.csv");
        } else {
            System.out.println("Consulta z = 2.055");
            System.out.println("Valor esperado aproximado: 0.97982");
            System.out.println("Valor obtenido: " + tabla.consultarMasCercano(2.055));
        }
    }
}
