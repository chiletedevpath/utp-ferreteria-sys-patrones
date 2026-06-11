package pe.edu.utp.fersys.factory;

import pe.edu.utp.fersys.modelo.producto.Categoria;
import pe.edu.utp.fersys.modelo.producto.Producto;

// Centraliza la creacion de productos preconfigurados para desacoplar el Main.
public class ProductoFactory {

    // Crea un producto de herramientas con datos base de inventario.
    public Producto crearProductoHerramienta() {
        return new Producto(
                "PROD001", "Martillo de acero",
                "Herramienta manual para trabajos de construccion", 25.00,
                10, 2, Categoria.HERRAMIENTAS
        );
    }

    // Crea un producto de pinturas con stock reducido para probar validaciones.
    public Producto crearProductoPintura() {
        return new Producto(
                "PROD002", "Pintura blanca 1 galon",
                "Pintura latex para interiores", 38.00, 5, 1, Categoria.PINTURAS
        );

    }

    // Crea un producto electrico usado como ejemplo de categoria especializada.
    public Producto crearProductoElectrico() {
        return new Producto(
                "PROD003", "Multimetro", "Color rojo-negro", 256.00, 2, 1,
                Categoria.ELECTRICIDAD
        );
    }

    // Crea un producto de construccion con precio y stock inicial definidos.
    public Producto crearProductoConstruccion() {
        return new Producto(
                "PROD004", "Barreta", "50 kg", 123.99, 4, 1,
                Categoria.CONSTRUCCION
        );

    }
}
