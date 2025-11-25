
package trabajopráctico_coleccionesysistemas_arrietafacundo;

public class PrincipalBiblioteca {

    public static void main(String[] args) {
        // 1. Creamos una biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Municipal Las Heras");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A01", "Julio Cortázar", "Argentina");
        Autor a2 = new Autor("A02", "Gabriel García Márquez", "Colombia");
        Autor a3 = new Autor("A03", "J. K. Rowling", "Reino Unido");

        // 3. Agregar 5 libros asociados a alguno de los autores
        biblio.agregarLibro("ISBN-001", "Rayuela", 1963, a1);
        biblio.agregarLibro("ISBN-002", "Bestiario", 1951, a1);
        biblio.agregarLibro("ISBN-003", "Cien años de soledad", 1967, a2);
        biblio.agregarLibro("ISBN-004", "El amor en los tiempos del cólera", 1985, a2);
        biblio.agregarLibro("ISBN-005", "Harry Potter y la piedra filosofal", 1997, a3);

        // 4. Listar todos los libros
        biblio.listarLibros();

        // 5. Buscar un libro por ISBN
        System.out.println("\nBuscando libro ISBN-003:");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN-003");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 6. Filtrar por año específico
        System.out.println("\nLibros del año 1967:");
        biblio.filtrarLibrosPorAnio(1967);

        // 7. Eliminar un libro por ISBN y listar de nuevo
        System.out.println("\nEliminando libro ISBN-002...");
        biblio.eliminarLibro("ISBN-002");
        biblio.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblio.obtenerCantidadLibros());

        // 9. Listar autores disponibles
        System.out.println("\nAutores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }
}

