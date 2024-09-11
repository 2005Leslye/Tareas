import Empleado.Empleado;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         Empleado empleado= new Empleado();

        System.out.println("Ingresa tus datos ");

        System.out.println("Ingresa tu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Ingresa tu bonificación: ");
        Double bonificación = scanner.nextDouble();

        System.out.println("Ingresa tus horas extras: ");
        int horasExtras = scanner.nextInt();

        if (bonificación==0 && horasExtras==0){
            System.out.println("Tu total de saldo es: "+empleado.calcularSalario(saldo));
        }else if (horasExtras==0){
            System.out.println("Tu total de saldo y bonificación es: "+ empleado.calcularSalario(saldo,bonificación));
        }else{
            System.out.println("Tu total de saldo, bonificación y horas extras es: "+ empleado.calcularSalario(saldo, bonificación,horasExtras));
        }



    }
}

//CLASE EMPLEADOS

package Empleado;

public class Empleado {

   public Double saldo;
   public Double bonificación;
   public int horasExtras;



public Double calcularSalario (Double saldo){
    return saldo;
}
public Double calcularSalario(Double saldo, Double bonificación){
    return saldo+bonificación;
}
public Double calcularSalario (Double saldo, Double bonificación, int horasExtras){
    return saldo+bonificación+(horasExtras*20);
}