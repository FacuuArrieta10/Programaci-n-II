package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    // Método para pedir un entero
    static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    // Método para validar la nota
    static void validarNota(Scanner sc) {
        int nota;

        do {
            nota = pedirEntero(sc, "Ingrese una nota (0-10): ");
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }

    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido, este programa valida una nota entre 0 y 10.");
        validarNota(input);
    }
}
