package co.edu.uniquindio.tallerColecciones.punto15;

public class MainDirectorioTelefonico {
    public static void main(String[] args) {
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        directorio.agregarContacto("Jorge Montoya", "3113229014");
        directorio.agregarContacto("Karen Valbuena", "3108336369");
        directorio.agregarContacto("Heyler Orjuela", "3207459784");

        System.out.println();
        System.out.println("___________________________________");
        directorio.mostrarDirectorio();

        System.out.println();
        directorio.buscarContacto("Jorge Montoya");
        directorio.buscarContacto("Karen Valbuena");

        System.out.println();
        directorio.agregarContacto("Heyler Orjuela", "3116007700");

        System.out.println();
        System.out.println("___________________________________");
        directorio.mostrarDirectorio();
    }
}
