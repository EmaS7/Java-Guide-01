/*

Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €


 */
package ej20;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float eur;
        String moneda;
        do{
        System.out.println("Ingrese la cantidad de Euros a convertir ");
        Scanner read = new Scanner(System.in);
        eur = read.nextFloat();
        System.out.println("Seleccione la moneda a convertir");
        moneda = read.next();
        switch(moneda){
            case "libra":
                lib(eur,moneda);
                break;
            case "dolares":
                usd(eur,moneda);
                break;
            case "yenes":
                yen(eur,moneda);
                break;
            default:
                System.out.println("No se encuentra esa moneda (tip:pruebe escribiendo 'dolares','yenes' o ' libras' ");
        }
       }while(!(moneda.equals("libra") || moneda.equals("dolares") || moneda.equals("yenes")));
    }
      
    
    
    
       public static void lib(float eur, String moneda){
       double lib;
       lib = 0.86 * eur;
       System.out.println( eur+" € son "+lib+" Libras");
} 
       public static void usd(float eur,String moneda){
       double usd;
       usd = 1.28661 * eur;
       System.out.println( eur+" € son "+usd+" Dolares");
} 
       public static void yen(float eur, String moneda){
       double yen;
       yen = 129.852 * eur;
       System.out.println( eur+" € son "+yen+" Yenes");
} 
}

