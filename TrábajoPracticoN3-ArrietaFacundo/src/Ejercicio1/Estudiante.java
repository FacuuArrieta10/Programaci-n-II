
package Ejercicio1;

public class Estudiante {

    //Atributos
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    //Metodo para mostrar info
    void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - " + curso + " - " + calificacion);
    }
    
    //Metodo para subir califiación

    void subirCalificacion(double subir) {
        calificacion += subir;
    }

    //Metodo para bajar califación
    void bajarCalificacion(double bajar) {
        calificacion -= bajar;
    }
    
    //Seters

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setApellido(String nuevoApellido) {
        apellido = nuevoApellido;
    }

    public void setCurso(String nuevoCurso) {
        curso = nuevoCurso;
    }

    public void setCalificacion(double nuevaCalificacion) {
        calificacion = nuevaCalificacion;
    }
}

