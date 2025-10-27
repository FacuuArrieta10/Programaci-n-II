
package Ejercicio5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;   // composición
    private Propietario propietario; // asociación bidireccional

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }

    // Vincula ambos lados de la relación bidireccional
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", numeroSerie=" + numeroSerie +
               ", propietario=" + (propietario != null ? propietario.getNombre() : "sin propietario") + "]";
    }
}
