/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herber;

/**
 *
 * @author DELL
 */
public class Asignatura {
    
    private String Nombre; 
    private String Codigo;
    private int Periodo;
    
    public Asignatura(){
        
    } 
    
    public void EstablecerNombre(String nombre){
        
        this.Nombre=nombre;
    }
    
    public String ObtenerNombre(){
        return this.Nombre;
    }
    
     public void EstablecerCodigo(String codigo){
        
        this.Codigo=codigo;
    }
    
    public String ObtenerCodigo(){
        return this.Codigo;
    }
    
    public void ImprimirInformacion(){
        System.out.println("Nombre: "+ Nombre);
        System.out.println("Codigo: "+ Codigo);
    }
}
