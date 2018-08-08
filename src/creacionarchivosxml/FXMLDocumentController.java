/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivosxml;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Empleado;

/**
 *
 * @author juan.camayo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label LNombre;
   @FXML
    private Label LDireccion;
     @FXML
    private Label LEdad;
     @FXML
    private Label LCodigo;
     @FXML
    private Label LDepartamento;
     
     @FXML
     private TextField TNombre;     
             
      @FXML
     private TextField TDireccion;     
              @FXML
     private TextField TEdad;     
              @FXML
     private TextField TCodigo;     
              @FXML
     private TextField TDepartamento;     
              
              
              
              LinkedList <Empleado> listaEmpleados;
             
     
    
    @FXML
    private void AgregarEmpleadolLista(ActionEvent event) {
      
       String nombre = TNombre.getText();
       String direccion = TDireccion.getText();
        int edad = Integer.parseInt(TEdad.getText());
        String codigo = TCodigo.getText();
        String departamento = TDepartamento.getText();
        
        Empleado objE = new Empleado(codigo, departamento, nombre, direccion, edad);
        
        
     listaEmpleados.add(objE);
    }
    
    
    @FXML
    private void creararchivoXML (ActionEvent event){
    Empleado objE  = new Empleado();
    
    boolean guardar = crearFileXML(listaEmpleados);
      
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       listaEmpleados = new LinkedList<>();
    }    

  
}
