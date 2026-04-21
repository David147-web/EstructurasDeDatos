package EtiquetasHTML;

import java.util.Scanner;
import java.util.Stack;

public class HTML {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el nombre del fichero: ");
        String nombreFichero = teclado.nextLine();
        Fichero fichero = new Fichero(nombreFichero);
        if (fichero.valido()) {
            System.out.println("Prueba con Pila:");
            if (comprobarHTML(fichero)) {
                System.out.println("Correcto");
            }
        }
        fichero.cerrar();
        fichero = new Fichero(nombreFichero);
        if (fichero.valido()) {
            System.out.println("Prueba con Stack:");
            if (comprobarHTMLStack(fichero)) {
                System.out.println("Correcto");
            }
        }
        fichero.cerrar();
    }

    public static boolean esApertura(String palabra) {
        return palabra.charAt(0) == '<' &&
                palabra.charAt(1) !='/' &&
                palabra.charAt(palabra.length()-1) == '>';
    }

    public static boolean esCierre(String palabra) {
        return palabra.charAt(0) == '<' &&
                palabra.charAt(1) =='/' &&
                palabra.charAt(palabra.length()-1) == '>'; // Eliminar esta línea
    }

    public static boolean emparejadas(String apertura, String cierre) {
        return apertura.substring(1).equals(cierre.substring(2));  // Eliminar esta línea
    }

    public static boolean comprobarHTML(Fichero fichero) {
        Pila pila = new Pila();
        String[] palabras = fichero.leerLinea();
        int numLinea = 1;
        boolean correcto = true;
        while(palabras != null && correcto){
            int posicion = 0;
            while (posicion< palabras.length && correcto){
                String palabra = palabras[posicion];
                if (esApertura(palabra)) {
                    pila.apilar(palabra);
                }else if(esCierre(palabra)){
                    String cima = pila.desapilar();
                    if(cima==null || !emparejadas(cima, palabra)){
                        System.out.println("Error en linea "+ numLinea +" al leer "+ palabra);
                        correcto = false;
                    }
                }
                posicion++;
            }
            palabras = fichero.leerLinea();
            numLinea++;
        }
        if(correcto && !pila.vacia()){
            System.out.println("Final de fuente inesperado");
            correcto=false;
        }

        return correcto;
    }

    public static boolean comprobarHTMLStack(Fichero fichero) {
        Stack<String> pila = new Stack<String>();
        String[] palabras = fichero.leerLinea();
        int numLinea = 1;
        boolean correcto = true;
        while(palabras != null && correcto){
            int posicion = 0;
            while (posicion< palabras.length && correcto){
                String palabra = palabras[posicion];
                if (esApertura(palabra)) {
                    pila.push(palabra);
                }else if(esCierre(palabra)){
                    String cima = pila.pop();
                    if(pila.empty() || !emparejadas(pila.pop(), palabra)){
                        System.out.println("Error en linea "+ numLinea +" al leer "+ palabra);
                        correcto = false;
                    }
                }
                posicion++;
            }
            palabras = fichero.leerLinea();
            numLinea++;
        }
        if(correcto && !pila.empty()){
            System.out.println("Final de fuente inesperado");
            correcto=false;
        }

        return correcto;
    }


}
