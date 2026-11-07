package modelo;
import java.io.Serializable;
public class DetalleOrden implements Serializable {
    private static final long serialVersionUID = 1L;
    private Producto producto; private int cantidad;
    public DetalleOrden(Producto producto, int cantidad) { if(producto==null || cantidad<=0) throw new IllegalArgumentException("Producto y cantidad válidos son necesarios."); this.producto=producto; this.cantidad=cantidad; }
    public Producto getProducto(){return producto;} public int getCantidad(){return cantidad;}
    public double getSubtotal(){return producto.getPrecio()*cantidad;}
    public String toString(){return producto.getNombre()+" x "+cantidad+" = Q"+String.format("%.2f",getSubtotal());}
}
