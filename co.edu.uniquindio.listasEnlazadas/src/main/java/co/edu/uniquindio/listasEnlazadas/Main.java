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

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(123);
        biblioteca.agregarLibro(345);
        biblioteca.agregarLibro(234);
        biblioteca.agregarLibro(657);
        biblioteca.agregarLibro(423);


    }
}