
package interfacesyexcepciones.facu.arrieta;



import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "CREADO";
        notificarCambioEstado();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambioEstado();
    }

    private void notificarCambioEstado() {
        if (cliente != null) {
            cliente.notificar("El pedido ha cambiado de estado a: " + estado);
        }
    }
}
