
package Ejercicio4;

public class TarjetaDeCrédito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // asociación bidireccional
    private Banco banco;     // agregación

    public TarjetaDeCrédito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }

    // vincula ambos lados de la relación bidireccional
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.setTarjeta(this);
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento +
               ", cliente=" + (cliente != null ? cliente.getNombre() : "sin cliente") +
               ", banco=" + (banco != null ? banco.getNombre() : "sin banco") + "]";
    }
}
