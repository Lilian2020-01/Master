
package pacticaencapsulamiento;

import herbers.Estudiante;
public class PacticaEncapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Estudiante estudiante =new Estudiante("Noel Hernadez", "Produccion Indusdrial");
        
        estudiante.ImprimirCarrea();
        estudiante.ObtenerEdad(23);
        System.out.println(estudiante.DimeEdad());
    }
    
}
