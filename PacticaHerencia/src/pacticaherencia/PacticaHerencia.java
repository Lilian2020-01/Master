/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacticaherencia;

import Herber.Ingles;
import Herber.IntroduccionIngenieria;
import Herber.Asignatura;


public class PacticaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingles ingles = new Ingles();
        IntroduccionIngenieria intro = new IntroduccionIngenieria();
        
        ingles.ImprimirInformacion();
        intro.ImprimirInformacion();
    }
    
}
