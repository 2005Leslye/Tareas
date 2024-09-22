import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        System.out.println(" HOSPITAL ");


        int opcion = 0;
        while (opcion != 12) {
            System.out.println("\n**BIENVENIDO**");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Registrar Médico");
            System.out.println("3. Registrar Consultorio");
            System.out.println("4. Registrar Consultas");
            System.out.println("5. Mostrar Pacientes");
            System.out.println("6. Mostrar Médico");
            System.out.println("7. Mostrar Consultorios");
            System.out.println("8. Mostrar Consultas");
            System.out.println("9. Mostrar Paciente por ID");
            System.out.println("10.Mostrar Médico por ID");
            System.out.println("11.Mostrar Consultorios por ID");
            System.out.println("12.Listar Médico por ID");
            System.out.println("13.Listar Consultorio por ID");
            System.out.println("14.Salir");

            System.out.print("\nSeleccione una opción:\n");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-- Seleccionaste Registrar Paciente --\n");
                    String id = hospital.generarIdPaciente();
                    scanner.nextLine();
                    System.out.println("Ingrese el Nombre del Paciente: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese los apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del Paciente: ");
                    String fechaNacimiento = scanner.nextLine();
                    System.out.println("Ingrese el tipo de sangre del Paciente: ");
                    String tipoSangre = scanner.nextLine();
                    System.out.println("Ingrese el Sexo del Paciente: H/M");
                    Character sexo = scanner.next().charAt(0);
                    scanner.nextLine();
                    System.out.println("Ingrese el teléfono del paciente: ");
                    String telefono = scanner.nextLine();

                    Paciente paciente = new Paciente(id, nombre, apellidos, fechaNacimiento, tipoSangre, sexo, telefono);
                    hospital.registrarPaciente(paciente);
                    break;
                case 2:
                    System.out.println("-- Seleccionaste Registrar Médico --\n");

                    scanner.nextLine();
                    System.out.println("Ingrese el Nombre del Médico: ");
                    String nombreMedico = scanner.nextLine();
                    System.out.println("Ingrese los apellidos: ");
                    String apellidosMedico = scanner.nextLine();
                    System.out.println("Ingrese fecha de nacimiento del Médico: ");
                    String fechaNacimientoMedico = scanner.nextLine();
                    String idMedico = hospital.generarIdMedico(apellidosMedico, fechaNacimientoMedico);
                    scanner.nextLine();
                    System.out.println("Ingrese el teléfono del Médico: ");
                    String telefonoMedico = scanner.nextLine();
                    System.out.println("Ingrese el RFC del Médico: ");
                    String rfc = scanner.nextLine();

                    Medico medico = new Medico(idMedico,nombreMedico, apellidosMedico, fechaNacimientoMedico, telefonoMedico, rfc);
                    hospital.registrarMedico(medico);
                    break;
                case 3:
                    System.out.println("-- Seleccionaste Registrar Consultorio --\n");
                    String idConsultorio = hospital.generarIdConsultorio();
                    scanner.nextLine();
                    System.out.println("Ingrese el piso: ");
                    int piso = scanner.nextInt();
                    System.out.println("Ingrese el Número del Consultorio: ");
                    int numeroConsultorio = scanner.nextInt();

                    Consultorio consultorio = new Consultorio(idConsultorio, piso, numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("-- Seleccionaste mostrar Pacientes -- \n");
                    hospital.mostrarPaciente();
                    break;
                case 6:
                    System.out.println("-- Seleccionaste mostrar Médicos --\n");
                    hospital.mostrarMedico();
                    break;
                case 7:
                    System.out.println("-- Seleccionaste mostrar Consultorios -- \n");
                    hospital.mostrarConsultorio();
                    break;
                case 8:
                    System.out.println("-- Seleccionaste mostrar Consultas --\n");
                    hospital.mostrarConsulta();
                    break;
                case 9:
                    System.out.println("-- Seleccionaste mostrar Paciente por ID -- \n");
                    scanner.nextLine();
                    System.out.println("Ingrese el ID del paciente a buscar");
                    String idPaciente = scanner.nextLine();
                    hospital.mostrarPacientePorId(idPaciente);
                    break;
                case 10:
                    System.out.println("-- Seleccionaste mostrar Médico por ID -- \n");
                    scanner.nextLine();
                    System.out.println("Ingrese el ID del medico a buscar");
                    String idM = scanner.nextLine();
                    hospital.mostrarMedicoPorId(idM);
                    break;
                case 11:
                    System.out.println("-- Seleccionaste mostrar Consultorio por ID -- \n");
                    scanner.nextLine();
                    System.out.println("Ingrese el id del consultorio a buscar");
                    String id_Consultorio = scanner.nextLine();
                    hospital.mostrarConsultorioPorId(id_Consultorio);
                    break;
                case 12:
                    System.out.println("-- Seleccionaste Listar Médicos por ID --");
                    hospital.listarMedicosPorId();
                    break;

                case 13:
                    System.out.println("-- Seleccionaste Listar Consultorios por ID --");
                    hospital.listarConsultorios();
                   break;
                case 14:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Opción no Valida\n");
                    break;
            }
        }
    }
}