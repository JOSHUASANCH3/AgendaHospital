package github.agendahospital;

import java.time.LocalDate;//para usar la fecha de calendario

public class Paciente extends Persona {
    private String idPaciente;//identificador unico para el paciente
    private LocalDate fechaAdmision;
    
    //constructores
    public Paciente() {
    }

    public Paciente(LocalDate fechaAdmision) {
        this.fechaAdmision = fechaAdmision;
    }

    public Paciente(LocalDate fechaAdmision, String nombre, String apellido, int edad, String genero, String dirreccion, int telefono, String correoElectronico, LocalDate fechaNacimiento) {
        super(nombre, apellido, edad, genero, dirreccion, telefono, correoElectronico, fechaNacimiento);
        this.fechaAdmision = fechaAdmision;
    }
    
    //getter and setter

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    public String getIdPaciente() {
        return idPaciente;
    }

    public LocalDate getFechaAdmision() {
        return fechaAdmision;
    }

    public void setFechaAdmision(LocalDate fechaAdmision) {
        this.fechaAdmision = fechaAdmision;
    }
    

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + this.getIdPaciente()
                + ", fechaAdmision=" + this.getFechaAdmision()
                + ", Nombre="+ this.getNombre()
                + ", Apellido="+ this.getApellido()
                + ", Edad="+ this.getEdad()
                + ", Genero="+ this.getGenero()
                + ", Dirreccion="+ this.getDirreccion()
                + ", Telefono="+ this.getTelefono()
                + ", Correo Electronico="+ this.getCorreoElectronico()
                + ", Fecha de Nacimiento="+ this.getFechaNacimiento();
    }
    
    //generador de ID --- utilizar equals para tener relacion de datos
    public String generarIdPaciente() {
        String Nombre = getNombre().substring(0, Math.min(getNombre().length(), 3)).toUpperCase();
        String Apellido = getApellido().substring(0, Math.min(getApellido().length(), 3)).toUpperCase();
        String primerasTresLetrasNombre = Nombre + Apellido;
        String yearNacimiento = String.valueOf(getFechaNacimiento().getYear());
        String mesNacimiento = String.format("%02d", getFechaNacimiento().getMonthValue());
        String diaNacimiento = String.format("%02d", getFechaNacimiento().getDayOfMonth());
        String primerasLetrasGenero = getGenero().substring(0, Math.min(getGenero().length(), 3)).toUpperCase();
        return primerasTresLetrasNombre + yearNacimiento + mesNacimiento + diaNacimiento + primerasLetrasGenero;
    }

}
