/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;

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

    public Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
       private boolean crearFileXML(LinkedList<Empleado> listaEmpleados) {
        
           try {
            
               Element company = new Element ("company");
               Document doc = new Document (company);
               
             
               for (int i =0; i < listaEmpleados.size(); i++){
                   
                   
               Element staff = new Element ("staff");
                 staff.addContent(new Element("nombre").setText(listaEmpleados.get(i).getNombre()));
               
               staff.addContent(new Element("direccion").setText(listaEmpleados.get(i).getDireccion()));
               
               }
           
           
           
           }
    }

   
}
