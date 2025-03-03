package co.edu.uniquindio.tallerColecciones.punto10;

import java.util.HashSet;
import java.util.Set;

public class ControlAcceso {

    private Set<String> listaEmpleados;

    public ControlAcceso() {
        listaEmpleados = new HashSet<>();
    }

    public void registrarAcceso(String id) {
        listaEmpleados.add(id);
    }

    public Set<String> getListaEmpleados() {
        return listaEmpleados;
    }
}
