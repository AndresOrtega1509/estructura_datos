package co.edu.uniquindio.tallerColecciones.punto4;

import java.util.PriorityQueue;

public class MainTarea {
    public static void main(String[] args) {
        PriorityQueue<Tarea> colaDeTareas = new PriorityQueue<>();

        colaDeTareas.add(new Tarea("Lavar la ropa", 4));
        colaDeTareas.add(new Tarea("Hacer la compra del mercado", 3));
        colaDeTareas.add(new Tarea("Cobrar sueldo", 1));
        colaDeTareas.add(new Tarea("Pagar servicios", 2));

        System.out.println("Tareas a realizar en orden de prioridad");
        while(!colaDeTareas.isEmpty()){
            Tarea tarea = colaDeTareas.poll();
            System.out.println(tarea);
        }
    }
}
