
package interfacesyexcepciones.facu.arrieta;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadInvalidaException {

        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: debe estar entre 0 y 120.");
        }

        this.nombre = nombre;
        this.edad = edad;
    }
}
