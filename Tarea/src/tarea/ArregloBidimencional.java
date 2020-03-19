
package tarea;


public class ArregloBidimencional {
   public static void main(String[] args) {
       
       String Datos [][] = new String[5][4];
       
       for(int i=0; i<5; i++){
               for(int j=0; j<4; j++){
              Datos[i][j]= "a";
            }
         }
       Datos[0][0]= "JAHACIEL" ; Datos[0][1]= " CASTELLANOS"; Datos[0][2]= "INGENIERIA EN COMPUTACION"; Datos[0][3]= "EEH      ";  
       Datos[1][0]= "  ISIS  " ; Datos[1][1]= "  NARVAEZ  "; Datos[1][2]= " INGENIERIA EN PRODUCION "; Datos[1][3]= "ENP       ";
       Datos[2][0]= "  RAMON " ; Datos[2][1]= "  MARTINEZ "; Datos[2][2]= "INGENIERIA EN ELECTRONICA"; Datos[2][3]= "ENEE      ";
       Datos[3][0]= " JAVIER " ; Datos[3][1]= " RODRIGUEZ "; Datos[3][2]= " INGENIERIA EN PRODUCION "; Datos[3][3]= "NO TRABAJA";
       Datos[4][0]="RODRIGUEZ" ; Datos[4][1]= " IZAGUIRRE "; Datos[4][2]= " INGENIERIA EN PRODUCION "; Datos[4][3]= "HOSPITAL DE AREA";
       System.out.print(" NOMBRE" + "\t\t" + " APELLIDO" + "\t\t" + "CARRERA" + "\t\t\t" +" TRABAJO");
     

       
       for(int i=0; i<5; i++){
            System.out.println();
            System.out.println(" _______________________________________________________________________________");
          for(int j=0; j<4; j++){
                System.out.print(Datos[i][j]  + "\t" + "|");
           }
       }

   } 
}
