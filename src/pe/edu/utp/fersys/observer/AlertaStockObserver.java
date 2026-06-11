package pe.edu.utp.fersys.observer;

import pe.edu.utp.fersys.modelo.producto.Producto;

// Muestra una alerta cuando un producto llega al stock minimo.
public class AlertaStockObserver implements StockObserver {

    // Revisa el producto notificado y alerta si requiere reposicion.
    @Override
    public void actualizar(Producto producto) {
        if (producto.estaBajoStock()) {
            System.out.printf("ALERTA: %s llego al stock minimo. Stock actual: %d%n",
                    producto.obtenerNombre(),
                    producto.obtenerStock());
        }
    }
}
