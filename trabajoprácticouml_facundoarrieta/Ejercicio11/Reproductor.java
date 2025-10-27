
package Ejercicio11;

public class Reproductor {

    // Dependencia de uso: usa una Cancion, pero no la guarda
    public void reproducir(Cancion cancion) {
        System.out.println(" Reproduciendo: " + cancion.getTitulo() + 
                           " - " + cancion.getArtista().getNombre());
    }
}
