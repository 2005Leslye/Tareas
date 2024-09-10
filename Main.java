public class Main {
    public static void main(String[] args) {
        System.out.println("Coche UNO");
        Coches cocheUno = new Coches("Bentley", "Continental GT", 2023);
        cocheUno.mostrarInformación();
        System.out.println("Edad del coche: "+ cocheUno.calcularEdadDelCoche(2024));

        System.out.println();
        System.out.println("Coche DOS");
        Coches cocheDos = new Coches("Bugatti", "Divo", 2019);
        cocheDos.mostrarInformación();
        System.out.println("Edad del coche: "+ cocheDos.calcularEdadDelCoche(2024));

        System.out.println();
        System.out.println("Coche TRES");
        Coches cocheTres = new Coches("Audi", "R8", 2021);
        cocheTres.mostrarInformación();
        System.out.println("Edad del coche: "+ cocheTres.calcularEdadDelCoche(2024));
    }

}
