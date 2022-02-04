/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej27;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
 
        int [][] M = new int [10][10];
 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j]=(int)(Math.random()*10);
                System.out.print("["+M[i][j]+"]");
            }
            System.out.println("");
        }
 
        int [][] P = new int [3][3];
 
        System.out.println("\nIngrese la matriz P:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Posicion["+i+1+"]["+j+1+"]: ");
                P[i][j] = leer.nextInt();
            }
        }
 
        int filas=0, columnas=0, k1, l1;
 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (M[i][j]==P[0][0]){
                    if(i<=7 && j<=7){
                        k1=i+2;
                        l1=j+2;
 
                        filas=0;
                        columnas=0;
 
                        for (int k=i; k <= k1; k++) {
                            for (int l=j; l <= l1; l++) {
                                if (M[k][l]==P[filas][columnas]){
                                    if (columnas<2){
                                        columnas+=1;
                                    }
                                    else if (columnas==2 && filas<2){
                                        columnas=0;
                                        filas+=1;
                                    }
                                }
                            }
                        }
                    }
                }  
            }
            if(columnas==2 && filas==2){
                    System.out.println("Ha sido encontrada la matriz Pequena.");
                    for (int f = 0; f < 3; f++) {
                        for (int d = 0; d < 10; d++) {
                            System.out.print(" "+P[f][d]+" ");
                        }
                        System.out.println(" "); 
                    }
                }
                 break;
              }
    
            }        
        }
    
    

