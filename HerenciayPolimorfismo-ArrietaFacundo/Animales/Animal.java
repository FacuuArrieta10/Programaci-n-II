
package herenciaypolimorfismo.arrieta.facundo;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void describirAnimal() {
        System.out.println("Soy un " + this.getClass().getSimpleName() +
                           " y me llamo " + nombre);
    }

    // Método que las subclases deben implementar
    public abstract void hacerSonido();
}
