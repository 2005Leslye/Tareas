import CalculadoraImpuestos.CalculadoraImpuestos;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
CalculadoraImpuestos calculadora= new CalculadoraImpuestos();

        System.out.println("Ingresa los datos");
        System.out.println("Ingresa tus ventas: ");
        int ingresos= scanner.nextInt();
        System.out.println("Ingresa tus impuestos: ");
        Double porcentajeImpuestos= scanner.nextDouble();
        System.out.println("Ingresa los dividendos: ");
        Double dividendos= scanner.nextDouble();
        System.out.println("Ingresa exención: ");
        Double exención= scanner.nextDouble();

        if (porcentajeImpuestos==0 && dividendos==0 && exención==0){
            System.out.println("Tus ingresos son: "+ calculadora.calcularImpuestos(ingresos));
        }else if (dividendos==0 && exención==0){
            System.out.println("Tus ingresos son: "+ calculadora.calcularImpuestos(ingresos,porcentajeImpuestos));
        }else if (ingresos==0){
            System.out.println("Tus ingresos son: "+ calculadora.calcularImpuestos(dividendos,porcentajeImpuestos,exención));
        }
    }
}

// CLASE CALCULADORAIMPUESTOS

package CalculadoraImpuestos;

public class CalculadoraImpuestos {
    public int ingresos;
    public Double porcentajeImpuestos;
    public Double dividendos;
    public Double exención;

public Double calcularImpuestos(int ingresos){
    return (ingresos+0.15);
}
    public Double calcularImpuestos(int ingresos,Double porcentajeImpuestos){
        return ingresos*(porcentajeImpuestos/100);
    }
    public Double calcularImpuestos(Double dividendos,Double porcentajeImpuestos, Double exención){
       Double total= dividendos*(porcentajeImpuestos/100);
       if (total>exención){
           return total-exención;
       }else{
           return  total-total;
       }
    }
}