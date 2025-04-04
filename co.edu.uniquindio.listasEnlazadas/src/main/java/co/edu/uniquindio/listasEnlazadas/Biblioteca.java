package co.edu.uniquindio.listasEnlazadas;

public class Biblioteca {

    private ListaEnlazadaSimple listaLibrosISBN = new ListaEnlazadaSimple();

    public String agregarLibro(int isbn){
        String mensaje = "";
        listaLibrosISBN.insertarNodoAlFinal(isbn);
        mensaje = "Isbn creado";

        return mensaje;
    }

    public void imprimir(){
        listaLibrosISBN.mostrarLista();
    }
}
