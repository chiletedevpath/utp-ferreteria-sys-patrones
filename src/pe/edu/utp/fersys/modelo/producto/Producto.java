package pe.edu.utp.fersys.modelo.producto;

// Representa un articulo de venta y controla sus reglas basicas de stock.
public class Producto {
    private String idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private int stockMinimo;
    private Categoria categoria;

    // Crea un producto con precio y stock no negativos.
    public Producto(
            String idProducto,
            String nombre,
            String descripcion,
            double precio,
            int stock,
            int stockMinimo,
            Categoria categoria
    ) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = Math.max(precio, 0);
        this.stock = Math.max(stock, 0);
        this.stockMinimo = Math.max(stockMinimo, 0);
        this.categoria = categoria;
    }

    // Devuelve el precio vigente usado al crear detalles de venta.
    public double obtenerPrecio() {
        return this.precio;
    }

    // Devuelve el nombre comercial del producto para reportes simples.
    public String obtenerNombre() {
        return this.nombre;
    }

    // Devuelve las unidades disponibles en inventario.
    public int obtenerStock() {
        return this.stock;
    }

    // Verifica si el inventario alcanza para una cantidad solicitada.
    public boolean tieneStockDisponible(int cantidad) {
        return cantidad > 0 && this.stock >= cantidad;
    }

    // Descuenta unidades solo si la operacion no deja stock negativo.
    public boolean reducirStock(int cantidad) {
        if (tieneStockDisponible(cantidad)) {
            this.stock -= cantidad;
            return true;
        }
        return false;
    }

    // Indica si el stock actual llego o bajo del minimo configurado.
    public boolean estaBajoStock() {
        return this.stock <= this.stockMinimo;
    }
}
