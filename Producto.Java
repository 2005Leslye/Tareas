import java.util.ArrayList;

public class Producto {
    public boolean mostrarProducto;
    private String nombre;
    private Float precio;
    private int stock;



    public Producto (String nombre, Float precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;

    }
    public Producto (String nombre,Float precio){
        this.nombre=nombre;
        this.precio=precio;
        stock=0;

    }
    public String getNombre(){
        return this.nombre;
    }

    public Float getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("El nombre no puede ser nulo");
        }else{
            this.nombre = nombre;
        }

    }

    public void setPrecio(Float precio) {
        if (precio < 0) {
            System.out.println("El precio no puede ser negativo");
        } else {
            this.precio = precio;
        }
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("El stock no puede ser negativo.");
        } else {
            this.stock =stock;
        }
    }
    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            int nuevoStock = this.stock + cantidad;
            this.setStock(nuevoStock);
            System.out.println("El stock se aumento, Stock actual: " + this.stock);
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else if (cantidad > this.stock) {
            System.out.println("La cantidad no puede ser mayor que el stock actual.");
        } else {
            int nuevoStock = this.stock - cantidad;
            this.setStock(nuevoStock);
            System.out.println("El stock fue reducido, Stock actual: " + this.stock);
        }
}
    public static Producto ProductoPorNombre(ArrayList<Producto> productos, String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null; // Retorna null si no encuentra el producto
    }
}