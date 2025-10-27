
package Ejercicio4;

public class Principal {
    public static void main(String[] args) {
        // Creamos el banco
        Banco b1 = new Banco("Banco Nación", "30-12345678-9");

        // Creamos la tarjeta (asociada al banco)
        TarjetaDeCrédito t1 = new TarjetaDeCrédito("1234-5678-9012-3456", "12/27", b1);

        // Creamos el cliente
        Cliente c1 = new Cliente("Facundo Arrieta", "30.123.456");

        // Vinculamos tarjeta y cliente (asociación bidireccional)
        t1.setCliente(c1);

        // Mostramos los datos
        System.out.println(t1);
        System.out.println(c1);
        System.out.println(b1);
    }
}
