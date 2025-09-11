
package Ejercicio2;


public class Mascota {
    
    String nombre;
    String especie;
    double edad;
    int año = 2025;
    
    //Metodo para mostrar info
    void mostrarInfo() {
        System.out.println(nombre  + " " + especie + " " + edad);
    }
    
    //Metodo para simular tiempo y cumplir año

    void cumplirAnios(){
        for (int i = 0; i < 10; i++) {
            año ++;
            edad ++;
            System.out.println("Estamos en el anio " + año);
            System.out.println("Tu mascota " + nombre + " ha cumplido un anio mas, Ahora tiene " + edad + " anios.");
        }
    }
    
    //Seters
    
     public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
     
    }
     
      public void setEspecie(String nuevaEspecie) {
        especie = nuevaEspecie;
    }
      
       public void setEdad(double nuevaEdad) {
        edad = nuevaEdad;
    }
    
}
