/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author RUBEN
 */
public class Encapsulamiento {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ciudadano clase1;
        clase1 = new ciudadano();
        
        clase1.setNombre("Talia");
        System.out.println("el nombre del ciudadano es: "+clase1.getNombre());
       
         
        clase1.setExperiencia(20);
         System.out.println("Su experiencia laboral es de: "+clase1.getExperiencia ());
      
         clase1.setEdad(40);
         System.out.println("la edad es: "+clase1.getEdad());
         
    }

    
}
