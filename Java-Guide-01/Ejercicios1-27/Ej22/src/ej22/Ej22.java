/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package ej22;



import java.util.Scanner;
//import java.util.Random;
//import java.lang.Math;

/**
 *
 * @author EmaS7
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,j,num;
        int [] array;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector: ");
        n = read.nextInt();
        array = new int[n];
        rellena(n,array);
        valida(n,array);
        }
     /*   if(var == false){
          System.out.println("El numero no se encuentra en el vector");
        }   */
    
     public static void valida(int n, int array[]){
    
        int i,j,num;
        boolean var = false;
        Scanner read = new Scanner(System.in);
        for(i=0;i<n;i++){
            System.out.println(array[i]);
        }
        System.out.println("Ingrese el numero a buscar: ");
        num = read.nextInt();
        for(j=0;j<n;j++){
            if(num == array[j]){
              var = true; 
              System.out.println("El numero buscado se encuentra en la posicion: "+j);
              break;
            }
        }
       
        if(!var){                   
          //  var =  false;
            System.out.println("El numero no se encuentra en el vector");
    }
}
    public static void rellena(int n,int array[]){
    
        int i;
        //Random rd = new Random();
        
        for(i=0;i<n;i++){
            //array[i] = rd.nextInt();
            array[i] = (int) (Math.random()*50);
        }
     }
 
}
