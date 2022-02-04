/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String wrd;
        String val;
        System.out.println("Ingrese una palabra o frase: ");
        Scanner read = new Scanner(System.in);
        wrd = read.next();
        val = wrd.substring(0,1);
        
        if("a".equals(val)){
            val = val.toUpperCase();
        }
        
        if("A".equals(val)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
