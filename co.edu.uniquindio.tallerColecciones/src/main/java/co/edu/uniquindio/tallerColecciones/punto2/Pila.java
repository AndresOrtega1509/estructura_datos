package co.edu.uniquindio.tallerColecciones.punto2;

import java.util.Stack;

public class Pila {
    private final Stack<Object> pila;

    public Pila() {
        this.pila = new Stack<>();
    }

    public void push(Object obj) {
        if (pila.isEmpty() || obj.getClass().equals(pila.peek().getClass())) {
            pila.push(obj);
            System.out.println("Elemento agregado: " + obj);
        } else {
            System.out.println("Error: El objeto '" + obj + "' no coincide con el tipo en la cima.");
        }
    }

    public void pop() {
        if (pila.isEmpty()) {
            System.out.println("No se pudo eliminar el elemento, la pila esta vacia");
        }else {
            System.out.println("Elemento eliminado: " + pila.peek());
            pila.pop();
        }
    }

    public Object peek() {
        return pila.peek();
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + pila +
                '}';
    }
}
