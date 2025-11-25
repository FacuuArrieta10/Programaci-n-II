
package trabajopráctico_coleccionesysistemas_arrietafacundo;

public class PrincipalInventario {
    public static void main(String[] args) {

        Inventario inv = new Inventario();

        // 1. Crear productos
        inv.agregarProducto(new Producto("P01", "Yerba", 1200, 10, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P02", "Celular", 250000, 5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P03", "Remera", 3500, 20, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P04", "Silla", 18000, 3, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P05", "Galletas", 900, 15, CategoriaProducto.ALIMENTOS));

        // 2. Listar productos
        inv.listarProductos();

        // 3. Buscar por ID
        System.out.println("\nProducto buscado:");
        Producto p = inv.buscarProductoPorId("P03");
        if (p != null) p.mostrarInfo();

        // 4. Filtrar por categoría
        System.out.println("\nProductos ELECTRONICA:");
        inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar producto
        inv.eliminarProducto("P04");
        System.out.println("\nLuego de eliminar P04:");
        inv.listarProductos();

        // 6. Actualizar stock
        inv.actualizarStock("P01", 25);

        // 7. Total stock
        System.out.println("\nTotal stock: " + inv.obtenerTotalStock());

        // 8. Mayor stock
        System.out.println("\nProducto con mayor stock:");
        inv.obtenerProductoConMayorStock().mostrarInfo();

        // 9. Filtrar por precio
        System.out.println("\nProductos entre $1000 y $3000:");
        inv.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías
        System.out.println("\nCategorías disponibles:");
        inv.mostrarCategoriasDisponibles();
    }
}

