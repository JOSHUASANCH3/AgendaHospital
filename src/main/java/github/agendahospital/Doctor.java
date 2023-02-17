package github.agendahospital;

import java.time.LocalDate;

public class Doctor extends Persona{
    private int idDoctor;//identificador unico para el doctor
    private String especialidad;
    private LocalDate fechaInicio;
    private String horaTrabajo;
    private String areaAtencion;

    public Doctor() {
    }

    
    
    //generador de ID
    public String generarIdPaciente(String nombre, LocalDate fechaInicio, String genero) {
        String primerasTresLetrasNombre = nombre.substring(0, Math.min(nombre.length(), 3)).toUpperCase();
        String yearNacimiento = String.valueOf(fechaInicio.getYear());
        String mesNacimiento = String.format("%02d", fechaInicio.getMonthValue());
        String diaNacimiento = String.format("%02d", fechaInicio.getDayOfMonth());
        String primerasLetrasGenero = genero.substring(0, Math.min(genero.length(), 3)).toUpperCase();
        return primerasTresLetrasNombre + yearNacimiento + mesNacimiento + diaNacimiento + primerasLetrasGenero;
    }
    
}
