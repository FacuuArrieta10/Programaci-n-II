
package Ejercicios;

import java.util.Scanner;

public class OperacionesEjercicio5 {

 
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int suma, resta, multiplicacion, division;
   
        Scanner input = new Scanner(System.in);
        
      System.out.print("Ingrese un numero entero: ");
      num1 = Integer.parseInt(input.nextLine());
        
      System.out.print("Ingrese el segundo numero entero: ");
      num2 = Integer.parseInt(input.nextLine());
      
      suma = num1 + num2;
      resta = num1 - num2;
      multiplicacion = num1 * num2;
      division = num1 / num2;
      
      System.out.println("El resultado de la suma es: " + suma);
      System.out.println("El resultado de la resta es: " + resta);
      System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
      System.out.println("El resultado de la division es: " + division);
      
    }

}
