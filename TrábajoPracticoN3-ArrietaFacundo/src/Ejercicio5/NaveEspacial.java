
package Ejercicio5;

public class NaveEspacial {

    private String nombre;
    private double combustible = 50; // combustible inicial por defecto

    // Setter para el nombre
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    // Método despegar
    public void despegar() {
        System.out.println("La nave " + nombre + " esta despegando...");
    }

    // Método recargar
    public void recargar(double cantidad) {
        combustible += cantidad;
        System.out.println("Se recargaron " + cantidad + " unidades de combustible. "
                + "Combustible total: " + combustible);
    }

    // Método avanzar
    public void avanzar(double distancia) {
        double consumoPorKm = 0.5; // 0.5 unidades de combustible por cada km
        double consumoNecesario = distancia * consumoPorKm;

        if (combustible >= consumoNecesario) {
            combustible -= consumoNecesario;
            System.out.println("La nave avanzara " + distancia + " km. "
                + "Consumo: " + consumoNecesario + " unidades de combustible. "
                + "Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente. "
                + "Necesitas " + consumoNecesario + " unidades para avanzar " + distancia + " km.");
        }
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + 
                           " | Combustible: " + combustible);
    }
}
