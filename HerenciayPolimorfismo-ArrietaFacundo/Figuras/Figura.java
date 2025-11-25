
package herenciaypolimorfismo.arrieta.facundo;

public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto: las subclases están obligadas a implementarlo
    public abstract double calcularArea();
}
