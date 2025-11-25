
package trabajopráctico_coleccionesysistemas_arrietafacundo;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        // Si el curso ya tenía profesor, quitarlo de la lista de ese profesor
        if (this.profesor != null) {
            this.profesor.eliminarCursoInterno(this);
        }

        this.profesor = nuevoProfesor;

        // Agregar este curso a la lista del nuevo profesor, si no es null
        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Curso: " + codigo +
                " - " + nombre +
                " | Profesor: " + nombreProfesor);
    }
}
