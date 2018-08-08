/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.logging.Logger;

/**
 *
 * @author juan.camayo
 */
public class Persona {
    
    
   private String nombre;
   private String dirrecion;
   private int edad;

    public Persona() {
    }

    public Persona(String nombre, String dirrecion, int edad) {
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return   "nombre=" + nombre + ", dirrecion=" + dirrecion + ", edad=" + edad + '}';
    }
  
   
}
