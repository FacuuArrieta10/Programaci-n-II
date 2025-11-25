
package interfacesyexcepciones.facu.arrieta;


import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese numerador: ");
            int a = sc.nextInt();

            System.out.print("Ingrese denominador: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }

        System.out.println("Programa finalizado.");
    }
}
