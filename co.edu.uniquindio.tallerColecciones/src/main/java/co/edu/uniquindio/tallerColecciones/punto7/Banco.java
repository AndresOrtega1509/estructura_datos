package co.edu.uniquindio.tallerColecciones.punto7;

import java.util.LinkedList;

public class Banco {
    private LinkedList<String>colaDeEspera;

    public Banco() {
        colaDeEspera = new LinkedList<>();
    }

    public void agregarCliente(String cliente){
        colaDeEspera.add(cliente);
        System.out.println(cliente +  " ha sido agregado a la cola de espera");
    }

    public void atenderCliente(){
        if (colaDeEspera.isEmpty()) {
            System.out.println("No hay clientes en la cola de espera");

        }else{
            String clienteAtendido = colaDeEspera.poll();
            System.out.println("Se atendio al cliente : " + clienteAtendido);
        }
    }

    public void insertarClienteUrgente(String cliente){
        colaDeEspera.addFirst(cliente);
        System.out.println(cliente + " ha sido insertado con urgencia al inicio de la cola. ");
    }

    public void mostrarCola() {
        if (colaDeEspera.isEmpty()) {
            System.out.println(" La cola de espera esta vacia. ");

        }else {
            System.out.println(" clientes en la cola de espera: " + colaDeEspera);

        }
    }

}
