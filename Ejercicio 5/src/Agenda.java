public class Agenda {
    String mes;
    Cita[] citas;
    int numeroCitas;

    public Agenda (String mes, int maximoCitas){
        this.mes = mes;
        this.citas = new Cita[maximoCitas];
        this.numeroCitas = 0;
    }
    public Agenda(String mes){
        this.mes = mes;
        this.citas = new Cita[50];
        this.numeroCitas = 0;
    }

    public boolean insertarCita(Cita cita){
        if(numeroCitas < citas.length){
            citas[numeroCitas] = cita;
            numeroCitas++;
            return true;
        }
        return false;
    }
    public boolean eliminarCita (int posicion){
        if(posicion >=1 && posicion <= numeroCitas){
            int indiceReal = posicion - 1;
            for(int i=indiceReal; i<numeroCitas-1; i++){
                citas[i] = citas[i+1];
            }
            citas[numeroCitas - 1] = null;
            numeroCitas--;
            return true;
        }
        return false;
    }
    public int numeroCitasPaciente(String paciente){
        int contador = 0;
        for (int i=0; i<numeroCitas;i++){
            if(citas[i].getPaciente().equals(paciente)){
                contador++;
            }
        }
        return contador;
    }
    public void mostrarAgenda(){
        System.out.println(mes + "(" + numeroCitas + ")");
        for(int i=0; i<numeroCitas; i++){
            System.out.println((i+1) +". " +citas[i].toString());
        }
    }
    public void mostrarCitasDia(int dia){
        System.out.println(dia + " de " + mes);
        for(int i=0; i<numeroCitas; i++){
            System.out.println((i+1) +". " +citas[i].toString());
        }
    }
}
