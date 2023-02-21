package github.agendahospital;

import java.time.LocalDate;

public class historialPaciente {
    private String idHistorialMedico;//Identificador unico para el historial medico
    private Paciente paciente;
    private Doctor doctor;
    private Consulta consulta;
    
    //constructores

    public historialPaciente() {
    }

    public historialPaciente(String idHistorialMedico, Paciente paciente, Doctor doctor, Consulta consulta) {
        this.idHistorialMedico = idHistorialMedico;
        this.paciente = paciente;
        this.doctor = doctor;
        this.consulta = consulta;
    }
    
    //getter and setter

    public String getIdHistorialMedico() {
        return idHistorialMedico;
    }

    public void setIdHistorialMedico(String idHistorialMedico) {
        this.idHistorialMedico = idHistorialMedico;
    }
    
    public String getPaciente() {
        return paciente.getIdPaciente();
    }
    
    public String getNombrePaciente(){
        return paciente.getNombre() + " " + paciente.getApellido();
    }
    
    public String getDoctor(){
        return doctor.getIdDoctor();
    }
    
    public String getNombreDoctor(){
        return doctor.getNombre() + " " + paciente.getApellido();
    }
    
    public String getConsulta(){
        return consulta.getIdConsulta();
    }
    
    public LocalDate getFecha(){
        return consulta.getFecha();
    }
    
    public String getTratamiento(){
        return consulta.getIdConsulta();
    }
    
    public String getDiagnostico(){
        return consulta.getDiagnostico();
    }
    
    
    //id de historial
    public String generarIdHistorial() {
        String nombrePaciente = paciente.getNombre().substring(0, Math.min(paciente.getNombre().length(), 3)).toUpperCase();
        String nombreDoctor = doctor.getNombre().substring(0, Math.min(doctor.getNombre().length(), 3)).toUpperCase();
        String apellidoPaciente = paciente.getApellido().substring(0, Math.min(paciente.getApellido().length(), 3)).toUpperCase();
        String apellidoDoctor = doctor.getApellido().substring(0, Math.min(doctor.getApellido().length(), 3)).toUpperCase();
        String primerasTresLetrasNombre = nombrePaciente + apellidoPaciente +nombreDoctor + apellidoDoctor;
        String primerasLetrasGenero = paciente.getGenero().substring(0, Math.min(paciente.getGenero().length(), 3)).toUpperCase();
        return primerasTresLetrasNombre + primerasLetrasGenero;
    }
    
}
