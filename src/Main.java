import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
     PagoPaypal pagoPaypal = new PagoPaypal(200, "werde", "jss@ksjka");
     pagoPaypal.procesarPago();

        System.out.println("\n********************************** \n");

PagoTarjeta pagoTarjeta = new PagoTarjeta(1500, LocalDate.of(2024, 11, 11), "DSAE123");
pagoTarjeta.procesarPago();


        Envio envioNacional = new EnvioNacional(300, 6.0, 600);
        envioNacional.validarPeso();
        System.out.println(envioNacional.calcularTiempoYCostoEntrega());

        Envio envioInternacional = new EnvioInternacional(500, 12.0, "España");
        envioInternacional.validarPeso();
        System.out.println(envioInternacional.calcularTiempoYCostoEntrega());
    }
}