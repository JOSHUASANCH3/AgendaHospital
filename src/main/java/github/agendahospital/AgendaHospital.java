package github.agendahospital;

import com.sun.source.tree.Tree;
import java.time.LocalDate;
import java.util.Scanner;

public class AgendaHospital {

    public static void main(String[] args) {
        //Consola de gestion para el programa si asi que se puede llamar
        Scanner cin = new Scanner(System.in);
        Paciente paciente = new Paciente(LocalDate.EPOCH, "Julio", "Sanchez", 25, "Masculino", "Managua", 15015416, "jokayou3@gmail.com", LocalDate.now());
        Doctor doctor = new Doctor();
        Consulta consulta = new Consulta();
        Persona persona = new Persona();
        int inCase = 0;
        do
        {
            System.out.println("*******     Menu     *******");
            System.out.println("""
                           1.Registrar Paciente
                           1.Registrar Consulta
                           2.Registrar Doctor
                           3.----opcion no desarrollada
                           4.----opcion no desarrollada
                           5.Eliminar datos
                           0.Salir del sistema""");
            inCase = Integer.parseInt(cin.nextLine());
            switch (inCase)
            {
                case 1:
                    while (inCase != 0)
                    {
                        System.out.println("Ingrese el Nombre del Paciente");
                        paciente.setNombre(cin.nextLine());
                        System.out.println("Ingrese el Apellido del Paciente");
                        paciente.setApellido(cin.nextLine());
                        System.out.println("Ingrese el Edad del Paciente");
                        paciente.setEdad(cin.nextInt());
                        System.out.println("Ingrese el Genero del Paciente");
                        paciente.setGenero(cin.next());
                        System.out.println("Ingrese el Dirrecion del Paciente");
                        paciente.setDirreccion(cin.next());
                        System.out.println("Ingrese el Telefono del Paciente");
                        paciente.setTelefono(cin.nextInt());
                        System.out.println("Ingrese el Correo Electronico del Paciente");
                        paciente.setCorreoElectronico(cin.next());
                        System.out.println("Ingrese el Fecha de Nacimiento del Paciente");
                        int year, mount, day;
                        System.out.println("Ingrese el Año");
                        year = cin.nextInt();
                        System.out.println("Ingrese el Mes");
                        mount = cin.nextInt();
                        System.out.println("Ingrese el Dia");
                        day = cin.nextInt();
                        paciente.setFechaNacimiento(LocalDate.of(year, mount, day));
                        //generar ID de paciente
                        paciente.setIdPaciente(paciente.generarIdPaciente());
                        System.out.println("ID del paciente: " + paciente.getIdPaciente());
                        System.out.println("Gracias por registrar un Paciente"
                                + "\nDesea Ingresar otro Paciente"
                                + "\n1.Si"
                                + "\n0.No");
                        inCase = Integer.parseInt(cin.nextLine());
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (inCase == 0);
    }

}
