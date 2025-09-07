package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    // Método para pedir número decimal
    static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    // Método para pedir texto
    static String pedirString(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    // a) Método para calcular costo de envío
    static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costo = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costo = peso * 10;
        } else {
            System.out.println("Zona inválida. Se tomará costo 0.");
        }

        return costo;
    }

    // b) Método para calcular el total de compra
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de costo de envío y total de compra.");

        double precioProducto = pedirDouble(input, "Ingrese el precio del producto: ");
        double peso = pedirDouble(input, "Ingrese el peso del paquete en kg: ");
        String zona = pedirString(input, "Ingrese la zona de envío (Nacional/Internacional): ");

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}
