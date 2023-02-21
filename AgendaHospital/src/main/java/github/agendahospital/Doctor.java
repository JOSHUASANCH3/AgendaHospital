package github.agendahospital;

import java.time.LocalDate;

public class Doctor extends Persona {

    private String idDoctor;//identificador unico para el paciente
    private String especialidad;
    private String horaTrabajo;//Diurno, Nocturno, Matutino
    private String areaAtencion;

    //construcctores
    public Doctor() {
    }

    public Doctor(String idDoctor, String especialidad, String horaTrabajo, String areaAtencion) {
        this.idDoctor = idDoctor;
        this.especialidad = especialidad;
        this.horaTrabajo = horaTrabajo;
        this.areaAtencion = areaAtencion;
    }

    public Doctor(String especialidad, String horaTrabajo, String areaAtencion, String nombre, String apellido, int edad, String genero, String dirreccion, int telefono, String correoElectronico, LocalDate fechaNacimiento) {
        super(nombre, apellido, edad, genero, dirreccion, telefono, correoElectronico, fechaNacimiento);
        this.idDoctor = generarIdDoctor();
        this.especialidad = especialidad;
        this.horaTrabajo = horaTrabajo;
        this.areaAtencion = areaAtencion;
    }

    //getter and setter
    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

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
                + ", Nombre=" + this.getNombre()
                + ", Apellido=" + this.getApellido()
                + ", Edad=" + this.getEdad()
                + ", Genero=" + this.getGenero()
                + ", Dirreccion=" + this.getDirreccion()
                + ", Telefono=" + this.getTelefono()
                + ", Correo Electronico=" + this.getCorreoElectronico()
                + ", Fecha de Nacimiento=" + this.getFechaNacimiento();
    }

    //generador de ID
    public String generarIdDoctor() {
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
