package Coches;

public class Coches {
    public String marca;
    public String modelo;
    public int año;

    public Coches (String marca, String modelo, int año){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;

        //Imprimir atributo con this.
    }
    public void mostrarInformación(){
        System.out.println( "Marca: "+ this.marca + " , Modelo: " +this.modelo + " , Año: " + this.año);
    }
    public int calcularEdadDelCoche (int añoactual){
        return añoactual-año;
        
    }

}
