/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacticaabstraccion;

import herber.IngenieriaEnComputacion;
import herber.IngenieriaEnProduccion;

/**
 *
 * @author DELL
 */
public class PacticaAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngenieriaEnComputacion ic = new IngenieriaEnComputacion();
        IngenieriaEnProduccion ip =new IngenieriaEnProduccion();
        
        System.out.println(ic.ObtenerFcultad()+"\n"+ip.ObtenerFcultad());
    }
    
}
