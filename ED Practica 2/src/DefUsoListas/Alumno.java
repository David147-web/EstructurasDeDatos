/**
 * David Martin Yanguas
 * */

package DefUsoListas;

public class Alumno {

	private String nombre;
	private int matricula;
	private Lista expediente;

	public Alumno(String nombre, int matricula) {
		this.nombre = nombre;
		this.matricula = matricula;
		expediente = new Lista();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean nuevaEvaluacion(Evaluacion evaluacion) {
		Iterador iterador = expediente.getIterador();

		while(iterador.hasNext()){
			Evaluacion ev = iterador.next();
			if(ev.mismaEvaluacion(evaluacion)){
				if(ev.getNota() == evaluacion.getNota()){
					return true;
				}
				else{
					System.out.println("Calificacion previamente insertada con nota: " + ev.getNota());
					return false;
				}
			}

		}
		expediente.insertar(evaluacion);
		return true;
	}

	public boolean estaAprobado(String nombreAsig) {
		Iterador iterador = expediente.getIterador();
		while(iterador.hasNext()){
			Evaluacion evaluacion = iterador.next();
			if(evaluacion.getNombreAsignatura().equals(nombreAsig) && evaluacion.getNota()>=5){
				return true;
			}
		}
		return false;
	}

	public Lista asignaturasAprobadas() {
		Iterador iterador = expediente.getIterador();
		Lista aprobadas = new Lista();

		while(iterador.hasNext()){
			Evaluacion evaluacion = iterador.next();
			if(evaluacion.getNota()>=5){
				aprobadas.insertar(evaluacion);
			}
		}
		return aprobadas;
	}

	public double mediaAprobadas() {
		Lista aprobadas = this.asignaturasAprobadas();
		Iterador iterador = aprobadas.getIterador();
		double suma = 0.0;
		if(aprobadas.vacia()){
			return 0.0;
		}
		while(iterador.hasNext()){
			Evaluacion evaluacion=iterador.next();
			suma += evaluacion.getNota();
		}
		return suma/aprobadas.getNumElementos();
	}

	public int getNumAprobadas() {
		Lista aprobadas = this.asignaturasAprobadas();
		int contador = 0;
		Iterador iterador = aprobadas.getIterador();

		while(iterador.hasNext()){
			iterador.next();
			contador++;
		}
		return contador;  // Eliminar esta línea
	}

	public void mostrar() {
		System.out.println(nombre + ". " + "Matricula: " + matricula);
		Iterador iterador = expediente.getIterador();
		if(!iterador.hasNext()){
			System.out.println("No ha realizado ninguna evaluacion.");
		}else{
			int totalEvaluaciones = 0;
			while(iterador.hasNext()){
				Evaluacion evaluacion = iterador.next();
				evaluacion.mostrar();
				totalEvaluaciones++;
			}
			int aprobadas = this.getNumAprobadas();
			double media = this.mediaAprobadas();
			System.out.println(totalEvaluaciones+" evaluaciones y " + aprobadas + " asignaturas aprobadas con calificacion media "+ media);
		}
	}

}


