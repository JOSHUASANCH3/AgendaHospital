package github.agendahospital;

import java.time.LocalDate;

public class Persona {
    //Atributos de persona
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private String dirreccion;
    private int telefono;
    private String correoElectronico;
    private LocalDate fechaNacimiento;

    //constructor vacio
    public Persona() {
    }
    
    //constructor inicializado

    public Persona(String nombre, String apellido, int edad, String genero, String dirreccion, int telefono, String correoElectronico, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.dirreccion = dirreccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
    }
    

    //getter and setter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre;}
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getGenero() {return genero; }
    public void setGenero(String genero) {this.genero = genero; }
    public String getDirreccion() { return dirreccion; }
    public void setDirreccion(String dirreccion) {this.dirreccion = dirreccion; }
    public int getTelefono() {return telefono; }
    public void setTelefono(int telefono) {this.telefono = telefono; }
    public String getCorreoElectronico() {return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    //Utilizar metodos de Bandera para realizar la validacion de variables
    public boolean validarGenero(String genero) {
        return genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino");
    }
    
    public boolean validarCorreoElectronico(String correoElectronico) {
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return correoElectronico.matches(expresionRegular);
    }
    
    public boolean validarEdad(int edad) {
        return edad >= 0 && edad <= 100;
    }

    
}
