package co.edu.uniquindio.tallerColecciones.punto2;

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Pila pila = new Pila();

        pila.push("Moto");
        System.out.println(pila);
        pila.push(65);
        System.out.println(pila);
        pila.push("Carro");
        System.out.println(pila);
        pila.pop();
        System.out.println(pila);
        pila.push(35);
        System.out.println(pila);
        pila.push(87);
        System.out.println(pila);
        pila.pop();
        System.out.println(pila);
        pila.push(90);
        System.out.println(pila);
        pila.push(100);
        System.out.println(pila);
        pila.push(50);
        System.out.println(pila);
        Object elementoCola = pila.peek();
        System.out.println("Último elemento en la pila: "+elementoCola);
    }

}
