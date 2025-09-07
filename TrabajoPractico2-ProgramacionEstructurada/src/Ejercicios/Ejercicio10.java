package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    // Método para pedir un número entero
    static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    // Método para actualizar stock
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de actualización de stock.");

        int stockActual = pedirEntero(input, "Ingrese el stock actual del producto: ");
        int cantidadVendida = pedirEntero(input, "Ingrese la cantidad vendida: ");
        int cantidadRecibida = pedirEntero(input, "Ingrese la cantidad recibida: ");

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
}
