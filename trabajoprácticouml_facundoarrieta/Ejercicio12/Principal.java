
package Ejercicio12;

public class Principal {
    public static void main(String[] args) {
        // Creamos el contribuyente
        Contribuyente c1 = new Contribuyente("Facundo Arrieta", "20-30123456-7");

        // Creamos el impuesto asociado a ese contribuyente
        Impuesto imp1 = new Impuesto(15000.0, c1);

        // Creamos la calculadora
        Calculadora calc = new Calculadora();

        // Usamos la calculadora para calcular el impuesto (dependencia de uso)
        calc.calcular(imp1);
    }
}
