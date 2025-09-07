package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    // Método para pedir un número decimal
    static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    // Método para calcular el precio final
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase 
                           + (precioBase * impuesto) / 100 
                           - (precioBase * descuento) / 100;
        return precioFinal;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de precio final de un producto.");

        double precioBase = pedirDouble(input, "Ingrese el precio base del producto: ");
        double impuesto = pedirDouble(input, "Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double descuento = pedirDouble(input, "Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
