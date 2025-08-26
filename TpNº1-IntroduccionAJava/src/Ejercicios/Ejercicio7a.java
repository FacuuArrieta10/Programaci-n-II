
package Ejercicios;
import java.util.Scanner;

public class Ejercicio7a {
    
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        double a = input.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        double b = input.nextInt();

        double resultado = a / b;
        System.out.println("Resultado de la división entera: " + resultado);
    }
}


