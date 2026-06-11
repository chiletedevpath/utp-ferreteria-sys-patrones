package pe.edu.utp.fersys.app;

import pe.edu.utp.fersys.factory.ProductoFactory;
import pe.edu.utp.fersys.modelo.cliente.Cliente;
import pe.edu.utp.fersys.modelo.cliente.TipoCliente;
import pe.edu.utp.fersys.modelo.producto.Producto;
import pe.edu.utp.fersys.modelo.usuario.RolUsuario;
import pe.edu.utp.fersys.modelo.usuario.Usuario;
import pe.edu.utp.fersys.modelo.venta.Venta;

/**
 * Punto de entrada para validar por consola el modelo base de FerreSys.
 */
public class Main {
    /**
     * Crea objetos de prueba y muestra su informacion basica.
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                1, "73748381", "Adrian", "Pisco Soto", "945834043",
                "correo@nuevo.com", "San Salvador", "COD001", TipoCliente.NORMAL
        );

        Usuario usuario = new Usuario(
                1, "25146987", "Kerosene", "Leon", "987524123",
                "kero@correo.com", "Av. Kero Perdido", "kero", "admin123",
                RolUsuario.ADMINISTRADOR
        );

        System.out.println("=== CLIENTE ===");
        cliente.mostrarInformacionBasica();

        System.out.println();

        System.out.println("=== USUARIO ===");
        usuario.mostrarInformacionBasica();

        ProductoFactory pf = new ProductoFactory();
        Producto barreta = pf.crearProductoConstruccion();
        Producto pintura = pf.crearProductoPintura();
        Producto martillo = pf.crearProductoHerramienta();

        Venta venta = new Venta("VENTA001", cliente, usuario);

        if (venta.agregarDetalle(barreta, 2)) {
            System.out.println("Producto de construccion agregado a la venta.");
        }

        if (venta.agregarDetalle(pintura, 8)) {
            System.out.println("Pintura agregada a la venta.");
        } else {
            System.out.println("No se pudo agregar pintura: stock insuficiente.");
        }

        if (venta.agregarDetalle(martillo, 3)) {
            System.out.println("Herramienta agregada a la venta.");
        }

        System.out.println();
        System.out.println("=== VENTA ===");
        venta.mostrarResumenVenta();
    }
}
