/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String wrd;
        String pass;
        pass = "eureka";
        System.out.println("Ingrese una palabra ");
        Scanner read = new Scanner(System.in);
        wrd = read.next();
        
     if(wrd.equals(pass)){
        System.out.println("CORRECTO"); 
    }else{
         System.out.println("INCORRECTO");
     }
    }
    
}
