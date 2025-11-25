
package interfacesyexcepciones.facu.arrieta;


public class TarjetaCredito implements Pago, PagoConDescuento {

    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo: 10% de descuento con tarjeta
        double descuento = monto * 0.10;
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Pagando $" + montoFinal + " con Tarjeta de " + titular);
    }
}
