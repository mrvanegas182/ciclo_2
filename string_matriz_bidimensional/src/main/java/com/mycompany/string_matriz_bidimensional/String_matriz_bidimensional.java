
package com.mycompany.string_matriz_bidimensional;

import java.util.Scanner;

public class String_matriz_bidimensional {

    public static void main(String[] args) {
        
        // crear el scanner para pedir datos al usuario
        Scanner lector = new Scanner (System.in);
        int cantidad_filas;
        int cantidad_columnas;
        
        System.out.println("ingrese el numero de filas: ");
        cantidad_filas = lector.nextInt();
        System.out.println("ingrese el numero de columnas: ");
        cantidad_columnas = lector.nextInt();
        
        String letras [][] = new String [cantidad_filas][cantidad_columnas];
        
        for (int i = 0; i<letras.length;i++){
            for(int j =0; j<letras [0].length;j++){
                System.out.println("Ingrese una palabra: ");                
                letras [i][j] = lector.next ();                           
            }              
        }
        for (int i = 0; i<letras.length;i++){
            for(int j =0; j<letras [0].length;j++){
                System.out.print(letras [i][j]+ "\t");                           
            }System.out.println("\n");              
        }
        
        
    }
}
