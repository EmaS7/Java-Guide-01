/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        System.out.println("Ingrese un nombre: ");
        Scanner leer = new Scanner(System.in);
        name = leer.next();
        System.out.println("El nombre ingresado es: " + name);
    }
    
}
