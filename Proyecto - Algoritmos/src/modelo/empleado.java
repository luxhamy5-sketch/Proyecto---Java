package modelo;

import java.io.Serializable;

public class empleado implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idEmpleado;
    private String nombre;
    private String dpi;
    private String direccion;
    private String puesto;
    private double salario;

    public empleado() {
    }

    public empleado(String idEmpleado, String nombre, String dpi, String direccion, String puesto, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.dpi = dpi;
        this.direccion = direccion;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado [ID: " + idEmpleado + ", Nombre: " + nombre + ", Puesto: " + puesto + "]";
    }
}