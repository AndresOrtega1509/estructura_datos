package co.edu.uniquindio.tallerColecciones.punto6;

import java.util.*;

public class Tienda {
    private ArrayList<Producto> listaProductos;

    public Tienda(){
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(String codigo, String nombre, double precio){
        Producto producto = new Producto(codigo, nombre, precio);
        listaProductos.add(producto);
        System.out.println("Producto agregado con éxito.");
    }

    public void eliminarProducto(String codigo){
        Iterator<Producto> iterator = listaProductos.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(codigo)) {
                iterator.remove();
                System.out.println("Producto con código: " + codigo + ", eliminado correctamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto con código: " + codigo + ", no encontrado.");
        }
    }

    public Producto buscarProducto(String codigo){
        Iterator<Producto> iterator = listaProductos.iterator();

        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }

        return null;
    }

    public void listarPorNombre() {
        listaProductos.sort(Comparator.comparing(Producto::getNombre));
        System.out.println("\nInventario ordenado por nombre:");
        listaProductos.forEach(System.out::println);
    }

    public void listarPorPrecio() {
        listaProductos.sort(Comparator.comparing(Producto::getPrecio));
        System.out.println("\nInventario ordenado por precio:");
        listaProductos.forEach(System.out::println);
    }
}
