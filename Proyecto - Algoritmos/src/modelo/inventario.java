package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class inventario implements Serializable {
    private static final long serialVersionUID = 1L;
    private bodega bodega;
    private List<Producto> listaproductos;
    private List<Integer> cantidadporproducto;

    public inventario() { listaproductos = new ArrayList<>(); cantidadporproducto = new ArrayList<>(); }
    public inventario(bodega bodega, List<Producto> productos, List<Integer> cantidades) {
        this(); this.bodega = bodega;
        if (productos != null && cantidades != null && productos.size() == cantidades.size()) {
            listaproductos.addAll(productos); cantidadporproducto.addAll(cantidades);
        }
    }
    public bodega getbodega() { return bodega; }
    public void setbodega(bodega bodega) { this.bodega = bodega; }
    public List<Producto> getlistaproductos() { return listaproductos; }
    public void setlistaproductos(List<Producto> productos) { listaproductos = productos == null ? new ArrayList<>() : productos; }
    public List<Integer> getcantidadporproducto() { return cantidadporproducto; }
    public void setcantidadporproducto(List<Integer> cantidades) { cantidadporproducto = cantidades == null ? new ArrayList<>() : cantidades; }
    public int consultarCantidad(String codigo) { int i = buscar(codigo); return i < 0 ? 0 : cantidadporproducto.get(i); }
    private int buscar(String codigo) { for (int i=0;i<listaproductos.size();i++) if (listaproductos.get(i).getCodigo().equalsIgnoreCase(codigo)) return i; return -1; }
    public void agregarStock(Producto p, int cantidad) {
        if (p == null || cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        int i=buscar(p.getCodigo()); if(i<0){listaproductos.add(p);cantidadporproducto.add(cantidad);} else cantidadporproducto.set(i,cantidadporproducto.get(i)+cantidad);
    }
    public void retirarStock(String codigo, int cantidad) {
        if(cantidad<=0) throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        int i=buscar(codigo); if(i<0) throw new IllegalArgumentException("El producto no está en el inventario.");
        if(cantidadporproducto.get(i)<cantidad) throw new IllegalArgumentException("No hay suficiente existencia.");
        cantidadporproducto.set(i,cantidadporproducto.get(i)-cantidad);
    }
    public String toString() { return "Inventario de " + (bodega == null ? "bodega sin asignar" : bodega.getidbodega()) + " - Productos: " + listaproductos.size(); }
}
