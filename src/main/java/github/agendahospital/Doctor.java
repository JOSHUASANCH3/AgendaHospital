package github.agendahospital;

import java.time.LocalDate;

public class Doctor extends Persona{
    private String idDoctor = generarIdDoctor();//identificador unico para el paciente
    private String especialidad;
    private String horaTrabajo;
    private String areaAtencion;

    //construcctores
    public Doctor() {
    }

    public Doctor(String IdDoctor, String especialidad, String horaTrabajo, String areaAtencion) {
        this.idDoctor = IdDoctor;
        this.especialidad = especialidad;
        this.horaTrabajo = horaTrabajo;
        this.areaAtencion = areaAtencion;
    }

    public Doctor(String especialidad, String horaTrabajo, String areaAtencion) {
        this.especialidad = especialidad;
        this.horaTrabajo = horaTrabajo;
        this.areaAtencion = areaAtencion;
    }

    public Doctor(String especialidad, String horaTrabajo, String areaAtencion, String nombre, String apellido, int edad, String genero, String dirreccion, int telefono, String correoElectronico, LocalDate fechaNacimiento) {
        super(nombre, apellido, edad, genero, dirreccion, telefono, correoElectronico, fechaNacimiento);
        this.especialidad = especialidad;
        this.horaTrabajo = horaTrabajo;
        this.areaAtencion = areaAtencion;
    }

    //getter and setter

    public String getIdDoctor() {
        return idDoctor;
    }
        
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHoraTrabajo() {
        return horaTrabajo;
    }

    public void setHoraTrabajo(String horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }

    public String getAreaAtencion() {
        return areaAtencion;
    }

    public void setAreaAtencion(String areaAtencion) {
        this.areaAtencion = areaAtencion;
    }
    
    //toString
    @Override
    public String toString() {
        return "Doctor{" + "idDoctor=" + this.getIdDoctor()
                + ", Nombre="+ this.getNombre()
                + ", Apellido="+ this.getApellido()
                + ", Edad="+ this.getEdad()
                + ", Genero="+ this.getGenero()
                + ", Dirreccion="+ this.getDirreccion()
                + ", Telefono="+ this.getTelefono()
                + ", Correo Electronico="+ this.getCorreoElectronico()
                + ", Fecha de Nacimiento="+ this.getFechaNacimiento();
    }
    
    //generador de ID
    public String generarIdDoctor() {
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
