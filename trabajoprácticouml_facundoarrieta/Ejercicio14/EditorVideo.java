
package Ejercicio14;

public class EditorVideo {

    // Dependencia de creación: crea un Render pero no lo guarda
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("Iniciando exportación del proyecto: " + proyecto.getNombre());
        Render render = new Render(formato, proyecto); // creación del objeto
        System.out.println("Render generado en formato: " + render.getFormato());
        System.out.println("Proyecto exportado: " + render.getProyecto().getNombre());
    }
}
