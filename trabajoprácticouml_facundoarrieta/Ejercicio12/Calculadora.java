
package Ejercicio12;

public class Calculadora {

    // Dependencia de uso: recibe un Impuesto, lo usa y no lo guarda
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        double totalConRecargo = monto * 1.21; // Ejemplo: aplicar IVA del 21%
        System.out.println("💰 Calculando impuesto para " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto base: $" + monto);
        System.out.println("Total con IVA (21%): $" + totalConRecargo);
    }
}
