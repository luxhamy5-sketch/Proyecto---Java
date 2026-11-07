package modelo;

import java.io.Serializable;

public class bodega implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idBodega;
    private empleado empleadoEncargado;
    private double capacidad;
    private String direccion;

    public bodega() {
    }

    public bodega(String idBodega, empleado empleadoEncargado, double capacidad, String direccion) {
        this.idBodega = idBodega;
        this.empleadoEncargado = empleadoEncargado;
        this.capacidad = capacidad;
        this.direccion = direccion;
    }

    public String getidbodega(){
        return idBodega;
    }

    public void setidbodega(String idBodega){
        this.idBodega = idBodega;
    }

    public empleado getempleadoEncargado(){
        return empleadoEncargado;
    }

    public void setempleadoEncargado(empleado empleadoEncargado){
        this.empleadoEncargado = empleadoEncargado;
    }

    public double getcapacidad(){
        return capacidad;
    }

    public void setcapacidad(double capacidad){
        this.capacidad = capacidad;
    }

    public String getdireccion(){
        return direccion;
    }

    public void setdireccion(String direccion){
        this.direccion = direccion;
    }

    @Override 
    public String toString() {
        return "bodega [idBodega=" + idBodega + ", empleadoEncargado=" + empleadoEncargado + ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
    }

}