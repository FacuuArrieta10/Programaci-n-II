
package interfacesyexcepciones.facu.arrieta;

public class PruebaEdad {

    public static void main(String[] args) {

        try {
            Persona p = new Persona("Facu", 150);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

