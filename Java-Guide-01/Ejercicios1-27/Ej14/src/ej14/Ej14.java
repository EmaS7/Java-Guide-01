/*
 Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package ej14;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej14 {                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, op, x;
        String sal = null;
        System.out.println("Ingrese dos numeros enteros positivos: ");
        Scanner read = new Scanner(System.in);
        num1 = read.nextInt(); num2 = read.nextInt();
        
        if(num1 < 0 || num2 < 0){
            System.out.println("Error, el numero debe ser positivo: ");
            num1 = read.nextInt(); num2 = read.nextInt();
        }
        do{
        System.out.println("\nMENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("\nEliga una opcion: ");
        op=read.nextInt();
        
        switch(op){
            case 1:
                x=num1 + num2;
                System.out.println("La suma de "+ num1 + " y " + num2 + " es: " +x);
                break;
            case 2:
                x=num1-num2;
                System.out.println("La resta de "+ num1 + " y " + num2 + " es: " +x);
                break;
            case 3:
                x=num1*num2;
                System.out.println("El producto entre "+ num1 + " y " + num2 + " es: " +x);
                break;
            case 4:
                x=num1/num2;
                System.out.println("La division entre "+ num1 + " y " + num2 + " es: " +x);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                sal = read.next();
                break;  
        }
    }while(sal.equals("N")||sal.equals("n"));           //VER
   }
}    