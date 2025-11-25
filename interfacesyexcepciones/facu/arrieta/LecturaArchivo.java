package interfacesyexcepciones.facu.arrieta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void main(String[] args) {

        try {
            File archivo = new File("archivo.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
}
