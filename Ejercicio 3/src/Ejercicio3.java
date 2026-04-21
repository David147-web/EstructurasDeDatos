public class Ejercicio3{
    public static void main(String args){
        Complejo numero1 = new Complejo(2,1);
        Complejo numero2 = new Complejo();
        numero2.setReal(1);
        numero2.setImaginaria(-3);
        System.out.println("NUmero 1: " + numero1.toString() + "y numero 2; " + numero2.toString());
        Complejo suma = numero1.suma(numero2);
        Complejo resta = numero1.resta(numero2);
        Complejo multiplicacion = numero1.multiplica(numero2);
        Complejo conjugado = numero1.conjugado(numero2);

    }
}