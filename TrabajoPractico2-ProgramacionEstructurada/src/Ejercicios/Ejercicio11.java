package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    // 🔹 Variable global (10% de descuento)
    static double DESCUENTO_ESPECIAL = 0.10;

    // Método para pedir un número decimal
    static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    // Método para calcular descuento usando la variable global
    static void calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de descuento especial.");

        double precio = pedirDouble(input, "Ingrese el precio del producto: ");

        calcularDescuentoEspecial(precio);
    }
}
 