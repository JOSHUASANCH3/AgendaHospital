package github.agendahospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaHospital {

    public static void main(String[] args) {
        //Consola de gestion para el programa si asi que se puede llamar
        Scanner cin = new Scanner(System.in);//entrada de datos
        Paciente paciente = new Paciente();
        Doctor doctor = new Doctor();
        Consulta consulta = new Consulta();
        Paciente pConstructor = new Paciente(paciente.getIdPaciente(),LocalDate.now(), "Julio", "Sanchez", 25, "Masculino", "Managua", 15015416, "jokayou3@gmail.com", LocalDate.now());
        Doctor dContructor = new Doctor(doctor.getIdDoctor(), "Pediatria", "Matutino", "Emergencia", "Ramiro", "Reyes", 31, "Masculino", "Managua", 15489646, "doctor@gmail.com", LocalDate.now());
        Consulta cContructor = new Consulta(consulta.getIdConsulta(), LocalDate.now(), "Acetaminofen", "Tomar 7 dias", "Calentura");
        List addInfoPaciente = new ArrayList<>();
        List addInfoDoctor = new ArrayList<>();
        List addInfoConsulta = new ArrayList<>();
        addInfoPaciente.add(pConstructor);
        addInfoDoctor.add(dContructor);
        addInfoConsulta.add(cContructor);
        int inCase = 0;
        do
        {
            System.out.println("""
                           *******     Menu     *******    
                           1.Registrar Datos
                           2.Mostrar Datos
                           3.Buscar Datos    
                           4.Eliminar Datos
                           5.Cambiar Datos
                           6.Opciones a desarrollar?Building    
                           0.Salir del sistema""");
            inCase = Integer.parseInt(cin.nextLine());
            switch (inCase)
            {
                case 1:
                    System.out.println("""
                                       *******     Menu     *******
                                       1.Registrar Paciente
                                       2.Registrar Doctor
                                       3.Registrar Consulta
                                       0.Salir""");
                    inCase = Integer.parseInt(cin.nextLine());
                    switch (inCase)
                    {
                        case 1:
                            System.out.println("INGRESE LOS DATOS DEL PACIENTE");
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
                                paciente.setFechaAdmision(LocalDate.now());
                                //generar ID de paciente
                                paciente.setIdPaciente(paciente.generarIdPaciente());
                                System.out.println("ID del paciente: " + paciente.getIdPaciente());
                                addInfoPaciente.add(paciente);
                                System.out.println("Gracias por registrar un Paciente"
                                        + "\nDesea Ingresar otro Paciente"
                                        + "\n1.Si"
                                        + "\n0.No");
                                inCase = Integer.parseInt(cin.nextLine());
                            }
                            break;
                        case 2:
                            System.out.println("INGRESE LOS DATOS DEL DOCTOR");
                            while (inCase != 0)
                            {
                                System.out.println("Ingrese el Nombre del Doctor");
                                doctor.setNombre(cin.nextLine());
                                System.out.println("Ingrese el Apellido del Doctor");
                                doctor.setApellido(cin.nextLine());
                                System.out.println("Ingrese el Edad del Doctor");
                                doctor.setEdad(cin.nextInt());
                                System.out.println("Ingrese el Genero del Doctor");
                                doctor.setGenero(cin.next());
                                System.out.println("Ingrese el Dirrecion del Doctor");
                                doctor.setDirreccion(cin.next());
                                System.out.println("Ingrese el Telefono del Doctor");
                                doctor.setTelefono(cin.nextInt());
                                System.out.println("Ingrese el Correo Electronico del Doctor");
                                doctor.setCorreoElectronico(cin.next());
                                System.out.println("Ingrese el Fecha de Nacimiento del Doctor");
                                int year, mount, day;
                                System.out.println("Ingrese el Año");
                                year = cin.nextInt();
                                System.out.println("Ingrese el Mes");
                                mount = cin.nextInt();
                                System.out.println("Ingrese el Dia");
                                day = cin.nextInt();
                                doctor.setFechaNacimiento(LocalDate.of(year, mount, day));
                                System.out.println("Ingrese la Especialidad del Doctor");
                                doctor.setEspecialidad(cin.next());
                                System.out.println("Ingrese el Horario de Trabajo del Doctor");
                                doctor.setHoraTrabajo(cin.next());
                                System.out.println("Ingrese el Area de Trabajo del Doctor");
                                doctor.setAreaAtencion(cin.next());
                                //generar ID del doctor
                                doctor.setIdDoctor(doctor.generarIdDoctor());
                                System.out.println("ID del Doctor: " + doctor.getIdDoctor());
                                addInfoDoctor.add(doctor);
                                System.out.println("Gracias por registrar un Doctor"
                                        + "\nDesea Ingresar otro Doctor"
                                        + "\n1.Si"
                                        + "\n0.No");
                                inCase = Integer.parseInt(cin.nextLine());
                            }
                            break;
                        case 3:
                            System.out.println("INGRESE LOS DATOS DE LA CONSULTA");
                            while (inCase != 0)
                            {
                                consulta.setFecha(LocalDate.now());
                                System.out.println("La Fecha de la consulta es :" + consulta.getFecha());
                                System.out.println("Escriba la receta del Tratamiento");
                                consulta.setReceta(cin.next());
                                System.out.println("Escriba el Tratamiento por cuanto tiempo debe hacerlo");
                                consulta.setReceta(cin.next());
                                System.out.println("Escriba el Diagnostico que se le dio al paciente");    
                                consulta.setReceta(cin.next());
                                //generar ID de paciente
                                paciente.setIdPaciente(paciente.generarIdPaciente());
                                //relacionar el ID paciente, ID doctor y unirlo ala consulta 
                                //buscar una forma
                                System.out.println("ID de la consulta: " + paciente.getIdPaciente());
                                addInfoConsulta.add(consulta);
                                System.out.println("\n\nGracias por registrar una Consulta"
                                        + "\nDesea Ingresar otro Paciente"
                                        + "\n1.Si"
                                        + "\n0.No");
                                inCase = Integer.parseInt(cin.nextLine());
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    System.out.println("""
                                       *********       Menu       *********
                                       1.Mostrar datos de los Paciente
                                       2.Mostrar los datos de los Doctor
                                       3.Mostrar los datos de las Consulta
                                       0.Salir""");
                    inCase = Integer.parseInt(cin.nextLine());
                    switch (inCase)
                    {
                        case 1:
                            for (int i = 0; i < addInfoConsulta.size(); i++)
                            {
                                System.out.println(paciente.toString());
                            }
                            break;
                        case 2:
                            for (int i = 0; i < addInfoDoctor.size(); i++)
                            {
                                System.out.println(doctor.toString());
                            }
                            break;
                        case 3:
                            for (int i = 0; i < addInfoConsulta.size(); i++)
                            {
                                System.out.println(consulta.toString());
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (inCase == 0);
    }

}
