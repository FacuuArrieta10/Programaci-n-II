
package herenciaypolimorfismo.arrieta.facundo;

public class PrincipalFigura {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo("Círculo 1", 3.0);
        figuras[1] = new Rectangulo("Rectángulo 1", 4.0, 5.0);
        figuras[2] = new Circulo("Círculo 2", 1.5);

        for (int i = 0; i < figuras.length; i++) {
            Figura f = figuras[i];
            System.out.println("Figura: " + f.getNombre());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("--------------------");
        }
    }
}
