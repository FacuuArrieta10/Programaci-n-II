
package herenciaypolimorfismo.arrieta.facundo;

import java.util.ArrayList;

public class PrincipalAnimales {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishi"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();   // mismo mensaje -> distintas salidas según el tipo
            a.hacerSonido();       // polimorfismo en acción
            System.out.println("--------------------");
        }
    }
}
