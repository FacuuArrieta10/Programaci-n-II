
package herenciaypolimorfismo.arrieta.facundo;

public class Vaca extends Animal {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuu");
    }
}
