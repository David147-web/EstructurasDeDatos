public class Aplicacion {
    public static void main(String[] args){
        Intervalo tempLunes = new Intervalo(3,8);
        System.out.println(tempLunes.toString());
        System.out.println("Intervalo: " + tempLunes.toString());
        System.out.println("Longitud: "+ tempLunes.longitud());
        System.out.println("Punto medio: " + tempLunes.puntoMedio());

        tempLunes.desplazar(3);
        System.out.println("Desplazado: " + tempLunes.toString());

        tempLunes.escalar(3);
        System.out.println("Al triplicarlo: " + tempLunes.toString());

        if(tempLunes.incluye(19)){
            System.out.println("El 19 esta incluido");
        }else{
            System.out.println("El 19 no esta incluido");
        }
    }
}
