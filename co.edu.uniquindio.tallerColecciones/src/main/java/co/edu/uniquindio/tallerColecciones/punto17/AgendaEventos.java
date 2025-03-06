package co.edu.uniquindio.tallerColecciones.punto17;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private TreeMap<LocalDate, String> eventos;

    public AgendaEventos() {
        eventos = new TreeMap();
    }

    public void agregarEvento(LocalDate fecha, String nombreEvento) {
        eventos.put(fecha, nombreEvento);
    }

    public void consultarEventoCercano() {
        if (!eventos.isEmpty()) {
            String nombre = eventos.firstEntry().getValue();
            LocalDate fecha = eventos.firstEntry().getKey();
            System.out.println("Evento más cercano:");
            System.out.println(nombre + " → "  + fecha);
        }else {
            System.out.println("No hay eventos");
        }

    }

    public void mostrarEventos() {
        System.out.println("Eventos en la agenda:");
        for (Map.Entry<LocalDate, String> entry : eventos.entrySet()) {
            System.out.println(entry.getValue() + " → "  + entry.getKey());
        }
    }
}
