

package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author $EmaS7
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matrix;
        int i,j;
        matrix = new int [4][4];   
        
        
        for(i=0;i<matrix.length;i++){           
            for(j=0;j<matrix[i].length;j++){       
               matrix[i][j] = (int) (Math.random()*10);
            }
        }
       System.out.println("MATRIZ ORIGINAL"); 
       for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                System.out.print(" "+matrix[i][j]+" ");
            }
           System.out.println(" ");  
       }   
        System.out.println("MATRIZ TRANSPUESTA"); 
       for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                System.out.print(" "+matrix[j][i]+" ");
            }
           System.out.println(" ");  
       }
       
    }

}
