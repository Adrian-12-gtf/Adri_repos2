package tienda;
import tienda.Producto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;


public class InventarioTest2 {
    private Inventario inventario;
    @BeforeEach
    void setUp() {
        inventario = new Inventario();
    }
    @Test
    void testActualizarStock() {
        Producto producto = new Producto("P003", "Producto 3", 200.0, 8);
        inventario.añadirProducto(producto);
        inventario.actualizarStock("P003", 20);
        Producto actualizado = inventario.buscarProductoPorCodigo("P003");
        assertNotNull(actualizado, "El producto debería existir");
        assertEquals(20, actualizado.getStock(), "El stock del producto no se actualizó correctamente");
    }

    @Test
    void testAñadirProducto() {
        Producto producto = new Producto("P001", "Producto 1", 100.0, 10);
        inventario.añadirProducto(producto);
        Producto encontrado = inventario.buscarProductoPorCodigo("P001");
        assertNotNull(encontrado, "El producto debería haber sido añadido");
        assertEquals("P001", encontrado.getCodigo(), "El código del producto no coincide");
    }
    @Test
    void testBuscarProductoPorCodigoNoExistente() {
        Producto producto = inventario.buscarProductoPorCodigo("P999");
        assertNull(producto, "No debería encontrarse un producto con un código inexistente");
    }

    @Test
    void testEliminarProducto() {
        Producto producto = new Producto("P002", "Producto 2", 150.0, 5);
        inventario.añadirProducto(producto);
        inventario.eliminarProducto("P002");
        Producto eliminado = inventario.buscarProductoPorCodigo("P002");
        assertNull(eliminado, "El producto debería haber sido eliminado");
    }

    @Test
    void testListarProductos() {
        Producto producto1 = new Producto("P004", "Producto 4", 50.0, 3);
        Producto producto2 = new Producto("P005", "Producto 5", 75.0, 6);
        inventario.añadirProducto(producto1);
        inventario.añadirProducto(producto2);
        List<Producto> productos = inventario.listarProductos();
        assertEquals(2, productos.size(), "El número de productos en el inventario no es correcto");
    }
}
