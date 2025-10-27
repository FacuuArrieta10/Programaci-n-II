
package Ejercicio6;

public class Principal {
    public static void main(String[] args) {
        // Creamos el cliente
        Cliente c1 = new Cliente("Facundo Arrieta", "261-1234567");

        // Creamos la mesa
        Mesa m1 = new Mesa(5, 4);

        // Creamos la reserva (que conoce al cliente y la mesa)
        Reserva r1 = new Reserva("23/10/2025", "21:00", c1, m1);

        // Mostramos los datos
        System.out.println(r1);
        System.out.println(c1);
        System.out.println(m1);
    }
}

