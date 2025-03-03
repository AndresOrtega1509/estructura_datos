package co.edu.uniquindio.tallerColecciones.punto15;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {

    private Map<String, String> directorio;

    public DirectorioTelefonico() {
        directorio = new HashMap<>();
    }

    public void agregarContacto(String nombre, String numeroTelefono) {
        if (directorio.containsKey(nombre)) {
            System.out.println("El contacto de " + nombre + " ha sido actualizado.");
        } else {
            System.out.println("Nuevo contacto agregado: " + nombre);
        }
        directorio.put(nombre, numeroTelefono);
    }

    public void buscarContacto(String nombre) {
        if (directorio.containsKey(nombre)) {
            System.out.print("Se encontro en el directorio el nombre buscado " + nombre);
            System.out.println(" su número de teléfono es " + directorio.get(nombre));
        } else {
            System.out.println("No se encuentra el contacto de " + nombre + " en el directorio.");
        }
    }

    public void mostrarDirectorio() {
        if (directorio.isEmpty()) {
            System.out.println("El directorio está vacío.");
        } else {
            System.out.println("Directorio Telefónico:");
            for (Map.Entry<String, String> entrada : directorio.entrySet()) {
                System.out.println("Nombre: " + entrada.getKey() + " | Teléfono: " + entrada.getValue());
            }
        }
    }
}
