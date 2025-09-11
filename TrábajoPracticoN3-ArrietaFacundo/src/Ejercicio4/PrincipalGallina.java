
package Ejercicio4;


public class PrincipalGallina {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        // Inicializar con setters
        g1.setIdGallina(1);
        g1.setEdad(2);
        g1.setHuevosPuestos(5);

        g2.setIdGallina(2);
        g2.setEdad(1);
        g2.setHuevosPuestos(3);

        // Simular acciones
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        // Mostrar estado final
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
