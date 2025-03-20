package co.edu.uniquindio.listasEnlazadas;

public class Main {
    public static void main(String[] args) {

        ListaEnlazadaSimple listaEnlazadaSimple = new ListaEnlazadaSimple();

        listaEnlazadaSimple.insertarNodoAlInicio(5);
        listaEnlazadaSimple.insertarNodoAlInicio(54);
        listaEnlazadaSimple.insertarNodoAlInicio(2);
        listaEnlazadaSimple.eliminarNodoAlInicio();
        listaEnlazadaSimple.mostrarLista();
        System.out.println("Tamaño de la lista: " + listaEnlazadaSimple.getTamanio());
    }
}