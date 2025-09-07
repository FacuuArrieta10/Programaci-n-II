package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    // Método para pedir un entero
    static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    // Método para verificar si un año es bisiesto
    static void anioBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio = pedirEntero(input, "Por favor ingrese un anio: ");

        // Usamos el método anioBisiesto para imprimir el resultado
        anioBisiesto(anio);
    }
    
}
