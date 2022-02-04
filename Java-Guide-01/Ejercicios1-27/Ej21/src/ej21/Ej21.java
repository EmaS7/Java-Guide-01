/*
21. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package ej21;

/**
 *
 * @author EmaS7
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [] array;
      array = new int[100];
      rellena(array);
      
    }
    
    
    public static void rellena(int array[]){
        int i;
        for(i=0;i<=100;i++){
            array[i] = array[i] + i;
            System.out.println(array[i]);
        }
    }
}
