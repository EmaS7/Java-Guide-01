/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
 * and open the template in the editor.
 */
package ej24;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matrix;
        int i,j;
        matrix = new int [4][4];   
        Scanner read = new Scanner(System.in);
        
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
