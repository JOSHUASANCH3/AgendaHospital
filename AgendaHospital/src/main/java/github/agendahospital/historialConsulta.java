package github.agendahospital;

public class historialConsulta {

    private String idHistorialConsulta;
    private Paciente paciente;
    private Doctor doctor;
    private Consulta consulta;

    //constructor
    public historialConsulta() {
    }
    
    public String getIdHistorialConsulta() {
        return idHistorialConsulta;
    }

    //getter and setter
    public void setIdHistorialConsulta(String idHistorialConsulta) {    
        this.idHistorialConsulta = idHistorialConsulta;
    }

    public String getIdPaciente() {
        return paciente.getIdPaciente();
    }

    public String getIdDoctor() {
        return doctor.getIdDoctor();
    }
    
    public String getIdConsulta() {
        return consulta.getIdConsulta();
    }

}
