package pe.edu.utp.fersys.facade;

import pe.edu.utp.fersys.modelo.producto.Producto;
import pe.edu.utp.fersys.modelo.venta.Venta;

// Simplifica el registro de productos y el resumen de una venta.
public class VentaFacade {

    private Venta venta;

    // Recibe la venta que sera administrada por la fachada.
    public VentaFacade(Venta venta) {
        if (venta == null) {
            throw new IllegalArgumentException("La venta no puede ser nula.");
        }

        this.venta = venta;
    }

    // Registra un producto ocultando la validacion interna de stock.
    public boolean registrarProducto(Producto producto, int cantidad) {
        if (producto == null) {
            return false;
        }

        if (cantidad <= 0) {
            return false;
        }

        return venta.agregarDetalle(producto, cantidad);
    }

    // Muestra el comprobante delegando el detalle a la venta interna.
    public void mostrarResumen() {
        venta.mostrarResumenVenta();
    }
}
