
package trabajo.práctico.poo.arrieta;


public class Empleado {

    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo de clase (contador global)
    private static int totalEmpleados = 0;

    // Generador interno para IDs automáticos (ayuda a cumplir el "id automático")
    private static int nextId = 1;

    // Constructores (sobrecargados)

    // a) Recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;                   // uso de this
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;               // aumenta el contador estático

        // Mantener coherencia del generador de IDs si pasan un id grande
        if (id >= nextId) nextId = id + 1;
    }

    // b) Solo nombre y puesto: id automático y salario por defecto (0.0)
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;             // salario por defecto
        totalEmpleados++;
    }

    // --- Métodos sobrecargados actualizarSalario ---

    // Por porcentaje (ej: 10 -> +10%)
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0);
    }

    // Por monto fijo (sobrecarga cambiando el tipo del parámetro)
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // --- toString legible ---
    @Override
    public String toString() {
        return String.format("Empleado{id=%d, nombre='%s', puesto='%s', salario=%.2f}",
                id, nombre, puesto, salario);
    }

    // --- Método estático pedido ---
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // --- Getters/Setters (encapsulación) ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
