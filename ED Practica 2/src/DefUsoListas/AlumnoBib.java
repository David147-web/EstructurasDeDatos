/**
 * David Martin Yanguas
 * */

package DefUsoListas;

import java.util.LinkedList;
import java.util.Iterator;

public class AlumnoBib {

	private String nombre;
	private int matricula;
	private LinkedList<Evaluacion> expediente;

	public AlumnoBib(String nombre, int matricula) {
		this.nombre = nombre;
		this.matricula = matricula;
		expediente = new LinkedList<Evaluacion>();
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
		Iterator<Evaluacion> iterador = expediente.iterator();

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
		expediente.add(evaluacion);
		return true;
	}

	public boolean estaAprobado(String nombreAsig) {
		Iterator<Evaluacion> iterador = expediente.iterator();
		while(iterador.hasNext()){
			Evaluacion evaluacion = iterador.next();
			if(evaluacion.getNombreAsignatura().equals(nombreAsig) && evaluacion.getNota()>=5){
				return true;
			}
		}
		return false;
	}

	public LinkedList<Evaluacion> asignaturasAprobadas() {
		Iterator<Evaluacion> iterador = expediente.iterator();
		LinkedList<Evaluacion> aprobadas = new LinkedList<Evaluacion>();

		while(iterador.hasNext()){
			Evaluacion evaluacion = iterador.next();
			if(evaluacion.getNota()>=5){
				aprobadas.add(evaluacion);
			}
		}
		return aprobadas;
	}

	public double mediaAprobadas() {
		LinkedList<Evaluacion> aprobadas = this.asignaturasAprobadas();
		Iterator<Evaluacion> iterador = aprobadas.iterator();
		double suma = 0.0;
		if(aprobadas.isEmpty()){
			return 0.0;
		}
		while(iterador.hasNext()){
			Evaluacion evaluacion=iterador.next();
			suma += evaluacion.getNota();
		}
		return suma/aprobadas.size();
	}

	public int getNumAprobadas() {
		LinkedList<Evaluacion> aprobadas = this.asignaturasAprobadas();
		int contador = 0;
		Iterator<Evaluacion> iterador = aprobadas.iterator();

		while(iterador.hasNext()){
			iterador.next();
			contador++;
		}
		return contador;  // Eliminar esta línea
	}

	public void mostrar() {
		System.out.println(nombre + ". " + "Matricula: " + matricula);
		Iterator<Evaluacion> iterador = expediente.iterator();
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


