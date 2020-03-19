/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herbers;

/**
 *
 * @author DELL
 */
public class Estudiante {
    
    public String nombre;
    private String carrera;
    private int edad;
    
    public Estudiante(String nombre, String carrera){
        this.nombre=nombre;
        this.carrera=carrera; 
    }
    
    public void ImprimirCarrea(){
        System.out.println(carrera);
      }
    
    public void ObtenerEdad(int edad){
        this.edad=edad;
    }
    
    public int DimeEdad(){
        return edad;
    }
}
