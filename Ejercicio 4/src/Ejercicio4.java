public class Ejercicio4 {
    public static void main(String[] args){
        Punto punto1 = new Punto();
        Punto punto2 = new Punto(4.5, 2.3);
        System.out.println("Punto 1: " + punto1.toString());
        System.out.println("Punto 2: " + punto2.toString());
        System.out.println("Distancia: "+ punto1.distancia(punto2));
        Circulo circulo = new Circulo(punto1, 5);
        System.out.println("Circulo: "+ circulo.toString());
        Punto[] puntos ={punto1, punto2};
        for (Punto p : puntos){
            if(circulo.contiene(p)){
                System.out.println("El punto "+ p.toString() + " esta dentro del circulo " + circulo.toString());
            }
        }
    }
}
