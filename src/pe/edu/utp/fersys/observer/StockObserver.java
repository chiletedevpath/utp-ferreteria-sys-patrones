package pe.edu.utp.fersys.observer;

import pe.edu.utp.fersys.modelo.producto.Producto;

// Define el contrato para reaccionar ante cambios de stock.
public interface StockObserver {

    // Recibe el producto cuyo stock fue modificado.
    void actualizar(Producto producto);
}
