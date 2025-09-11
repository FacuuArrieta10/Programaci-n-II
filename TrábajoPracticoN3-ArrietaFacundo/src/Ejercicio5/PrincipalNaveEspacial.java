
package Ejercicio5;

public class PrincipalNaveEspacial {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();

        nave.setNombre("Apolo XI");
        nave.mostrarEstado();  // Muestra nombre y combustible inicial (50)

        nave.despegar();
        nave.avanzar(150);  // Sera insuficiente el combustible
        nave.mostrarEstado();

        nave.recargar(40); // +40 unidades
        nave.mostrarEstado();
        nave.avanzar(150); //El combustible es suficiente, avanza
    }
}

