/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Ingrese un numero: ");
        Scanner leer = new Scanner (System.in);
        num = leer.nextInt();
        System.out.println("El doble de" + num + "es: " +(num*num));
        System.out.println("El triple de" + num + "es: " +(num*num*num));
        System.out.println("La raiz cuadrada de" + num + "es: " + Math.sqrt(num));
    }
    
}
