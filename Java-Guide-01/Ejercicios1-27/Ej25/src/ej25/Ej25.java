/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
(Y - X + 1) + X

 */
package ej25;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix;
        int[][] matrixA;
        int i,j;
        boolean [][] var;
        matrix = new int [3] [3];
        matrixA = new int [3] [3];
        var = new boolean [3][3];
        
        Scanner read = new Scanner(System.in);
        System.out.println("Carga 1ra matriz");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("Posicion "+i+""+j);
                matrix[i][j] = read.nextInt();
            }
        }    
        System.out.println("cargar 2da matriz: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
               System.out.println("Posicion ["+i+"]["+j+"]");
               matrixA[i][j] = read.nextInt();
            }
        }    

        for(int k = 0; k < 3; k++) {
            for(int l = 0; l < 3; l++) {
                if(matrix[k][l] == matrixA[k][l]*(-1)&&matrix[k][l] == matrixA[k][l]){
                    var[k][l] = true;
                }
              }
            
        }
       int k=0, l=0;
       if(var[k][l] == true){
            System.out.println("IT'S ANTISYMMETRIC!");
            System.out.print(" ");
            printMatrix(matrix,matrixA);
     } else{
           System.out.println("Not a antisymmetric");
       }
        
        
    }
    
    public static void printMatrix(int[][] matrix, int[][] matrixA){
        int i, j;
        System.out.println("Matriz");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
               System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println(" "); 
        }
        System.out.println("Matriz Transpuesta Antisimetrica");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
               System.out.print(" "+matrixA[i][j]+" ");
            }
            System.out.println(" "); 
        }
    }        
}
