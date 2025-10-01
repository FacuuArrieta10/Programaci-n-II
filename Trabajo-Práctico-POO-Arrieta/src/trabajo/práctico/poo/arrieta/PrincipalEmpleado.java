
package trabajo.práctico.poo.arrieta;


public class PrincipalEmpleado {
    public static void main(String[] args) {
        // Usando constructor completo
        Empleado e1 = new Empleado(1001, "Ana", "Analista", 150_000);

        // Usando constructor con id automático y salario por defecto
        Empleado e2 = new Empleado("Luis", "Desarrollador");
        Empleado e3 = new Empleado("Carla", "QA");

        // Actualizaciones de salario (sobrecarga)
        e2.actualizarSalario(10.0);   // +10% sobre el salario actual (0 -> sigue 0)
        e3.actualizarSalario(25_000); // +$25.000 monto fijo

        // Ajusto salarios base para ver ambos casos más claros
        e2.setSalario(200_000);
        e2.actualizarSalario(10.0);   // ahora sí +10% → 220.000

        // Mostrar empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Total de empleados creados
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

