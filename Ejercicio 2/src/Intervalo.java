public class Intervalo {
    private double minimo;
    private double maximo;
    public Intervalo(double minimo, double maximo){
        if(minimo <= maximo){
            this.minimo = minimo;
            this.maximo = maximo;
        }else{
            System.out.println("Error, minumo superior a maximo");
            minimo = 0;
            maximo = 0;
        }
    }
    public Intervalo(){
        minimo = 0;
        maximo = 0;
    }
    public double getMinimo(){
        return minimo;
    }
    public double getMaximo(){
        return maximo;
    }
    public void setMinimo(double minimo){
        if (minimo <= maximo){
            minimo = minimo;
        }else{
            System.out.println("El minimo no puede ser superior al maximo");
        }
    }
    public void setMaximo(double maximo){
        if (maximo <= minimo){
            maximo = maximo;
        }else{
            System.out.println("El maximo no puede ser inferior al minimo");
        }
    }
    public double longitud(){
        return maximo - minimo;
    }
    public double puntoMedio(){
        return (maximo + minimo) / 2;
    }
    public void desplazar(double desplazamiento){
        minimo += desplazamiento;
        maximo += desplazamiento;
    }
    public String toString(){
        return "[" + minimo + ", " + maximo + "]";
    }
    public void escalar(double escala){
        double nuevaLongitud = this.longitud() * escala;
        double puntoMedio = this.puntoMedio();
        minimo = puntoMedio - nuevaLongitud / 2;
        maximo = puntoMedio + nuevaLongitud / 2;
    }
    public boolean incluye(double punto){
        return minimo <= punto && punto <= maximo;
    }

}
