
package Ejercicios;

import java.util.Scanner;


public class Ejercicio2 {

    // Método para pedir un entero
    static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }
    
    
    
    // Método para calcular cual es mayor
    static void mayorNumero (int num1, int num2, int num3) {
            if (num1 > num2 && num1 > num3) {
            System.out.print("El número mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("El número mayor es: " + num2);
        } else {
            System.out.print("El número mayor es: " + num3);
        }}
    
    

    public static void main(String[] args) {
        
        
       Scanner input = new Scanner(System.in);
       
        int num1 = pedirEntero(input, "Por favor ingrese un numero: ");
        int num2 = pedirEntero(input, "Por favor ingrese un numero: ");
        int num3 = pedirEntero(input, "Por favor ingrese un numero: ");

        
        // llamamos a mayor número para comprobar el mayor y mostrar el resultado.
        mayorNumero(num1,num2,num3);
        System.out.println();
   
    }

}
