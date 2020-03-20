
package tarea;

public class Reprovado_Aprobado {
    public static void main(String[] args){
        int nota1= 65, nota2=89;
        String nombre1 = "Daniel", nombre2 = "Monica";
        
        if(nota1<70){
           System.out.println(nombre1 + " " + nota1 + " Reprobada");
        }else{
          System.out.println(nombre1 + " " + nota1 + " Aprobada");  
        }
        
        if(nota2<70){
           System.out.println(nombre2 + " " + nota2 + " Reprobada");
        }else{
          System.out.println(nombre2 + " " + nota2 + " Aprobada");  
        }
    }
    
}
