package github.agendahospital;

import java.util.ArrayList;

public class Consultorio {

    private ArrayList<Paciente> pacientes;
    private ArrayList<Doctor> doctores;
    private ArrayList<Consulta> consultas;

    public Consultorio() {
        pacientes = new ArrayList<>();
        doctores = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    // Metodos para buscar pacientes
    public Persona buscarPaciente(ArrayList<Persona> personas, String id) {
        for (Persona persona : personas)
        {
            if (persona instanceof Paciente && ((Paciente) persona).getIdPaciente().equals(id))
            {
                return persona;
            }
        }
        return null;
    }

    public Persona buscarDoctor(ArrayList<Persona> personas, String id) {
        for (Persona persona : personas)
        {
            if (persona instanceof Doctor && ((Doctor) persona).getIdDoctor().equals(id))
            {
                return persona;
            }
        }
        return null;
    }

    public Consulta buscarConsulta(ArrayList<Consulta> consultas, String id) {
        for (Consulta consulta : consultas)
        {
            if (consulta.getIdConsulta().equals(id))
            {
                return consulta;
            }
        }
        return null;
    }
    
    //Metodos para eliminar pacientes, doctores, consulta
}
