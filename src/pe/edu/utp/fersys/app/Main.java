package pe.edu.utp.fersys.app;

import pe.edu.utp.fersys.modelo.cliente.Cliente;
import pe.edu.utp.fersys.modelo.cliente.TipoCliente;
import pe.edu.utp.fersys.modelo.usuario.RolUsuario;
import pe.edu.utp.fersys.modelo.usuario.Usuario;

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
    }
}
