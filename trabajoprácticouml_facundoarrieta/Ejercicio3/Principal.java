
package Ejercicio3;

public class Principal {
    public static void main(String[] args) {
        // Creamos el autor
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiana");

        // Creamos la editorial
        Editorial e1 = new Editorial("Editorial Sudamericana", "Buenos Aires, Argentina");

        // Creamos el libro con sus relaciones
        Libro l1 = new Libro("Cien años de soledad", "978-950-07-4222-1", a1, e1);

        // Mostramos los datos
        System.out.println(l1);
        System.out.println(a1);
        System.out.println(e1);
    }
}
