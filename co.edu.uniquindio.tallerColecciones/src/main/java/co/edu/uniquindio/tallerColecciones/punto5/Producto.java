package co.edu.uniquindio.tallerColecciones.punto5;

import java.util.HashMap;

public class Producto {
    private String nombre;
    private double valor;

    public Producto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}
