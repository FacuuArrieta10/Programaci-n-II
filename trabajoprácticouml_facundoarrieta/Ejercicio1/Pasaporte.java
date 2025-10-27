
package trabajoprácticouml_facundoarrieta.Ejercicio1;


import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;          // composición
    private Titular titular;    // asociación bidireccional

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    // Método para vincular el titular
    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this); // mantiene la relación doble
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision + 
               ", titular=" + (titular != null ? titular.getNombre() : "sin titular") + "]";
    }
}
