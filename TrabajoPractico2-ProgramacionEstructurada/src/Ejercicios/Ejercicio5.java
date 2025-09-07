package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    
    
    // Método para pedir un entero
    static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    
    
    
    // Método para sumar números pares ingresados por el usuario
    static void sumarPares(Scanner sc) {
        int sumaPares = 0;
        int num;

        System.out.println("Bienvenido, esta es una calculadora de numeros pares.");

        num = pedirEntero(sc, "Ingrese un numero par para sumar (0 para terminar): ");

        
        //Mientras el número es distinto de 0 sigue itinerando.
        while (num != 0) {
            if (num % 2 == 0) {
                sumaPares += num;
            }
            System.out.println("La suma hasta aqui es: " + sumaPares);
            num = pedirEntero(sc, "Ingrese un numero (0 para terminar): ");
        }

        System.out.println("La suma final de los numeros pares es: " + sumaPares);
    }

    
    
    
    // Método principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sumarPares(input);
    }
}
