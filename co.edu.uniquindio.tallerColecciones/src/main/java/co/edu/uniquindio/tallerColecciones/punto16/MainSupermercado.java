package co.edu.uniquindio.tallerColecciones.punto16;

public class MainSupermercado {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

        supermercado.agregarProducto("Splash capilar", 30000);
        supermercado.agregarProducto("Leche", 16000);
        supermercado.agregarProducto("Huevos", 12000.80);
        supermercado.agregarProducto("Galletas", 8500);

        System.out.println();
        System.out.println("***********************************************");
        supermercado.mostrarFactura();
    }
}
