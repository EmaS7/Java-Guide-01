/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package ej15;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma=0, i;
        Scanner read = new Scanner(System.in);
        for(i=1;i<=20;i++){
            System.out.println("Ingrese el " +i+ "º numero: ");
            num = read.nextInt();
          if(num > 0){ 
          suma = suma + num;
        }
          if(0 == num){
              System.out.println("Se capturo el numero cero");
              break;
        }  
        }
            System.out.println("\nLa suma de todos los numeros es: " +suma );
      }
    }

   