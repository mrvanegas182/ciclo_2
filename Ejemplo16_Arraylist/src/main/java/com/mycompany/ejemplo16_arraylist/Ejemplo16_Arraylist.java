
package com.mycompany.ejemplo16_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo16_Arraylist {

    public static void main(String[] args) {
        System.out.println("Ejmplo de Arraylist");
        //Se adicionara elementos al arraylist
        ArrayList <Integer> numeros = new ArrayList <>();
       
        //get () pone el indice donde esta guardada la informacion
        
        numeros.add(3);
        System.out.println("el elemento del araray es: " + numeros.get(0));
        numeros.add(8);
        numeros.add(85);
        
        System.out.println("el elemento del araray es: " + numeros.size());
        
        Scanner lector = new Scanner (System.in);
        System.out.println("ingrese un numero al arraylist: ");
        
        int valores = lector.nextInt();
        numeros.add (valores);
        
        System.out.print("el nuevo tamaño es: " + numeros.size() + " ");
        
        for (int i=0;i<numeros.size();i ++){
            System.out.println(numeros.get(i) + "\n");
        }
        
        numeros.add(16);
        numeros.add(10);
        numeros.add(63);
        numeros.add(4);
        
        System.out.print("el elemento del araray 1 es: " + numeros.size());
        
        //eliminar un elemento del arraylist
        
        numeros.remove (2);
        // el ciclo lo ponemos para evidenciar que el arraylist ya no tiene nada
        
        for (int i=0;i<numeros.size();i ++){
            System.out.println(numeros.get(i) + " ");
        }
        
        System.out.println (" el  nuevo tamaño del araray 2 es: " + numeros.size()+ " ");
        
        
        //borrar todo el array list
        
        numeros.clear ();
        System.out.println("el  nuevo tamaño del araray 3 es: " + numeros.size()+ " ");
        
        
    }
}
