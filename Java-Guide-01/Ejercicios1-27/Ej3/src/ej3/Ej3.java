/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String wrd;
        System.out.println("Ingrese una frase: ");
        Scanner leer = new Scanner(System.in);
        wrd = leer.nextLine();
        System.out.println(wrd.toUpperCase());
        System.out.println(wrd.toLowerCase());
    }
    
}
