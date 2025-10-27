
package Ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // agregación
    private Conductor conductor; // asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }

    // Vincula ambos lados de la relación bidireccional
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }

    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", modelo=" + modelo +
               ", conductor=" + (conductor != null ? conductor.getNombre() : "sin conductor") + "]";
    }
}

