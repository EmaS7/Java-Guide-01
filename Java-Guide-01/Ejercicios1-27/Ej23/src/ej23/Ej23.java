/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ej23;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i, cant,cant1=0, cant2=0, cant3=0, cant4=0,cant5=0;
        int [] array;
        String numCad;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        n = read.nextInt();
        array = new int[n];
        
        for(i=0;i<n;i++){
            System.out.println("Valor de "+i+":");
            array[i] = read.nextInt();
            numCad = String.valueOf(array[i]);
            cant = numCad.length();
            
        if(cant==1){
            cant1 = cant1+1;
        }
        if(cant==2){
            cant2 = cant2+1;
        }
        if(cant==3){
            cant3 = cant3+1;
        }
        if(cant==4){
            cant4 = cant4+1;
        }
        if(cant==5){
            cant5 = cant5+1;
        }
     }   
        
        System.out.println("1 digito: "+cant1);
        System.out.println("2 digitos: "+cant2);
        System.out.println("3 digitos: "+cant3);
        System.out.println("4 digitos: "+cant4);
        System.out.println("5 digitos: "+cant5);
        
    }
    
}
