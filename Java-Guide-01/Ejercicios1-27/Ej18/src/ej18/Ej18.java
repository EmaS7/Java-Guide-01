/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package ej18;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,j,dim;
       String x,v,h;
       x="*";
       Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la dimension: ");
        dim = read.nextInt();
        h = new String(new char[dim]).replace("\0", x);
        v = x + new String (new char[dim-2]).replace("\0", " ")+x;
       System.out.println(h); 
       for(i=dim-2;i>=1;i--){
           //for(j=0;j<dim;j++){
               System.out.println(v);   
           //}
       }
        System.out.println(h);
    }
}
