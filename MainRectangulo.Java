import Rectangulo.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Rectangulo rectangulo = new Rectangulo ();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los datos del réctangulo ");


        System.out.println("Si tus datos son enteros ingresa 'Enteros' si tus datos son con decimal ingresa 'Decimal'");
        String respuesta= scanner.nextLine();

        if (respuesta.equalsIgnoreCase("Decimal")){

            System.out.println("Base del réctangulo:");
            Double base= scanner.nextDouble();

            System.out.println("Altura del réctangulo: ");
            Double altura = scanner.nextDouble();

            System.out.println("El área del réctangulo es: "+rectangulo.calcularArea(base, altura));
            System.out.println("El perímetro del rectángulo es: "+rectangulo.calcularPerimetro(base,altura));

        }else if (respuesta.equalsIgnoreCase("Enteros")){
            System.out.println("Base del réctangulo:");
            int base= scanner.nextInt();

            System.out.println("Altura del réctangulo: ");
            int altura = scanner.nextInt();

            System.out.println("El área del réctangulo es: "+ rectangulo.calcularArea(base,altura));
            System.out.println("El perimetro del réctangulo es: "+ rectangulo.calcularPerimetro(base,altura));
        }
        }
    }


    //CLASE RECTANGULO

    package Rectangulo;

public class Rectangulo {
    public Double base;
    public Double altura;


    public Rectangulo (){
        base= base;
        altura= altura;

    }
 public Double calcularArea(Double base, Double altura){
        return base*altura;
 }
 public Double calcularPerimetro(Double base, Double altura){
        return  (2 * (base+altura));
 }
    public int calcularArea(int base, int altura){
        return base*altura;
    }
    public int calcularPerimetro(int base, int altura){
        return  (2 * (base+altura));
    }
}