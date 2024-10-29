public class PagoPaypal extends Pago{
    private String numeroDeCuenta;
    private String email;

    public PagoPaypal(int monto, String numeroDeCuenta, String email) {
        super(monto);
        this.numeroDeCuenta = numeroDeCuenta;
        this.email= email;
    }

    @Override
    public void procesarPago(){
        validarPago();
        if (!email.contains("@")){
            System.out.println("Correo inválido");

        }else{
            System.out.println("Pago completado");
            System.out.println("Monto original: "+ getMonto());
            System.out.println("Monto con descuento: "+ (getMonto() -(super.getMonto()* obtenerDescuento(getMonto()))));
            System.out.println("Correo del usuario: "+ email);
            System.out.println("Número de cuenta: "+ numeroDeCuenta);
        }
    }

    @Override
    public double obtenerDescuento(int monto){
        if (monto > 100){
            if (numeroDeCuenta.contains("001")){
                return .10;

            }else{
                return .05;
            }
        }
            return .02;
        }
    }

