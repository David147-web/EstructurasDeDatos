public class Cita {
    String paciente, telefono;
    int dia, hora, minuto;

    public Cita (String paciente, String telefono, int dia, int hora, int minuto){
        this.paciente = paciente;
        this.telefono = telefono;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getPaciente(){
        return paciente;
    }
    public int getDia(){
        return dia;
    }
    public String toString(){
        return paciente + " (" + telefono +") - " + dia + ", " + hora + ":" + minuto;
    }
}
