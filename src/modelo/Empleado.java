/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan.camayo
 */
public class Empleado extends Persona {
    
    private String codigoEmpleado;
    private String departamento;

    public Empleado(String codigoEmpleado, String departamento) {
        this.codigoEmpleado = codigoEmpleado;
        this.departamento = departamento;
    }

    public Empleado(String codigoEmpleado, String departamento, String nombre, String dirrecion, int edad) {
        super(nombre, dirrecion, edad);
        this.codigoEmpleado = codigoEmpleado;
        this.departamento = departamento;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "codigoEmpleado=" + codigoEmpleado + ", departamento=" + departamento;
    }
    
    
    
}
