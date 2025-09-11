
package Ejercicio3;


public class Libro {
    // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int anioPublicacion;

   
    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    
    // Setters
    public void setTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }

    public void setAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }
    
    // Setter con validación
    public void setAnioPublicacion(int nuevoAnio) {
        if (nuevoAnio > 0 && nuevoAnio <= 2025) {
            anioPublicacion = nuevoAnio;
        } else {
            System.out.println("Anio invalido: " + nuevoAnio);
        }
    }

    // Método para mostrar info
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo +
                           " | Autor: " + autor +
                           " | Anio: " + anioPublicacion);
    }
}
