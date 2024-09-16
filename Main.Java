import java.util.ArrayList;
import java.util.Scanner; 

    public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> producto = new ArrayList<>();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Aumentar Stock");
            System.out.println("4. Reducir Stock");
            System.out.println("5. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    String nombre;
                    do {
                        System.out.print("Ingresa el nombre del producto: ");
                        nombre = scanner.nextLine();
                        if (nombre == null || nombre.isEmpty()) {
                            System.out.println("El nombre no puede estar vacío. Intente nuevamente.");
                        }
                    } while (nombre == null || nombre.isEmpty());

                    scanner.nextLine();
                    Float precio;
                    do {
                        System.out.print("Ingresa el precio del producto: ");
                        precio = scanner.nextFloat();
                        if (precio < 0) {
                            System.out.println("El precio no puede ser negativo. Intente nuevamente.");
                        }
                    } while (precio < 0);

                        scanner.nextLine();
                    int stock;
                    do {
                        System.out.print("Ingresa el stock del producto: ");
                        stock = scanner.nextInt();
                        if (stock < 0) {
                            System.out.println("El stock no puede ser negativo. Intente nuevamente.");
                        }
                    } while (stock < 0);


                            scanner.nextLine();

                            System.out.println(nombre);

                            producto.add(new Producto(nombre, precio, stock));
                            System.out.println("Producto registrado");
                            break;
                            case 2:
                                System.out.println("\nLista de productos:");
                                for (int i = 0; i < producto.size(); i++) {
                                    Producto productos = producto.get(i);
                                    System.out.println((i + 1) + "." + productos.getNombre());
                                    System.out.println("  Precio: " + productos.getPrecio());
                                    System.out.println("  Stock: " + productos.getStock());
                                }
                                break;

                                case 3:
                                System.out.print("Ingrese el nombre del producto para aumentar el stock: ");
                                nombre = scanner.nextLine();
                                Producto productoAumentar = Producto.ProductoPorNombre(producto, nombre);
                                if (productoAumentar != null) {
                                    System.out.print("Ingrese la cantidad a aumentar: ");
                                    int cantidad = scanner.nextInt();
                                    productoAumentar.aumentarStock(cantidad);
                                } else {
                                    System.out.println("Producto no encontrado.");
                                }
                                break;
                            case 4:
                                System.out.print("Ingrese el nombre del producto para disminuir el stock: ");
                                nombre = scanner.nextLine();
                                Producto productoDisminuir = Producto.ProductoPorNombre(producto, nombre);
                                if (productoDisminuir != null) {
                                    System.out.print("Ingrese la cantidad a disminuir: ");
                                    int cantidad = scanner.nextInt();
                                    productoDisminuir.reducirStock(cantidad);
                                } else {
                                    System.out.println("Producto no encontrado.");
                                }
                                break;
                            case 5:
                                System.out.println("Hasta luego");
                        }
                    }
            }
        }