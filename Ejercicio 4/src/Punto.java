public class Punto {
    private double x, y;

    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto (double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + ", " + y + ')';
    }
    public double distancia(Punto punto){
        return Math.sqrt(Math.pow(punto.x - this.x, 2) + Math.pow(punto.y -this.y,2));
    }
}
