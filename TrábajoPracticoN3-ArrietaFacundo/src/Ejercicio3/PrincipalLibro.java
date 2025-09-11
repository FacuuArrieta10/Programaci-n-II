
package Ejercicio3;


public class PrincipalLibro {


    public static void main(String[] args) {
      
       
        Libro libro1 = new Libro();

        
        libro1.setTitulo("El Principito");
        libro1.setAutor("Antoine de Saint-Exupery");
        libro1.setAnioPublicacion(1943);

        libro1.mostrarInfo();

      
        libro1.setAnioPublicacion(-100);

        
        libro1.setAnioPublicacion(2000);

      
        libro1.mostrarInfo();
        
        
    }
}

        
        
        
    

    


