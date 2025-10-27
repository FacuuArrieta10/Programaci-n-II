
package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        // Creamos el proyecto de video
        Proyecto p1 = new Proyecto("Promo Juventudes Las Heras", 3);

        // Creamos el editor
        EditorVideo editor = new EditorVideo();

        // Exportamos el proyecto (dependencia de creación)
        editor.exportar("MP4", p1);
    }
}
