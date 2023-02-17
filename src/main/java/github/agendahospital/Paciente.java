package github.agendahospital;

import java.time.LocalDate;//para usar la fecha de calendario

public class Paciente extends Persona {
    private String idPaciente;//identificador unico para el paciente
    private LocalDate fechaAdmision;
    private String enfermedad;
    private String sintomas;
    private LocalDate fechaNacimiento;

    public Paciente() {
    }

    //constructores
    
    
    
    
    //generador de ID
    public String generarIdPaciente(String nombre, LocalDate fechaNacimiento, String genero) {
        String primerasTresLetrasNombre = nombre.substring(0, Math.min(nombre.length(), 3)).toUpperCase();
        String yearNacimiento = String.valueOf(fechaNacimiento.getYear());
        String mesNacimiento = String.format("%02d", fechaNacimiento.getMonthValue());
        String diaNacimiento = String.format("%02d", fechaNacimiento.getDayOfMonth());
        String primerasLetrasGenero = genero.substring(0, Math.min(genero.length(), 3)).toUpperCase();
        return primerasTresLetrasNombre + yearNacimiento + mesNacimiento + diaNacimiento + primerasLetrasGenero;
    }

}
