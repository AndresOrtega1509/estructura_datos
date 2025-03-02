package co.edu.uniquindio.tallerColecciones.punto4;

public class Tarea implements Comparable<Tarea>  {
    private String descripcion;
    private Integer prioridad;


    public Tarea(String descripcion, Integer prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        return Integer.compare(this.prioridad, otraTarea.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea: " +
                "descripcion= " + descripcion  +
                ", prioridad= " + prioridad ;
    }
}
