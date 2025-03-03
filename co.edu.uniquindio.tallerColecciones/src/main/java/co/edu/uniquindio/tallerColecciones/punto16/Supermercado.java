package co.edu.uniquindio.tallerColecciones.punto16;

import java.util.LinkedHashMap;
import java.util.Map;

public class Supermercado {
    private LinkedHashMap<String, Double> productos;

    public Supermercado() {
        productos = new LinkedHashMap<>();
    }

    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
        System.out.println("Producto agregado: " + nombre + " | Precio: " + precio);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (double precio : productos.values()) {
            total += precio;
        }
        return total;
    }

    public void mostrarFactura() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la compra.");
        } else {
            System.out.println("Factura de compra:");
            for (Map.Entry<String, Double> producto : productos.entrySet()) {
                System.out.println("Producto: " + producto.getKey() + " | Precio: " + producto.getValue());
            }
            System.out.println("Total de la compra: " + calcularTotal());
        }
    }
}
