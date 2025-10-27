
package Ejercicio2;

public class Principal {
    public static void main(String[] args) {
        // Creamos la batería (puede existir sola)
        Bateria b1 = new Bateria("Samsung-BA40", 5000);

        // Creamos el celular (que "tiene" una batería)
        Celular c1 = new Celular("123456789", "Samsung", "Galaxy S22", b1);

        // Creamos el usuario
        Usuario u1 = new Usuario("Facundo Arrieta", "30.123.456");

        // Enlazamos el usuario con el celular
        c1.setUsuario(u1);

        // Mostramos información
        System.out.println(c1);
        System.out.println(u1);
        System.out.println(c1.getBateria());
    }
}

