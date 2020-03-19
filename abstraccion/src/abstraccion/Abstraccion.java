/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

import paises.Honduras;
import paises.Mexico;
import paises.Russia;

/**
 *
 * @author RUBEN
 */
public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Russia r = new Russia();
        Mexico mx = new Mexico();
        Honduras hn = new Honduras();
        // TODO code application logic here
        
        System.out.println("El pais es: "+r.getpais()+" y su presidente es: "+r.getpresidente());
        System.out.println("El pais es: "+mx.getpais()+" y su presidente es: "+mx.getpresidente());
        System.out.println("El pais es: "+hn.getpais()+" y su presidente es: "+hn.getpresidente());
    }
    
}
