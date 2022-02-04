/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Ingrese dos numeros enteros: ");
        Scanner leer = new Scanner (System.in);
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if(num1>num2){
            System.out.println("El numero " + num1 + " es el mayor" );
        }  else{
            System.out.println("El numero " + num2 + " es el mayor");
        }   
    }
    
}
