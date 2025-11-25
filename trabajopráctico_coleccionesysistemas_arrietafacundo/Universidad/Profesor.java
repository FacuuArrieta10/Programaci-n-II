
package trabajopráctico_coleccionesysistemas_arrietafacundo;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Métodos "públicos" sugeridos por el enunciado

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this); // sincroniza el otro lado
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null); // romper relación
            }
        }
    }

    // Métodos internos para evitar recursión infinita cuando Curso.setProfesor los llama
    void agregarCursoInterno(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    void eliminarCursoInterno(Curso c) {
        cursos.remove(c);
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre +
                " | ID: " + id +
                " | Especialidad: " + especialidad +
                " | Cantidad de cursos: " + cursos.size());
    }
}
