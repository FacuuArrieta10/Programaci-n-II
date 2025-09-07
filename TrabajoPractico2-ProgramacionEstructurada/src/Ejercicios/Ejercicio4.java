package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    // Método para pedir un número decimal (precio)
    static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    // Método para pedir un String (categoría)
    static String pedirString(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().toUpperCase(); // lo pasamos a mayúsculas para evitar problemas
    }

    // Método para calcular y mostrar el descuento
    static void calcularDescuento(double precio, String categoria) {
        double descuento = 0;

        switch (categoria) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida.");
                return; 
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precio = pedirDouble(input, "Ingrese el precio del producto: ");
        String categoria = pedirString(input, "Ingrese la categoría del producto (A, B o C): ");

        calcularDescuento(precio, categoria);
    }
}
