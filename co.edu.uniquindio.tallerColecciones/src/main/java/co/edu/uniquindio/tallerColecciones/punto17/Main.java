package co.edu.uniquindio.tallerColecciones.punto17;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.agregarEvento(LocalDate.of(2025, 6, 15), "Reunion de trabajo");
        agenda.agregarEvento(LocalDate.of(2025, 4, 22), "Concierto de Shakira");
        agenda.agregarEvento(LocalDate.of(2025, 9, 17), "Reunion familiar");
        agenda.agregarEvento(LocalDate.of(2025, 2, 1), "Viaje a Madrid");
        agenda.agregarEvento(LocalDate.of(2026, 1, 5), "Capacitación al exterior");

        agenda.mostrarEventos();

        agenda.consultarEventoCercano();
    }
}
