/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E

Nota: investigar función equals() y como convertir números a String.
 */
package ej17;


/**
 *
 * @author EmaS7
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k;
        String let1, let2, let3;
        for(i=0;i<10;i++){
           for(j=0;j<10;j++){
               for(k=0;k<10;k++){
               let1 = String.valueOf(i);
               let2 = String.valueOf(j);
               let3 = String.valueOf(k);
               if(let1.equals("3")){
                  let1="E";
               }
               if(let2.equals("3")){
                  let2="E";
               }
               if(let3.equals("3")){
                  let3="E";
               }
               System.out.println(let1+"-"+let2+"-"+let3); //System.out.println("\t-"+j);
           }
          }     
        }
   }    
}
