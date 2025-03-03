package co.edu.uniquindio.tallerColecciones.punto14;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        HistorialMensaje chat = new HistorialMensaje();

        // Simulamos la llegada de mensajes
        chat.agregarMensaje("Hola,cómo está?");
        chat.agregarMensaje("Bien, gracias.");
        chat.agregarMensaje("Qué hace?");
        chat.agregarMensaje("Trabajando.");
        chat.agregarMensaje("Que bueno, cuenteme más.");
        chat.agregarMensaje("Estoy haciendo un proyecto");
        chat.agregarMensaje("Genial, sobre que?.");
        chat.agregarMensaje("Un asistente de IA para viajar");
        chat.agregarMensaje("Parece interesante");
        chat.agregarMensaje("Asi es, gracias");
        chat.agregarMensaje("Adios"); // Este reemplaza al primero

        chat.mostrarHistorial();
    }
}
