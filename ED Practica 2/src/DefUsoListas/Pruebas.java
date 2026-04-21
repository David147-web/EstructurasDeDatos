/**
 * David Martin Yanguas
 * */

package DefUsoListas;

public class Pruebas {

    public static void main(String[] args) {
        Lista listaEv = new Lista();
        System.out.println("********** PRUEBAS **********");
        Evaluacion evaluacion1 = new Evaluacion("ED", "Junio 19", 4.5);
        Evaluacion evaluacion2 = new Evaluacion("ED", "Julio 19", -1);
        Evaluacion evaluacion3 = new Evaluacion("ED", "Junio 20", 7.4);
        Evaluacion evaluacion4 = new Evaluacion("Algebra", "Junio 18", 6.4);


        listaEv.insertar(evaluacion1);
        listaEv.insertar(evaluacion2);
        listaEv.insertar(evaluacion3);
        listaEv.insertar(evaluacion4);

        Iterador it = listaEv.getIterador();
        while (it.hasNext()){
            Evaluacion ev = it.next();
            ev.mostrar();
        }

        System.out.println("Convocatorias en ED: "+ listaEv.numConvocatorias("ED"));
        System.out.println("Convocatorias en Algebra: "+ listaEv.numConvocatorias("Algebra"));
        System.out.println("Convocatorias en Fundamentos de Programacion: "+ listaEv.numConvocatorias("Fundamentos de Programacion"));

        Alumno alumno1 = new Alumno("Felipe Garcia Gomez", 1253);
        Alumno alumno2 = new Alumno("Alicia Blazquez Martin", 5622);


        alumno1.nuevaEvaluacion(evaluacion1);
        alumno1.nuevaEvaluacion(evaluacion2);
        alumno1.nuevaEvaluacion(evaluacion3);
        alumno1.nuevaEvaluacion(evaluacion4);
        alumno1.nuevaEvaluacion(new Evaluacion("ED", "Junio 20", 3));

        System.out.println("Asignaturas aprobadas por " + alumno1.getNombre());
        Lista aprobadasAlumno1 = alumno1.asignaturasAprobadas();
        Iterador iterador1 = aprobadasAlumno1.getIterador();
        while(iterador1.hasNext()){
            iterador1.next().mostrar();
        }

        System.out.println("Asignaturas aprobadas por " + alumno2.getNombre());
        Lista aprobadasAlumno2 = alumno2.asignaturasAprobadas();
        Iterador iterador2 = aprobadasAlumno2.getIterador();
        while(iterador2.hasNext()){
            iterador2.next().mostrar();
        }

        System.out.println("MOSTRAR LOS ALUMNOS");
        alumno1.mostrar();
        alumno2.mostrar();

        AlumnoBib alumno3 = new AlumnoBib("Eduardo Parra Martin", 8765);
        AlumnoBib alumno4 = new AlumnoBib("Sonia Torres Pardo", 2345);

        alumno3.nuevaEvaluacion(evaluacion1);
        alumno3.nuevaEvaluacion(evaluacion2);
        alumno3.nuevaEvaluacion(evaluacion3);
        alumno3.nuevaEvaluacion(evaluacion4);

        System.out.println("MOSTRAR ALUMNOS BIBLIOTECA");
        alumno3.mostrar();
        alumno4.mostrar();


    }
}
