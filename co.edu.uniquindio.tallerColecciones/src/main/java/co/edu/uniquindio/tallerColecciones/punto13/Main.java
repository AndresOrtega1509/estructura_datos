package co.edu.uniquindio.tallerColecciones.punto13;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        Comparator<Paciente> pacienteComparator = (p1, p2) -> Integer.compare(p2.getNivelPrioridad(), p1.getNivelPrioridad());

        PriorityQueue<Paciente> pacientesPrioritarios = new PriorityQueue<>(pacienteComparator);

        pacientesPrioritarios.add(new Paciente("Santiago", 2));
        pacientesPrioritarios.add(new Paciente("Sara", 1));
        pacientesPrioritarios.add(new Paciente("Luisa", 2));
        pacientesPrioritarios.add(new Paciente("Juan", 3));
        pacientesPrioritarios.add(new Paciente("Maria", 1));
        pacientesPrioritarios.add(new Paciente("Jose", 2));

        System.out.println("Orden de atención:");
        while (!pacientesPrioritarios.isEmpty()) {
            System.out.println(pacientesPrioritarios.poll());
        }
    }
}