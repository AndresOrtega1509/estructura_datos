package co.edu.uniquindio.tallerColecciones.punto3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainElementoCasa {
    public static void main(String[] args) {
        // Se crea un Treeset  con elementos de la casa el cual ordena los elementos de forma alfabetica

        Set<String> elementosCasa = new TreeSet<>();

        elementosCasa.add("Sofa");
        elementosCasa.add("Televisor");
        elementosCasa.add("Cama");
        elementosCasa.add("Muebles");
        elementosCasa.add("Muebles");

        //Se crea in iterador para recorrer los elementos del Treeset
        Iterator<String> iterator = elementosCasa.iterator();

        // Se usa el ietrador para imprimir los elementos, el hasNext devuelve un booleano mientras va recorriendo la lista
        System.out.println("Elementos de la casa");
        while (iterator.hasNext()){

            // se obtiene el siguiente elemento y el iterador avanza
            String elemento = iterator.next();
            System.out.println(elemento);

        }
    }

}
