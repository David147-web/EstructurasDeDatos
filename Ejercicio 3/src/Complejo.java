public class Complejo {
    private double real;
    private double imaginaria;

    public Complejo(){
        real = 0;
        imaginaria = 0;
    }
    public Complejo(double real, double imaginaria){
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImaginaria(double imaginaria){
        this.imaginaria = imaginaria;
    }

    public double getReal(){
        return real;
    }
    public double getImaginaria(){
        return imaginaria;
    }

    public Complejo suma(Complejo otro){
        Complejo resultadosuma = new Complejo(real + otro.real, imaginaria + otro.imaginaria);
        return resultadosuma;
    }
    public Complejo resta(Complejo otro){
        Complejo resultadoresta = new Complejo(real - otro.real, imaginaria - otro.imaginaria);
        return resultadoresta;
    }
    public Complejo multiplica(Complejo otro){
        return new Complejo(real * otro.real - imaginaria * otro.imaginaria,
                real * otro.imaginaria + imaginaria * otro.real);
    }
    public Complejo conjugado(Complejo otro){
        double r = (real * otro.real) - (imaginaria * otro.imaginaria);
        double i = (real * otro.imaginaria) + (imaginaria * otro.real);
        return new Complejo(r, i);
    }
    public double modulo(){
        return Math.sqrt(real * real + imaginaria * imaginaria);
    }
    public String toString(){
        String resultado = "(" +real;
        if(imaginaria >= 0){
            resultado += " + ";
        }else{
            resultado += " - ";
        }
        resultado += Math.abs(imaginaria) + "i)";
        return resultado;
    }
}

