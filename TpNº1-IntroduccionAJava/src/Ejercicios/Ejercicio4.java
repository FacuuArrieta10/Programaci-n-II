
package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

   
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        
       System.out.print("Ingresa tu nombre: ");
       nombre = input.nextLine();
        
       System.out.print("Ingresa tu edad: ");
       edad = Integer.parseInt(input.nextLine());
       
       
       System.out.println("Tu nombre es: " + nombre);
       System.out.println("Tu edad es: " + edad);
       
    }

}
