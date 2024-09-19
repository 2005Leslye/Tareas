import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9) {
            System.out.println("\n** BIENVENIDO **");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Eliminar Pacientes");
            System.out.println("3. Mostrar Pacientes");
            System.out.println("4. Registrar Médico");
            System.out.println("5. Eliminar Médicos");
            System.out.println("6. Mostrar Médicos");
            System.out.println("7. Registrar consulta");
            System.out.println("8. Cancelar consulta");
            System.out.println("9. Salir");


            System.out.println("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    return;
                case 8:

                    return;

            case 9:
                System.out.println("Hasta luego");
                return;
        }


        }
    }
}