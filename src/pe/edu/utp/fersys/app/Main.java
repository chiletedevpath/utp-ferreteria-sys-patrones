package pe.edu.utp.fersys.app;

import pe.edu.utp.fersys.modelo.cliente.Cliente;
import pe.edu.utp.fersys.modelo.cliente.TipoCliente;
import pe.edu.utp.fersys.modelo.producto.Categoria;
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
                1,
                "73748381",
                "Adrian",
                "Pisco Soto",
                "945834043",
                "correo@nuevo.com",
                "San Salvador",
                "COD001",
                TipoCliente.NORMAL
        );

        Usuario usuario = new Usuario(
                1,
                "25146987",
                "Kerosene",
                "Leon",
                "987524123",
                "kero@correo.com",
                "Av. Kero Perdido",
                "kero",
                "admin123",
                RolUsuario.ADMINISTRADOR
        );

        System.out.println("=== CLIENTE ===");
        cliente.mostrarInformacionBasica();

        System.out.println();

        System.out.println("=== USUARIO ===");
        usuario.mostrarInformacionBasica();

        Producto martillo = new Producto(
                "PROD001",
                "Martillo de acero",
                "Herramienta manual para trabajos de construccion",
                25.00,
                10,
                2,
                Categoria.HERRAMIENTAS
        );

        Producto pintura = new Producto(
                "PROD002",
                "Pintura blanca 1 galon",
                "Pintura latex para interiores",
                38.00,
                5,
                1,
                Categoria.PINTURAS
        );

        Venta venta = new Venta("VENTA001", cliente, usuario);
        venta.agregarDetalle(martillo, 2);
        venta.agregarDetalle(pintura, 1);

        System.out.println();
        System.out.println("=== VENTA ===");
        venta.mostrarResumenVenta();
    }
}
