
package trabajopráctico_coleccionesysistemas_arrietafacundo;

public class PrincipalUniversidad {

    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad de Las Heras");

        // 1. Crear al menos 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("PR01", "Ana Gómez", "Matemática");
        Profesor prof2 = new Profesor("PR02", "Luis Pérez", "Programación");
        Profesor prof3 = new Profesor("PR03", "María López", "Historia");

        Curso c1 = new Curso("C001", "Álgebra I");
        Curso c2 = new Curso("C002", "Programación I");
        Curso c3 = new Curso("C003", "Programación II");
        Curso c4 = new Curso("C004", "Historia Argentina");
        Curso c5 = new Curso("C005", "Bases de Datos");

        // 2. Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "PR01");
        uni.asignarProfesorACurso("C002", "PR02");
        uni.asignarProfesorACurso("C003", "PR02");
        uni.asignarProfesorACurso("C004", "PR03");
        uni.asignarProfesorACurso("C005", "PR02");

        // 4. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("=== Cursos con sus profesores ===");
        uni.listarCursos();
        System.out.println("\n=== Profesores con sus cursos ===");
        for (Profesor p : new Profesor[]{prof1, prof2, prof3}) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println();
        }

        // 5. Cambiar el profesor de un curso
        System.out.println("Cambiando el profesor de C003 a PR03...");
        uni.asignarProfesorACurso("C003", "PR03");
        uni.listarCursos();
        System.out.println();
        prof2.listarCursos();
        prof3.listarCursos();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\nEliminando curso C002...");
        uni.eliminarCurso("C002");
        uni.listarCursos();
        System.out.println();
        prof2.listarCursos();

        // 7. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\nEliminando profesor PR03...");
        uni.eliminarProfesor("PR03");
        uni.listarProfesores();
        System.out.println("\nCursos luego de eliminar PR03:");
        uni.listarCursos();

        // 8. Reporte: cantidad de cursos por profesor
        System.out.println();
        uni.reporteCantidadCursosPorProfesor();
    }
}

