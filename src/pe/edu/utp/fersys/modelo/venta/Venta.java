package pe.edu.utp.fersys.modelo.venta;

import pe.edu.utp.fersys.modelo.cliente.Cliente;
import pe.edu.utp.fersys.modelo.producto.Producto;
import pe.edu.utp.fersys.modelo.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

// Agrupa detalles de venta y calcula los importes comerciales del comprobante.
public class Venta {
    private String idVenta;
    private Cliente cliente;
    private Usuario usuario;
    private List<DetalleVenta> detalles;
    private static final double PORCENTAJE_IGV = 0.18;

    // Crea una venta vacia asociada a un cliente y al usuario vendedor.
    public Venta(String idVenta, Cliente cliente, Usuario usuario) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.usuario = usuario;
        this.detalles = new ArrayList<>();
    }

    // Agrega una linea de venta solo si el producto tiene stock suficiente.
    public boolean agregarDetalle(Producto producto, int cantidad) {
        if (producto == null || !producto.tieneStockDisponible(cantidad)) {
            return false;
        }

        producto.reducirStock(cantidad);
        detalles.add(new DetalleVenta(producto, cantidad));
        return true;
    }

    // Suma los subtotales de todos los detalles registrados.
    public double calcularSubtotal() {
        double subtotal = 0;

        for (DetalleVenta detalle : detalles) {
            subtotal += detalle.calcularSubtotal();
        }

        return subtotal;
    }

    // Calcula el IGV aplicando el 18 por ciento al subtotal.
    public double calcularIgv() {
        return calcularSubtotal() * PORCENTAJE_IGV;
    }

    // Calcula el total final sumando subtotal e IGV.
    public double calcularTotal() {
        return calcularSubtotal() + calcularIgv();
    }

    // Imprime un resumen simple para validar la venta desde consola.
    public void mostrarResumenVenta() {
        System.out.println("Venta: " + idVenta);

        for (DetalleVenta detalle : detalles) {
            System.out.printf("%s x %d = S/ %.2f%n",
                    detalle.obtenerProducto().obtenerNombre(),
                    detalle.obtenerCantidad(),
                    detalle.calcularSubtotal());
        }

        System.out.printf("Subtotal: S/ %.2f%n", calcularSubtotal());
        System.out.printf("IGV: S/ %.2f%n", calcularIgv());
        System.out.printf("Total: S/ %.2f%n", calcularTotal());
    }
}
