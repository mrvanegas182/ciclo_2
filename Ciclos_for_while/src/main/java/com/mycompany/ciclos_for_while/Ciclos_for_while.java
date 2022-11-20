

package com.mycompany.ciclos_for_while;

// arreglo unidimensional
public class Ciclos_for_while {

    public static void main(String[] args) {
       int vector [] = new int [100];
       for (int i = 0; i < vector.length; i++ ){
           vector [i]= i;
    }
       for (int i = 0; i < vector.length; i++ ){
           System.out.print(vector [i] + "\t"); 
       }   
       
       
}
}