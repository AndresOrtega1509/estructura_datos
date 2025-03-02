package co.edu.uniquindio.tallerColecciones.punto8;

public class MainEditorTexto {

    public static void main(String[] args) {

       EditorTexto editor = new EditorTexto();

       editor.realizarCambio("Cambio 1");
       editor.realizarCambio("Cambio 2");
       editor.realizarCambio("Cambio 3");

       editor.mostrarTexto();
       editor.mostrarHistorial();

       editor.deshacer();
       editor.mostrarTexto();
       editor.mostrarHistorial();

        editor.deshacer();
        editor.mostrarTexto();
        editor.mostrarHistorial();


        editor.deshacer();
        editor.mostrarTexto();
        editor.mostrarHistorial();

        editor.deshacer();
    }
}
