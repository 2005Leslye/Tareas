public abstract class Envio {
    double costoBase;
    double peso;

    public Envio(double costoBase, double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }

    public abstract String calcularTiempoYCostoEntrega();

  public void validarPeso(){
      if (peso >= 0){

      }
      System.out.println("Peso validado: " + peso + " kg");
  }

}
