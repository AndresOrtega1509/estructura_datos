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
        ListIterator<Producto> listIterator = listaProductos.listIterator();
        while(listIterator.hasNext()){
            Producto producto = listIterator.next();
            if(producto.getCodigo().equals(codigo)){
                listaProductos.remove(producto);
                System.out.println("producto eliminado con codigo: "+producto.getCodigo());
            }
        }

    }

    public Producto buscarProducto(String codigo){
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
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
