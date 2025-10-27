
package Ejercicio13;

public class CodigoQr {
    private String valor;
    private Usuario usuario; // asociación unidireccional

    public CodigoQr(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        return "CodigoQR [valor=" + valor + ", usuario=" + usuario.getNombre() + "]";
    }
}
