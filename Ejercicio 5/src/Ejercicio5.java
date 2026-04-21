public class Ejercicio5 {
    public static void main (String[] args){
        Cita cita1 = new Cita("Carlos Ruiz", "555-1234", 12, 10, 30);
        Cita cita2 = new Cita("Laura Gomez", "555-8765", 12, 11, 0);
        Cita cita3 = new Cita("Pepito Gimenez", "555-6767", 25, 17, 15);

        Agenda miAgenda = new Agenda("Noviembre");
        miAgenda.insertarCita(cita1);
        miAgenda.insertarCita(cita2);
        miAgenda.insertarCita(cita3);

        System.out.println("AGENDA INICIAL:");
        miAgenda.mostrarAgenda();

        System.out.println("Eliminada cita 2:");
        miAgenda.eliminarCita(2);
        miAgenda.mostrarAgenda();

        System.out.println("Citas del dia 25:");
        miAgenda.mostrarCitasDia(25);

        String pacienteBuscado = "Pepito Gimenez";
        int numeroCitas = miAgenda.numeroCitasPaciente(pacienteBuscado);
        System.out.println("El paciente " + pacienteBuscado + " tiene "+ numeroCitas +" cita(s)");


    }
}
