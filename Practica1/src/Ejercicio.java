import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        int numero;
        Scanner lectura = new Scanner(System.in);//Creamos una variable de tipo scanner a la que se asigna memoria para hacer funcionar el scanf
        do {
            System.out.print("Introduzca un valor entero (0 para terminar): ");
            numero = lectura.nextInt();
            if (numero < 0) {
                System.out.println("Numero no valido");
            } else {
                if (numero > 0) {
                    visualizarDivisores(numero);
                }
            }
        } while (numero != 0);
        lectura.close();
    }

    public static void visualizarDivisores(int valor) {
        System.out.print("Divisores de " + valor +  ":");
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}