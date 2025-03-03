package co.edu.uniquindio.tallerColecciones.punto10;

public class Main {
    public static void main(String[] args) {
        ControlAcceso controlAcceso = new ControlAcceso();

        System.out.println("Empleados con acceso:");
        controlAcceso.registrarAcceso("21");
        controlAcceso.registrarAcceso("74");
        controlAcceso.registrarAcceso("14");
        controlAcceso.registrarAcceso("14");
        controlAcceso.registrarAcceso("42");

        System.out.println(controlAcceso.getListaEmpleados());
    }
}
