package github.agendahospital;

public class historialDoctor {
    private String idHistorialMedico = generarIdHistorial();//Identificador unico para el historial medico
    private Paciente paciente;
    private Doctor doctor;
    private Consulta consulta;
    
    //constructores

    public historialDoctor() {
    }

    public historialDoctor(Paciente paciente, Doctor doctor, Consulta consulta) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.consulta = consulta;
    }
    
    //getter and setter
    public String getPaciente() {
        return paciente.getIdPaciente();
    }
    
    public String getDoctor(){
        return doctor.getIdDoctor();
    }
    
    public String getConsulta(){
        return consulta.getIdConsulta();
    }
    
    public String getNombrePaciente(){
        return consulta.getIdConsulta();
    }
    
    public String getNombreDoctor(){
        return consulta.getIdConsulta();
    }
    
    public String getTratamiento(){
        return consulta.getIdConsulta();
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
