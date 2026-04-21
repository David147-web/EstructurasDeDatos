public class Alumno {
    private static final int NUMERO_NOTAS = 6;

    private String nombre;
    private String matricula;
    private double parcial1, parcial2, examenPr2, entregaPr2, examenPr3, entregaPr3;

    public Alumno(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        this.parcial1 = 0;
        this.parcial2 = 0;
        this.examenPr2 = 0;
        this.entregaPr2 = 0;
        this.entregaPr3 = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public String getMatricula(){
        return matricula;
    }
    public void calificarParcial1(double nota){
        parcial1 = nota;
    }
    public void calificarPractica2(double examen, double entrega){
        this.examenPr2 = examen;
        this.entregaPr2 = entrega;
    }
    public void calificarParcial2(double nota){
        this.parcial2 = nota;
    }
    public void calificarPractica3(double examen, double entrega){
        this.examenPr3 = examen;
        this.entregaPr3 = entrega;
    }
    public double notaTeoria(){
        return (parcial1 + parcial2) / 2;
    }
    public double notaPractica2(){
        if(examenPr2 < 5) {
            return examenPr2;
        }else {
            return examenPr2 * 0.6 + entregaPr2 * 0.4;
        }
    }
    public double notaPractica3(){
        if(examenPr2 < 5) {
            return examenPr3;
        }else {
            return examenPr3 * 0.6 + entregaPr3 * 0.4;
        }
    }
    public double notaPracticas(){
        return (notaPractica2() + notaPractica3())/2;
    }
    public double notaFinal(){
        double nTeoria = notaTeoria();
        double nPracticas = notaPracticas();
        double notaCalculada = nTeoria * 0.7 +  nPracticas * 0.3;

        if(nTeoria < 3.5 || nPracticas < 3.5){
            if(notaCalculada < 4){
                return 4.0;
            }else{
                return notaCalculada;
            }
        }
        return notaCalculada;
    }
    public void mostrarDetalleNotas(){
        System.out.println(nombre + "(" + matricula + ")  NOTA FINAL:" + notaFinal());
        System.out.println("Teoria: " + notaTeoria());
        System.out.println("\tParcial 1: " + parcial1);
        System.out.println("\tParcial 2: " + parcial2);
        System.out.println("Practicas: " +  notaPracticas());
        System.out.println("\tPractica 2: " + notaPractica2());
        System.out.println("\t\tExamen: " + examenPr2);
        System.out.println("\t\tEntrega: " + entregaPr2);
        System.out.println("Practica 3: " + notaPractica3());
        System.out.println("\t\tExamen: " + examenPr3);
        System.out.println("\t\tEntrega: " + entregaPr3);

    }
}
