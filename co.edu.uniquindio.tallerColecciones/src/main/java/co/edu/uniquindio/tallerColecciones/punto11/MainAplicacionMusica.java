package co.edu.uniquindio.tallerColecciones.punto11;

public class MainAplicacionMusica {
    public static void main(String[] args) {

        AplicacionMusica appMusica = new AplicacionMusica();

        appMusica.agregarCancionFavorita("Somos de Calle- Daddy Yanke");
        appMusica.agregarCancionFavorita("Angelito- Don Omar");
        appMusica.agregarCancionFavorita("La chispa adecuada- Heroes del silencio");


        appMusica.agregarCancionFavorita("La chispa adecuada- Heroes del silencio");

        appMusica.mostrarCancionesFavoritas();


    }
}
