package co.edu.uniquindio.tallerColecciones.punto12;

import java.util.TreeSet;

public class Universidad {

    private TreeSet<String> estudiantes;

    public Universidad() {

        estudiantes = new TreeSet<>();
    }

    public void agregarEstudiantes(String nombre) {

        if (estudiantes.add(nombre)) {
            System.out.println(nombre + " ha sido agregado");

        }else{
            System.out.println(nombre + " ya esta en la lista de estudiantes");
        }
    }

    public void mostrarEstudiantes() {

        if (estudiantes.isEmpty()) {
            System.out.println(" No hay estudiantes en la lista");

        }else{
            System.out.println(" Lista de estudiantes ordenados alfabeticamente: ");

            for (String estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    public void primerEstudiante() {

        if (!estudiantes.isEmpty()) {
            System.out.println("Primer estudiante (alfabeticamente): " + estudiantes.first());

        } else {
            System.out.println("No hay estudiantes en la lista");
        }
    }

        public void ultimoEstudiante() {

            if (!estudiantes.isEmpty()) {
                System.out.println("Ultimo estudiante (alfabeticamente): " + estudiantes.last());

            }else{
                System.out.println("No hay estudiantes en la lista");
        }
    }
}
