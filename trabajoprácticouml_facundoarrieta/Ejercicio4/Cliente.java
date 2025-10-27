
package Ejercicio4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCrédito tarjeta; // relación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public TarjetaDeCrédito getTarjeta() { return tarjeta; }

    public void setTarjeta(TarjetaDeCrédito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

