
package com.mycompany.matriz_bidimensional;


public class Matriz_bidimensional {

    public static void main(String[] args) {
        int edades [][] = new int [10][15];
        //primer for recorre las filas
        int contador =0;
        for (int i= 0; i< edades.length;i++){
            // segundo for recorre las columnas
            for (int j= 0; j< edades[0].length;j++){
                edades[i][j] = contador;
                contador++;
            }
        }
        for (int i= 0; i< edades.length;i++){
            // segundo for recorre las columnas
            for (int j= 0; j< edades[0].length;j++){
                System.out.print(edades[i][j]+ "\t");    
            }
            System.out.println("\n");
        }
        
        
        
    

    }
}