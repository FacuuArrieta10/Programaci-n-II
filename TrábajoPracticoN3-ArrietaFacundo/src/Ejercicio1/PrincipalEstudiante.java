
package Ejercicio1;


public class PrincipalEstudiante {

 
    public static void main(String[] args) {
    
        Estudiante a = new Estudiante();
        
        
         a.setNombre("Facundo");
         a.setApellido("Arrieta");
         a.setCurso("Programacion");
         a.setCalificacion(8);
         
         
         a.mostrarInfo();
         a.subirCalificacion(2);
         a.mostrarInfo();
         a.bajarCalificacion(1);
         a.mostrarInfo();
    }

}
