package co.edu.uniquindio.tallerColecciones.punto5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // Crear un HashMap con clave de tipo Integer y valor de tipo Producto
        Map<Integer, Producto> listaHashMap = new HashMap<>();

        // Agregar productos
        listaHashMap.put(3, new Producto("pc", 3000000));
        listaHashMap.put(1, new Producto("celular", 1200000));
        listaHashMap.put(2, new Producto("tablet", 2500000));
        listaHashMap.put(4, new Producto("proyector", 600000));

        // Mostrar todos los productos
        System.out.println("Lista de Productos en HashMap:");
        for (Map.Entry<Integer, Producto> entry : listaHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Crear un LinkedHashMap con clave de tipo Integer y valor de tipo Producto
        Map<Integer, Producto> listaLinkedHashMap = new LinkedHashMap<>();

        // Agregar productos
        listaLinkedHashMap.put(3, new Producto("libro", 50000));
        listaLinkedHashMap.put(1, new Producto("lapicero", 1500));
        listaLinkedHashMap.put(2, new Producto("cuaderno", 4000));
        listaLinkedHashMap.put(4, new Producto("morral", 90000));

        // Mostrar todos los productos
        System.out.println("Lista de Productos en LinkedHashMap:");
        for (Map.Entry<Integer, Producto> entry : listaLinkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Crear un TreeMap con clave de tipo Integer y valor de tipo Producto
        Map<Integer, Producto> listaTreeMap = new TreeMap<>();

        // Agregar productos
        listaTreeMap.put(3, new Producto("cama", 800000));
        listaTreeMap.put(1, new Producto("mesa", 1000000));
        listaTreeMap.put(2, new Producto("silla", 40000));
        listaTreeMap.put(4, new Producto("sofa", 2500000));

        // Mostrar todos los productos
        System.out.println("Lista de Productos en TreeMap:");
        for (Map.Entry<Integer, Producto> entry : listaTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Diferencias:
        //  *HashMap* no sigue ningún orden en particular. La implementación interna es una tabla Hash
        //  *LinkedHashMap* mantiene el orden en el que se agregaron los elementos. La implementación interna es
        //una lista doblemente enlazada + HashMap
        //  *TreeMap* ordena automáticamente por clave. La implementación interna es un árbol rojo-negro
    }

}
