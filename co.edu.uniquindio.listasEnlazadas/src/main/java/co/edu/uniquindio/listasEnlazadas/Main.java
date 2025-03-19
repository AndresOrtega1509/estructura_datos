package co.edu.uniquindio.listasEnlazadas;

public class Main {
    public static void main(String[] args) {

        ListaEnlazadaSimple listaEnlazadaSimple = new ListaEnlazadaSimple();

        listaEnlazadaSimple.insertarNodoAlFinal(5);
        listaEnlazadaSimple.insertarNodoAlFinal(54);
        listaEnlazadaSimple.insertarNodoAlFinal(2);

        listaEnlazadaSimple.mostrarLista();
    }
}