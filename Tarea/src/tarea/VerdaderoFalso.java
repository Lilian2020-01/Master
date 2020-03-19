
package tarea;

public class VerdaderoFalso {
    public static void main(String[] args){
        int M =6, T = 1, K = -10; 
        
        if (M>T){
            System.out.println("M>T");
            System.out.println("Verdadero M si es > T");
        }else{
            System.out.println("M>T");
            System.out.println("Falso M no es > T");  
        }
        
        if ((T/K)==-5){
            System.out.println("(T/K)==-5");
            System.out.println("Verdadero (T/K) si es = a -5");            
        }else{
          System.out.println("(T/K)==-5");
          System.out.println("Falso (T/K) no es = a -5");  
        }
        
        if((M-T == 5)||(M + T == 7)){
          System.out.println("(M+T == 7)||(M-T == 5)");
          System.out.println("verdadero uno de los dos se cumple ");  
        }else{
           System.out.println("(M+T == 7)||(M-T == 5)");
          System.out.println("Falso ninguno de los dos se cumple "); 
            
        }
    }
    
}
