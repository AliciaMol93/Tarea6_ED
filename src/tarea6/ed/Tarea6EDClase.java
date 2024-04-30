package tarea6.ed;

public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_MAYOR;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_DIFERENTE_CERO;
            enviarMensaje(total);
        } else {
            total = precioProducto * DESCUENTO_CERO;
            enviarMensaje(total);
        }

    }

    //Extracción constantes
    private static final int DESCUENTO_MAYOR = 5;
    private static final double DESCUENTO_CERO = 0.95;
    private static final double DESCUENTO_DIFERENTE_CERO = 0.8;

    //Extracción de método
    private void enviarMensaje(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
