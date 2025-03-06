package co.edu.uniquindio.tallerColecciones.punto9;

import co.edu.uniquindio.tallerColecciones.punto6.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NavegadorWeb navegadorWeb = new NavegadorWeb();

        // En este ejercicio, implementamos un swith-case para visualizar mejor la ejecución

        while (true) {
            System.out.println("\n--- Menú Navegación Web ---");
            String paginaActual = navegadorWeb.consultarPaginaActual();
            System.out.println("Pagina actual: " + paginaActual);
            System.out.println("1. visitar pagina");
            System.out.println("2. Retroceder pagina");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la pagina web: ");
                    navegadorWeb.visitarPagina(scanner.nextLine());
                    break;
                case 2:
                    navegadorWeb.retrocederPagina();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }

    }
}
