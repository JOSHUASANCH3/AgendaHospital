package github.agendahospital;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class AgendaHospital {

    public static void main(String[] args) {
        //haciendo un pequeño cambio
        //Consola de gestion para el programa si asi que se puede llamar
        Scanner cin = new Scanner(System.in);//entrada de datos
        Paciente paciente = new Paciente();
        Doctor doctor = new Doctor();
        Consulta consulta = new Consulta();
        Paciente pArray = new Paciente(LocalDate.now(), "Julio", "Sanchez", 25, "Masculino", "Managua", 15015416, "jokayou3@gmail.com", LocalDate.of(1989, Month.JUNE, 15));
        Paciente pArray_ = new Paciente(LocalDate.now(), "Juan", "Sanchez", 25, "Masculino", "Managua", 16546516, "jokayou3@gmail.com", LocalDate.of(1993, Month.AUGUST, 29));
        Doctor dArray = new Doctor("Pediatria", "Matutino", "Emergencia", "Ramiro", "Reyes", 31, "Masculino", "Managua", 15489646, "doctor@gmail.com", LocalDate.of(1977, Month.DECEMBER, 2));
        Consulta cArray = new Consulta(LocalDate.now(), "Acetaminofen", "Una semana", "Calentura");
        ArrayList<Paciente> addInfoPaciente = new ArrayList<>();
        ArrayList<Doctor> addInfoDoctor = new ArrayList<>();
        ArrayList<Consulta> addInfoConsulta = new ArrayList<>();
        addInfoPaciente.add(pArray);
        addInfoPaciente.add(pArray_);
        addInfoDoctor.add(dArray);
        addInfoConsulta.add(cArray);
        int inCase = 0;
        //consola de agenda
        do
        {
            System.out.println("""
                           *******     Menu     *******    
                           1.Registrar Datos
                           2.Mostrar Datos
                           3.Buscar Datos    
                           4.Eliminar Datos   
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
                    inCase = 0; 
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
                                inCase = 0;
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
                            System.out.println("\nSe mostraran los datos de todos los Pacientes\n");
                            for (int i = 0; i < addInfoPaciente.size(); i++)
                            {
                                System.out.println(addInfoPaciente.get(i).toString());
                            }
                            break;
                        case 2:
                            System.out.println("\nSe mostraran los datos de todos los Doctores\n");
                            for (int i = 0; i < addInfoDoctor.size(); i++)
                            {
                                System.out.println(addInfoDoctor.get(i).toString());
                            }
                            break;
                        case 3:
                            System.out.println("\nSe mostraran los datos de todos los Consultas\n");
                            for (int i = 0; i < addInfoConsulta.size(); i++)
                            {
                                System.out.println(addInfoConsulta.get(i).toString());
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 3:
                    System.out.println("""
                                       *********       Menu       *********
                                       1.Buscar datos de los Paciente
                                       2.Buscar los datos de los Doctor
                                       3.Buscar los datos de las Consulta
                                       0.Salir""");
                    inCase = Integer.parseInt(cin.nextLine());
                    switch (inCase)
                    {
                        case 1:
                            System.out.println("Primero coloque el ID del paciente");
                            String nameSearch1 = cin.nextLine();
                            for (Paciente searchP : addInfoPaciente)
                            {
                                if (searchP.getIdPaciente() == nameSearch1)
                                {
                                    // Encontramos el paciente buscado
                                    System.out.println("ID del Paciente: " + searchP.getIdPaciente() + " Paciente encontrado: " + searchP.getNombre() + " " + searchP.getApellido());
                                    break; // Terminamos el bucle
                                } else
                                {
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Primero coloque el ID del Doctor");
                            nameSearch1 = cin.nextLine();
                            for (Doctor searchD : addInfoDoctor)
                            {
                                if (searchD.getIdDoctor() == nameSearch1)
                                {
                                    // Encontramos el paciente buscado
                                    System.out.println("ID del doctor encontrado : " + searchD.generarIdDoctor() + " Paciente encontrado: " + searchD.getNombre() + " " + searchD.getApellido());
                                    break; // Terminamos el bucle
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Primero coloque el ID de la Consulta");
                            nameSearch1 = cin.nextLine();
                            for (Consulta searchC : addInfoConsulta)
                            {
                                if (searchC.getIdConsulta() == nameSearch1)
                                {
                                    // Encontramos el paciente buscado
                                    System.out.println("El numero de la consulta es: " + searchC.getIdConsulta() + " y su tratamiento fue: " + searchC.getTratamiento());
                                    break; // Terminamos el bucle
                                }
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 4:
                    System.out.println("""
                                       *********       Menu       *********
                                       1.Eliminar datos de los Paciente
                                       2.Eliminar los datos de los Doctor
                                       3.Eliminar los datos de las Consulta
                                       0.Salir""");
                    inCase = Integer.parseInt(cin.nextLine());
                    switch (inCase)
                    {
                        case 1:
                            System.out.println("Digite el ID del paciente para eliminarlo");
                            String rmString = cin.nextLine();
                            for (Paciente removeP : addInfoPaciente)
                            {
                                if (rmString.equals(removeP.getIdPaciente()))
                                {
                                    addInfoPaciente.remove(removeP);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Digite el ID del doctor para eliminarlo");
                            rmString = cin.nextLine();
                            for (Paciente removeP : addInfoPaciente)
                            {
                                if (rmString.equals(removeP.getIdPaciente()))
                                {
                                    addInfoPaciente.remove(removeP);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Digite el ID del consulta para eliminarlo");
                            rmString = cin.nextLine();
                            for (Paciente removeP : addInfoPaciente)
                            {
                                if (rmString.equals(removeP.getIdPaciente()))
                                {
                                    addInfoPaciente.remove(removeP);
                                    break;
                                }
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (inCase == 0);
    }

}
