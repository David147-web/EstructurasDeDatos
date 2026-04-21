public class Asignatura {
    private String nombre;
    private Alumno[] alumnos;
    private int numAlumnos;

    public Asignatura(String nombreAsignatura, int maxAlumnos){
        this.nombre = nombreAsignatura;
        this.alumnos = new Alumno[maxAlumnos];
        this.numAlumnos = 0;
    }
    public Asignatura(String nombreAsignatura){
        this.nombre = nombreAsignatura;
        this.alumnos = new Alumno[50];
        this.numAlumnos = 0;
    }

    public boolean insertar(Alumno alumno){
        if(numAlumnos < alumnos.length){
            alumnos[numAlumnos] = alumno;
            numAlumnos++;
            return true;
        }
        return false;

    }
    public int getNumAlumnos(){
        return numAlumnos;
    }
    public void verCalificaciones(){
        System.out.println(nombre + ": " + numAlumnos);
        for (int i=0; i<numAlumnos; i++){
            System.out.println("\t" + alumnos[i].getNombre() + "(" + alumnos[i].getMatricula() + ") NOTA: " + alumnos[i].notaFinal());
        }
    }
    public int aprobados(){
        int cuenta = 0;
        for (int i=0; i<numAlumnos; i++){
            if(alumnos[i].notaFinal() >= 5){
                cuenta++;
            }
        }
        return cuenta;
    }
    public double porcentajeAprobados(){
        return (aprobados()/ (double) numAlumnos) * 100;
    }
    public double mediaCalificaciones(){
        double suma = 0;
        for (int i=0; i<numAlumnos; i++){
            suma += alumnos[i].notaFinal();
        }
        return suma/numAlumnos;
    }
    public Alumno alumnoMayorNota(){
        Alumno mejor = alumnos[0];
        for (int i=1; i<numAlumnos; i++){
            if(alumnos[i].notaFinal() > mejor.notaFinal()){
                mejor = alumnos[i];
            }
        }
        return mejor;
    }
    public Alumno[] alumnosAprobados(){
        Alumno[] listaAprobados = new Alumno[aprobados()];
        int indice = 0;
        for(int i=0; i<numAlumnos; i++){
            if(alumnos[i].notaFinal() >= 5){
                listaAprobados[indice] = alumnos[i];
                indice++;
            }
        }
        return listaAprobados;
    }
    public Alumno getAlumno(String matricula){
        for (int i=0; i<numAlumnos; i++){
            if(alumnos[i].getMatricula().equals(matricula)){
                return alumnos[i];
            }
        }
        return null;
    }

}
