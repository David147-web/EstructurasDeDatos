public class Aplicacion {
    public static void main(String[] args){
        Fichero archivo = new Fichero("ED.txt");
        Asignatura ed = new Asignatura("Estructuras de datos", 100);

        String[] datos = archivo.leerDatos();
        while (datos != null){
            String nombre = datos[0];
            String matricula = datos[1];

            double[] notas = archivo.leerNotas();
            if(notas == null) break;

            Alumno nuevoAlumno = new Alumno(nombre, matricula);
            nuevoAlumno.calificarParcial1(notas[0]);
            nuevoAlumno.calificarPractica2(notas[1], notas[2]);
            nuevoAlumno.calificarParcial2(notas[3]);
            nuevoAlumno.calificarPractica3(notas[4], notas[5]);

            ed.insertar(nuevoAlumno);
            datos = archivo.leerDatos();
        }

        if (ed.getNumAlumnos() > 0){
            ed.verCalificaciones();

            System.out.println("Numero de aprobados: " + ed.aprobados());
            System.out.println("Porcentaje de aprobados: "+ ed.porcentajeAprobados() +"%");
            System.out.println("La media de las calificaciones es: " + ed.mediaCalificaciones());
            Alumno mejor = ed.alumnoMayorNota();
            System.out.println("El alumno con mayor nota es: " + mejor.getNombre() + ". Con una nota de:" + mejor.notaFinal());

            Alumno[] aprobados = ed.alumnosAprobados();
            for (Alumno aprobado : aprobados) {
                aprobado.mostrarDetalleNotas();
            }

            String matriculaBuscada = "ab1234";
            Alumno buscado = ed.getAlumno(matriculaBuscada);
            if(buscado != null){
                buscado.mostrarDetalleNotas();
            }else{
                System.out.println("El alumno con matricula "+ matriculaBuscada + " no existe en la asignatura");
            }

        }
    }
}
