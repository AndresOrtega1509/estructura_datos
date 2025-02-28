package co.edu.uniquindio.tallerColecciones.punto1;

import java.util.Comparator;
import java.util.TreeSet;

public class Empresa {

    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public Producto buscarProducto(String codigp) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigp)) {
                return producto;
            }
        }
        return null;
    }

}
