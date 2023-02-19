package github.agendahospital;

import java.time.LocalDate;

public class Consulta {
    private String idConsulta;
    private LocalDate fecha;
    private String receta;
    private String tratamiento;
    private String diagnostico;
    
    //consructores
    public Consulta() {
    }

    public Consulta(LocalDate fecha, String receta, String tratamiento, String diagnostico) {
        this.fecha = fecha;
        this.receta = receta;
        this.tratamiento = tratamiento;
        this.diagnostico = diagnostico;
    }
        
    //getter and setter
    public String getIdConsulta() {
        return idConsulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.tratamiento = Tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.diagnostico = Diagnostico;
    }
    
    //toString()
    @Override
    public String toString() {
        return "Consulta{" + "idConsulta=" + this.getIdConsulta()
                + ", Fecha=" + this.getFecha()
                + ", Receta=" + this.getReceta()
                + ", Tratamiento=" + this.getTratamiento()
                + ", Diagnostico=" + this.getDiagnostico() + '}';
    }

    //Id de consulta
    public String generarIdConsulta() {
        String Nombre = getTratamiento().substring(0, Math.min(getTratamiento().length(), 3)).toUpperCase();
        String Apellido = getDiagnostico().substring(0, Math.min(getDiagnostico().length(), 3)).toUpperCase();
        String primerasTresLetrasNombre = Nombre + Apellido;
        String yearNacimiento = String.valueOf(getFecha().getYear());
        String mesNacimiento = String.format("%02d", getFecha().getMonthValue());
        String diaNacimiento = String.format("%02d", getFecha().getDayOfMonth());
        String primerasLetrasGenero = getReceta().substring(0, Math.min(getReceta().length(), 3)).toUpperCase();
        return primerasTresLetrasNombre + yearNacimiento + mesNacimiento + diaNacimiento + primerasLetrasGenero;
    }
}
