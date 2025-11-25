
package interfacesyexcepciones.facu.arrieta;



public class PrincipalEComerce {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Facu", "facu@mail.com");

        Producto p1 = new Producto("Mouse", 5000);
        Producto p2 = new Producto("Teclado", 8000);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        double total = pedido.calcularTotal();
        System.out.println("Total pedido: $" + total);

        Pago pagoTarjeta = new TarjetaCredito("1234-5678-9999", "Facu");
        pagoTarjeta.procesarPago(total);

        pedido.cambiarEstado("PAGADO");
        pedido.cambiarEstado("ENVIADO");
    }
}

