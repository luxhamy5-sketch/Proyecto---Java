package modelo;
import java.io.Serializable; import java.util.ArrayList; import java.util.List;
public class ordencompra implements Serializable {
    private static final long serialVersionUID = 1L;
    private String idOrden, cliente, fecha, estado; private List<DetalleOrden> detalles; private double total; private boolean inventarioDescontado;
    public ordencompra(){detalles=new ArrayList<>(); estado="Pendiente";}
    public ordencompra(String cliente,List<Producto> productos,String fecha,double total,String estado){this();this.cliente=cliente;this.fecha=fecha;this.total=total;this.estado=estado; if(productos!=null)for(Producto p:productos)detalles.add(new DetalleOrden(p,1));}
    public ordencompra(String id,String cliente,String fecha){this();idOrden=id;this.cliente=cliente;this.fecha=fecha;}
    public String getIdOrden(){return idOrden;} public void setIdOrden(String id){idOrden=id;}
    public String getcliente(){return cliente;} public void setcliente(String c){cliente=c;}
    public String getfecha(){return fecha;} public void setfecha(String f){fecha=f;}
    public String getestado(){return estado;} public void setestado(String e){estado=e;}
    public List<DetalleOrden> getDetalles(){return detalles;} public void agregarDetalle(Producto p,int cantidad){detalles.add(new DetalleOrden(p,cantidad));calcularTotal();}
    public List<Producto> getproductos(){List<Producto> r=new ArrayList<>();for(DetalleOrden d:detalles)r.add(d.getProducto());return r;}
    public void setproductos(List<Producto> ps){detalles=new ArrayList<>();if(ps!=null)for(Producto p:ps)detalles.add(new DetalleOrden(p,1));calcularTotal();}
    public double gettotal(){calcularTotal();return total;} public void settotal(double t){total=t;}
    public boolean isInventarioDescontado(){return inventarioDescontado;} public void setInventarioDescontado(boolean v){inventarioDescontado=v;}
    public void calcularTotal(){total=0;for(DetalleOrden d:detalles)total+=d.getSubtotal();}
    public String toString(){return "Orden "+idOrden+" | Cliente: "+cliente+" | Fecha: "+fecha+" | Total: Q"+String.format("%.2f",gettotal())+" | Estado: "+estado;}
}
