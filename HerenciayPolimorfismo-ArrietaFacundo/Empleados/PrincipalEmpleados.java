
package herenciaypolimorfismo.arrieta.facundo;

import java.util.ArrayList;

public class PrincipalEmpleados {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Juan Pérez", 150000));
        empleados.add(new EmpleadoTemporal("Ana López", 120, 1200));
        empleados.add(new EmpleadoPlanta("Carlos Gómez", 180000));

        for (Empleado e : empleados) {

            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }

            System.out.println("---------------------------");
        }
    }
}
