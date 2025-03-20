package co.edu.uniquindio.listasEnlazadas;

public class ListaEnlazadaSimple {

    private int tamanio;
    private Nodo nodoPrimero;

    public ListaEnlazadaSimple(){
        tamanio = 0;
        nodoPrimero = null;
    }

    public Nodo getNodoPrimero(){
        return nodoPrimero;
    }

    public void setNodoPrimero(Nodo nodoPrimero){
        this.nodoPrimero = nodoPrimero;
    }

    public int getTamanio(){
        return tamanio;
    }

    public void insertarNodoAlInicio(int valor){
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(nodoPrimero);
        nodoPrimero = nuevo;
        tamanio++;
    }

    public void insertarNodoAlFinal(int valor){
        Nodo nuevo = new Nodo(valor);
        if (nodoPrimero == null){
            nodoPrimero = nuevo;
        }else {
            Nodo actual = nodoPrimero;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public void eliminarNodoAlInicio(){

        if (nodoPrimero != null){
            nodoPrimero = nodoPrimero.getSiguiente();
            tamanio--;
        }else {
            System.out.println("Error al eliminar: lista vacia");
        }
    }

    public void eliminarNodoAlFinal(){

        if (nodoPrimero == null){
            System.out.println("Error al eliminar: lista vacia");
            return;
        }

        if (nodoPrimero.getSiguiente() == null){
            nodoPrimero = null;
        }else {
            Nodo actual = nodoPrimero;

            while (actual.getSiguiente().getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
        }
        tamanio--;
    }

    public void mostrarLista() {
        Nodo actual = nodoPrimero;
        while (actual != null) {
            System.out.print(actual.getValor() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

}
