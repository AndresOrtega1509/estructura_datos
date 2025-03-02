package co.edu.uniquindio.tallerColecciones.punto8;

import java.util.Vector;

public class EditorTexto {

    private Vector<String> historialDeCambios;

    private String textoActual;

    public EditorTexto() {
        historialDeCambios = new Vector<>();
        textoActual = " ";

    }

    public void realizarCambio(String nuevoTexto) {

        historialDeCambios.add(textoActual);
        textoActual = nuevoTexto;
        System.out.println(" Cambio realizado: " + textoActual);

    }

    public void deshacer() {
        if (historialDeCambios.isEmpty()) {
            System.out.println(" No hay cambios para deshacer");

        }else{
            textoActual = historialDeCambios.remove(historialDeCambios.size()-1);
            System.out.println(" Cambio eliminado. texto actual: " + textoActual);
        }
    }

    public void mostrarTexto() {
        System.out.println(" Texto actual: " + textoActual );
    }

    public void mostrarHistorial() {
        System.out.println("Historial de cambios: " + historialDeCambios);
    }
}
