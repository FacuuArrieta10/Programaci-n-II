
package Ejercicios;

import java.util.Scanner;


public class Ejercicio3 {
    
    // Método para pedir un entero
    static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
        
}
    
    static void etapaDeVida(int edad) {
            if (edad <= 0) {
            System.out.print("Has ingresado una edad incorrecta");
        } 
        else if (edad < 12){
            System.out.print("Eres un niño");
        }
        else if (edad >= 12 && edad <= 17){
            System.out.print("Eres adolescente");
        }
        else if (edad >= 18 && edad <= 59) {
            System.out.print("Eres adulto");
        }
        else  {
            System.out.print("Eres adulto mayor");
        }
        
   }     
    
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int edad = pedirEntero(input,"Ingrese su edad, para saber en que etapa de su vida esta: ");
        
        etapaDeVida(edad);
        System.out.println();
        
        
    }

}
