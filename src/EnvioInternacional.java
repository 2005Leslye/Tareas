public class EnvioInternacional extends  Envio {

    private String paisDestino;

    public EnvioInternacional(double costoBase, double peso, String paisDestino) {
        super(costoBase, peso);
        this.paisDestino = paisDestino;
    }

    @Override
    public String calcularTiempoYCostoEntrega() {
        int diasEntrega = 10;
        double costoTotal = costoBase;

        if (peso > 10) {
            diasEntrega += 3;
        }

        costoTotal += costoBase * 0.20;

        return "Costo Total: $" + costoTotal + ", Tiempo de Entrega: " + diasEntrega + " días";
    }
}
