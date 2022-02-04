/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package ej16;

import java.util.Scanner;

/**
 *
 * @author EmaS7
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad, in, fn, fde;
        int l,corr=0,incorr=0;
        fde = "&&&&&";
        Scanner read = new Scanner(System.in);
        do{
        System.out.println("Ingrese una cadena de hasta 5 caracteres(empieza en X y termina en O): ");
        cad = read.next();
        l=cad.length();
        in = cad.substring(0,1); fn = cad.substring(l-1);
        if(l<=5 && in.equals("X") && fn.equals("O")){
           corr = corr + 1;
        }
        if(!(l<=5 && in.equals("X") && fn.equals("O"))){
            if(!(cad.equals(fde))){
               incorr=incorr+1;
            } 
          }
        }while(!(cad.equals(fde)));
  
        System.out.println("Lecturas Correctas: "+corr); System.out.println("Lecturas Incorrectas: "+incorr); 
        
        
    }
}