
package trabajoprácticouml_facundoarrieta.Ejercicio1;


import java.time.LocalDate;

public class Principal {
    
    public static void main(String[] args) {
        Foto f1 = new Foto("foto1.jpg", "jpg");
        Pasaporte p1 = new Pasaporte("A123456", LocalDate.of(2024, 5, 1), f1);
        Titular t1 = new Titular("Facundo Arrieta", "30.123.456");

        // Asociamos el titular con el pasaporte
        p1.setTitular(t1);

        System.out.println(p1);
        System.out.println(t1);
        System.out.println(p1.getFoto());
    }
}
