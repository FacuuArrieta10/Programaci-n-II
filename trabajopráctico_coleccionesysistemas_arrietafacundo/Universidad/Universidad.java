
package trabajopráctico_coleccionesysistemas_arrietafacundo;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    public void listarProfesores() {
        System.out.println("Profesores de la universidad \"" + nombre + "\":");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("Cursos de la universidad \"" + nombre + "\":");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con el profesor si existe
            curso.setProfesor(null);
            cursos.remove(curso);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar los cursos sin profesor
            for (Curso c : new ArrayList<>(profesor.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("Reporte: cantidad de cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s).");
        }
    }
}
