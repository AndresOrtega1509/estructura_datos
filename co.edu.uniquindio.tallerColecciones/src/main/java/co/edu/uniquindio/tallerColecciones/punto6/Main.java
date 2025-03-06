package co.edu.uniquindio.tallerColecciones.punto6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Este ejercicio se realizó con datos quemados y dinamicós para una mejor implementación

        Tienda tienda1 = new Tienda();

        tienda1.agregarProducto("001", "Monitor", 800000);
        tienda1.agregarProducto("002", "Mouse", 45000);
        tienda1.agregarProducto("003", "Teclado", 190000);
        tienda1.agregarProducto("004", "Camara", 2500000);

        tienda1.listarPorNombre();

        tienda1.listarPorPrecio();

        System.out.println("\nEliminar producto agotado:");
        tienda1.eliminarProducto("001");

        System.out.println("Buscar producto:");
        Producto productoEncontrado = tienda1.buscarProducto("002");
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoEncontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }



        Scanner scanner = new Scanner(System.in);
        Tienda tienda2 = new Tienda();

        while (true) {
            System.out.println("\n--- Menú Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto agotado");
            System.out.println("3. Buscar producto");
            System.out.println("4. Listar productos por nombre");
            System.out.println("5. Listar productos por precio");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese precio: ");
                    double precio = scanner.nextDouble();
                    tienda2.agregarProducto(codigo, nombre, precio);
                    break;
                case 2:
                    System.out.print("Ingrese el código del producto a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    tienda2.eliminarProducto(codigoEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el código del producto a buscar: ");
                    String codigoBuscar = scanner.nextLine();
                    Producto encontrado = tienda2.buscarProducto(codigoBuscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    tienda2.listarPorNombre();
                    break;
                case 5:
                    tienda2.listarPorPrecio();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }
}
