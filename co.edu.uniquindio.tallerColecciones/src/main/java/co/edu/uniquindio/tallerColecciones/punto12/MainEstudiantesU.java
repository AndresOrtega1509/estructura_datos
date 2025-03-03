package co.edu.uniquindio.tallerColecciones.punto12;

public class MainEstudiantesU {
    public static void main(String[] args) {

        Universidad universidad = new Universidad();

        universidad.agregarEstudiantes("Antonio Lopez");
        universidad.agregarEstudiantes("Zaira Perez");
        universidad.agregarEstudiantes("Maria Castañeda");
        universidad.agregarEstudiantes("Maria Castañeda");


        universidad.mostrarEstudiantes();

        universidad.primerEstudiante();
        universidad.ultimoEstudiante();
    }


}
