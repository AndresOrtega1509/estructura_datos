package co.edu.uniquindio.tallerColecciones.punto6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();

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
                    tienda.agregarProducto(codigo, nombre, precio);
                    break;
                case 2:
                    System.out.print("Ingrese código del producto a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    tienda.eliminarProducto(codigoEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese código del producto a buscar: ");
                    String codigoBuscar = scanner.nextLine();
                    Producto encontrado = tienda.buscarProducto(codigoBuscar);
                    if (encontrado != null) {
                        System.out.println("Producto encontrado: " + encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    tienda.listarPorNombre();
                    break;
                case 5:
                    tienda.listarPorPrecio();
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
