package github.agendahospital;

import java.time.LocalDate;//para usar la fecha de calendario

public class Paciente extends Persona {

    private String idPaciente;//identificador unico para el paciente
    private LocalDate fechaAdmision = LocalDate.EPOCH;

    //constructores
    public Paciente() {
    }

    public Paciente(String idPaciente, LocalDate fechaAdmision) {
        this.idPaciente = idPaciente;
        this.fechaAdmision = fechaAdmision;
    }

    public Paciente(LocalDate fechaAdmision, String nombre, String apellido, int edad, String genero, String dirreccion, int telefono, String correoElectronico, LocalDate fechaNacimiento) {
        super(nombre, apellido, edad, genero, dirreccion, telefono, correoElectronico, fechaNacimiento);
        this.idPaciente = generarIdPaciente();
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

    //metodo toString
    @Override
    public String toString() {
        return "Paciente: " + "idPaciente: " + this.getIdPaciente()
                + ", Nombre: " + this.getNombre()
                + ", Apellido: " + this.getApellido()
                + ", Edad: " + this.getEdad()
                + ", Genero: " + this.getGenero()
                + ", Dirreccion: " + this.getDirreccion()
                + ", Telefono: " + this.getTelefono()
                + ", Correo Electronico: " + this.getCorreoElectronico()
                + ", Fecha de Nacimiento: " + this.getFechaNacimiento()
                + ", Fecha de Admision: " + this.getFechaAdmision();
    }

    //generador de ID --- utilizar equals para tener relacion de datos
    public String generarIdPaciente() {
        String Nombre = "", Apellido = "", yearNacimiento = "", mesNacimiento = "", diaNacimiento = "", primerasLetrasGenero = "";
        if (getFechaNacimiento() != null)
        {
            Nombre = getNombre().substring(0, Math.min(getNombre().length(), 3)).toUpperCase();
            Apellido = getApellido().substring(0, Math.min(getApellido().length(), 3)).toUpperCase();
            yearNacimiento = String.valueOf(getFechaNacimiento().getYear());
            mesNacimiento = String.format("%02d", getFechaNacimiento().getMonthValue());
            diaNacimiento = String.format("%02d", getFechaNacimiento().getDayOfMonth());
            primerasLetrasGenero = getGenero().substring(0, Math.min(getGenero().length(), 3)).toUpperCase();
        }
        return Nombre + Apellido + yearNacimiento + mesNacimiento + diaNacimiento + primerasLetrasGenero;
    }

}
