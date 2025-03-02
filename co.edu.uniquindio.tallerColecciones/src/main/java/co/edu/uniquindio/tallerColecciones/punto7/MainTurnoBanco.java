package co.edu.uniquindio.tallerColecciones.punto7;

public class MainTurnoBanco {
    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.agregarCliente("Sara");
        banco.agregarCliente("Camilo");
        banco.agregarCliente("Jorge");

        banco.mostrarCola();

        banco.insertarClienteUrgente("Luis");

        banco.mostrarCola();

        banco.atenderCliente();
        banco.atenderCliente();

        banco.mostrarCola();

    }
}

















