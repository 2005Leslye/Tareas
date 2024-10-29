public class EnvioNacional extends Envio {

    private double distanciaKm;

    public EnvioNacional(double costoBase, double peso, double distanciaKm) {
        super(costoBase, peso);
        this.distanciaKm = distanciaKm;
    }

    @Override
    public String calcularTiempoYCostoEntrega() {
        int diasEntrega = (int) (distanciaKm / 200);
        if (distanciaKm % 200 != 0) {
            diasEntrega += 1;
        }

        double costoTotal = costoBase;

        if (peso > 5) {
            costoTotal += costoBase * 0.05;
        }

        return "Costo Total: $" + costoTotal + ", Tiempo de Entrega: " + diasEntrega + " días";
    }

    }

