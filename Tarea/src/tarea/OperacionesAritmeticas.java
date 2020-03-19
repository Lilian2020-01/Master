
package tarea;

import java.util.Scanner;


public class OperacionesAritmeticas {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        int  n1, n2;
        System.out.println("Ingrese primer numero entero");
        n1 = Entrada.nextInt();
        System.out.println("Ingrese Segundo numero entero");
        n2= Entrada.nextInt();
        
        System.out.println("La suma de estos dos numeros es: " + (n1+n2));
        System.out.println("La Resta de estos dos numeros es: " + (n1-n2));
        System.out.println("La Multiplicacion de estos dos numeros es: " + (n1*n2));
        System.out.println("La Division de estos dos numeros es: " + (n1/n2));
        System.out.println("El residuo de estos dos numeros es: " + (n1&n2));  
        
        
    }
    
}
