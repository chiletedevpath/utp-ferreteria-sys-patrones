package pe.edu.utp.fersys.modelo.venta;

import pe.edu.utp.fersys.modelo.producto.Producto;

/**
 * Representa una linea de venta compuesta por producto, cantidad y precio.
 */
public class DetalleVenta {
    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    /**
     * Congela el precio del producto al momento de registrar la venta.
     */
    public DetalleVenta(Producto producto, int cantidad) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
        }

        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = producto.obtenerPrecio();
    }

    /**
     * Calcula el importe de esta linea de venta.
     */
    public double calcularSubtotal() {
        return this.cantidad * this.precioUnitario;
    }

    /**
     * Devuelve el producto asociado al detalle.
     */
    public Producto obtenerProducto() {
        return this.producto;
    }

    /**
     * Devuelve la cantidad vendida del producto.
     */
    public int obtenerCantidad() {
        return this.cantidad;
    }
}
