
package Ejercicio4;


public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Setters
    public void setIdGallina(int nuevoId) {
        idGallina = nuevoId;
    }

    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public void setHuevosPuestos(int cantidad) {
        huevosPuestos = cantidad;
    }

    // Métodos requeridos
    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + 
                           " | Edad: " + edad + " anios" + 
                           " | Huevos puestos: " + huevosPuestos);
    }
}

