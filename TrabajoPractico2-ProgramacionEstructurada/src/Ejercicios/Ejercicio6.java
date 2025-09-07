package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    // Método para pedir un entero
    static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    // Método que cuenta positivos, negativos y ceros
    static void contarNumeros(Scanner sc) {
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.println("Bienvenido, este es un contador de números positivos, negativos y ceros.");

        for (int i = 1; i <= 10; i++) {
            int num = pedirEntero(sc, "Ingrese el número " + i + ": ");

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        contarNumeros(input);
    }
}
