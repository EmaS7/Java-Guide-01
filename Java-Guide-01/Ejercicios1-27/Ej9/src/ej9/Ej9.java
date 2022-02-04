/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ej9;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String wrd;
        int lgh;
        System.out.println("Ingrese una palabra ");
        Scanner read = new Scanner(System.in);
        wrd = read.next();
        lgh = wrd.length();
        
        if(lgh == 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
