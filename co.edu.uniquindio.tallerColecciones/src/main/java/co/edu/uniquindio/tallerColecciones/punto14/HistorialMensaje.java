package co.edu.uniquindio.tallerColecciones.punto14;

import java.util.ArrayDeque;
import java.util.Queue;

public class HistorialMensaje {
    private Queue<String> historial;
    private static final int LIMITE_MENSAJES = 10;

    public HistorialMensaje() {
        this.historial = new ArrayDeque<>();
    }

    public void agregarMensaje(String mensaje) {
        if (historial.size() == LIMITE_MENSAJES) {
            // Elimina el mensaje más antiguo si el historial está lleno
            historial.poll();
        }
        // Agrega el nuevo mensaje al final
        historial.offer(mensaje);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de los últimos mensajes:");
        for (String mensaje : historial) {
            System.out.println(mensaje);
        }
    }
}
