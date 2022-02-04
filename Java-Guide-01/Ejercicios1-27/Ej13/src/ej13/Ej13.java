/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, lim, sum=0;
        System.out.println("Ingrese un numero limite: ");
        Scanner read = new Scanner(System.in);
        lim = read.nextInt(); 
      //  sum=sum+num;
        
        while(sum<lim){
        System.out.println("Ingrese un numero: ");
        num = read.nextInt();
        sum=sum+num;
       } 
         /*   System.out.println("Ingrese un numero: ")
            num = read.nextInt();*/
            
        
        System.out.println("Has superado el limite!");
        System.out.println("La suma es " + sum);
    }
}