
package Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        // Creamos la placa madre (parte interna de la computadora)
        PlacaMadre pm1 = new PlacaMadre("ASUS B550M", "AMD B550");

        // Creamos la computadora (que contiene la placa madre)
        Computadora comp1 = new Computadora("HP", "SN12345", pm1);

        // Creamos el propietario
        Propietario p1 = new Propietario("Facundo Arrieta", "30.123.456");

        // Vinculamos el propietario con la computadora
        comp1.setPropietario(p1);

        // Mostramos los datos
        System.out.println(comp1);
        System.out.println(p1);
        System.out.println(pm1);
    }
}
