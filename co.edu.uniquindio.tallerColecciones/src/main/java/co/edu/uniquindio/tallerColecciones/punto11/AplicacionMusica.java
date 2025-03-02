package co.edu.uniquindio.tallerColecciones.punto11;

import java.util.LinkedHashSet;

public class AplicacionMusica {

    private LinkedHashSet<String> cancionesFavoritas;

    public AplicacionMusica() {
        cancionesFavoritas = new LinkedHashSet<>();
    }

    public void agregarCancionFavorita(String cancion) {

        if (cancionesFavoritas.add(cancion)) {
            System.out.println(cancion + " ha sido agregada a tus canciones favoritas");

        } else {
            System.out.println(cancion + " ya esta en la lista de tus canciones favoritas");
        }
    }

    public void mostrarCancionesFavoritas() {

        if (cancionesFavoritas.isEmpty()) {
            System.out.println("Aun no tienes canciones favoritas");

        }else{
            System.out.println("Tus canciones favoritas son:");

            for (String cancion: cancionesFavoritas) {
                System.out.println("- " + cancion);
            }
        }
    }

}
