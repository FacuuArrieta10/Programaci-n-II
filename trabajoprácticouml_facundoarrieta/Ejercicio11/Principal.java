
package Ejercicio11;

public class Principal {
    public static void main(String[] args) {
        // Creamos el artista
        Artista a1 = new Artista("Chris Tomlin", "Música cristiana");

        // Creamos la canción (asociación unidireccional con el artista)
        Cancion c1 = new Cancion("How Great Is Our God", a1);

        // Creamos el reproductor
        Reproductor r1 = new Reproductor();

        // Reproducimos la canción (dependencia de uso)
        r1.reproducir(c1);
    }
}
