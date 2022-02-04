/*
Crear un programa que dado un numero determine si es par o impar.
 */
package ej7;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un numero entero: ");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        if((num % 2) != 0){                                                     /* ver porque cuando quiero hacer lo 
                                                                                contrario en el if no me lo toma*/    
            System.out.println("El numero ingresado es impar");
        }else{
            System.out.println("El numero ingresado es par");
        }
    }
    
}
