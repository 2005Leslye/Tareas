import java.util.Scanner;

class Habitacion {
    private String tipoHabitacion;
    private double precioPorHabitacion;
    private boolean disponible;

    public Habitacion(String tipoHabitacion, double precioPorHabitacion, boolean disponible) {
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorHabitacion = precioPorHabitacion;
        this.disponible = disponible;
    }

    public class HabitacionNoDisponibleException extends Exception {
        public HabitacionNoDisponibleException(String mensaje) {
            super(mensaje);
        }
    }

    public class NumeroDeNochesInvalidoException extends Exception {
        public NumeroDeNochesInvalidoException(String mensaje) {
            super(mensaje);
        }
    }

    public void reservar(int noches) throws HabitacionNoDisponibleException, NumeroDeNochesInvalidoException {
        if (!disponible) {
            throw new HabitacionNoDisponibleException("La habitación ya está ocupada.");
        }
        if (noches < 1) {
            throw new NumeroDeNochesInvalidoException("El número de noches debe ser mayor a 0.");
        }
        disponible = false;
        System.out.println("Reserva exitosa para " + noches + " noches.");
        System.out.println("Costo total de la reserva: " + (noches * precioPorHabitacion));
    }

    public void liberar() {
        disponible = true;
        System.out.println("La habitación ha sido liberada y está disponible nuevamente.");
    }

    public void mostrarDetalles() {
        System.out.println("\nTipo de habitación: " + tipoHabitacion);
        System.out.println("Precio por noche: " + precioPorHabitacion);
        System.out.println("Disponibilidad: " + (disponible ? "Disponible" : "Ocupada"));
    }
}
