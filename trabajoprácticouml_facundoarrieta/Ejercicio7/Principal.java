
package Ejercicio7;

public class Principal {
    public static void main(String[] args) {
        // Creamos el motor (puede existir independientemente)
        Motor m1 = new Motor("Nafta 1.6", "MTR-98765");

        // Creamos el vehículo (que usa ese motor)
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota Yaris", m1);

        // Creamos el conductor
        Conductor c1 = new Conductor("Facundo Arrieta", "B1");

        // Vinculamos el vehículo y el conductor (bidireccional)
        v1.setConductor(c1);

        // Mostramos la información
        System.out.println(v1);
        System.out.println(c1);
        System.out.println(m1);
    }
}
