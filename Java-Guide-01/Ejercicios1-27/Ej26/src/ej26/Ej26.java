/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.*/

package ej26;

import java.util.Scanner;

/**
 *
 * @author $EmaS7
 */
public class Ej26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,sumaH=0,sumaV=0,sumaDiag=0,sumaOp=0;
        int [][] matrix;
        boolean varH=false, varV=false;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el orden de la matriz(De 1 a 9): ");
        n = read.nextInt();
        
        while(n<2 || n>=10){
            System.out.println("El orden debe ser de 1 a 9, no sea pendejo");
            n = read.nextInt();
        }
        matrix = new int [n] [n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese los valores de la matriz. Posicion ["+i+"] ["+j+"]");
                matrix[i][j] = read.nextInt();
                  while(matrix[i][j]>9 || matrix[i][j]<1){
                      System.out.println("Debe ingresar el valor entre 1 y 9: ");
                      matrix[i][j] = read.nextInt();
                  }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumaH = sumaH + matrix[i][j];
                if(i==j){
                    sumaV = sumaV + matrix[i][j];
                }
                if(i+j==n-1){
                    sumaOp = sumaOp + matrix[i][j];
                }
            }
            if(sumaH == sumaDiag && sumaDiag == sumaOp){
                varH = true;
            }
            sumaH=0;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumaV = sumaV + matrix[i][j];
            }
            if(sumaV==sumaDiag){
                varV=true;
            }
            sumaV=0;
        }
        if(varH==true && varV==true){
            System.out.println("Esta matriz es magica, su suma es igual a: "+sumaDiag);
        }else{
            System.out.println("La matriz NO es magica");
        }
 

    }

}
