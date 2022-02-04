/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ej12;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
       
        Scanner read = new Scanner(System.in);
        
       do{
             System.out.println("Ingrese una nota: ");
             n = read.nextInt();
        }while(n <= 0 && n >= 10);
    
    System.out.println("Nota guardada");   
    }
}
