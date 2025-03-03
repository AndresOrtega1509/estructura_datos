package co.edu.uniquindio.tallerColecciones.punto9;

import java.net.URL;
import java.util.Stack;

public class NavegadorWeb {

    private Stack<String> pila;

    public NavegadorWeb() {
        pila = new Stack<String>();
    }

    public void visitarPagina(String nombrePagina) {
        pila.push(nombrePagina);
        System.out.println("Visitando pagina: " + nombrePagina);
    }

    public void retrocederPagina(){
        if (pila.size() > 1){
            pila.pop();
            System.out.println("Retrocediendo a: "+ pila.peek());
        }else {
            System.out.println("No hay paginas por retroceder");
        }
    }

    public String consultarPaginaActual(){
        if (pila.isEmpty()){
            return "No hay paginas";
        }else {
            return pila.peek();
        }
    }
}
