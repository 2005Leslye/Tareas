import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Habitacion> habitaciones;
    private static Scanner scanner = new Scanner(System.in); // Scanner como atributo de clase estático

    public static void main(String[] args) {
        habitaciones = new ArrayList<>();

        // Crear habitaciones
        habitaciones.add(new Habitacion("Individual", 50.0, true));
        habitaciones.add(new Habitacion("Doble", 75.0, true));
        habitaciones.add(new Habitacion("Suite", 150.0, true));

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n--- Sistema de Reservas de Habitaciones ---");
            System.out.println("1. Mostrar detalles de las habitaciones");
            System.out.println("2. Realizar una reserva");
            System.out.println("3. Liberar una habitación");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarDetalles();
                    break;
                case 2:
                    realizarReserva();
                    break;
                case 3:
                    liberarHabitacion();
                    break;
                case 4:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private static void mostrarDetalles() {
        System.out.println();
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarDetalles();
        }
    }

    private static void realizarReserva() {
        System.out.print("\nIngrese el número de habitación (1: Individual, 2: Doble, 3: Suite): ");
        int numHabitacion = scanner.nextInt();
        System.out.print("Ingrese el número de noches a reservar: ");
        int noches = scanner.nextInt();

        try {
            habitaciones.get(numHabitacion - 1).reservar(noches);
        } catch (Habitacion.HabitacionNoDisponibleException | Habitacion.NumeroDeNochesInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void liberarHabitacion() {
        System.out.print("\nIngrese el número de habitación para liberar (1: Individual, 2: Doble, 3: Suite): ");
        int numHabitacion = scanner.nextInt();

        habitaciones.get(numHabitacion - 1).liberar();
    }
}
