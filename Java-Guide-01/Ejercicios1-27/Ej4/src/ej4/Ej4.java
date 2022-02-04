/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float temp;
        System.out.println("Ingrese la temperatura (ºC): ");
        Scanner leer = new Scanner (System.in);
        temp = leer.nextFloat();
        System.out.println("La tempreatura en ºF es: " + (32+(9*temp)/5));
        
    }
    
}
