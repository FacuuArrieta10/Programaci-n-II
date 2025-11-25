package interfacesyexcepciones.facu.arrieta;

import java.util.Scanner;

public class ConversionNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No es un número válido.");
        }
    }
}
