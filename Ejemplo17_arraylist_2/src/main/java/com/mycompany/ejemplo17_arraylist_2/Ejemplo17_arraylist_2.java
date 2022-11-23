
package com.mycompany.ejemplo17_arraylist_2;

import java.util.ArrayList;


public class Ejemplo17_arraylist_2 {

    public static void main(String[] args) {
        System.out.println("ejemplo completo de Arraylist");
        
        // Se va crear un objeto del tipo Arraylist en donde habran estudiantes
        
        ArrayList <Estudiantes> grupo1;
        grupo1 = new ArrayList<>();
        
        // vamos a crear un grupo de estudiantes
        // se declararas la variables
        
        Estudiantes e1;       
        Estudiantes e2;       
        Estudiantes e3;       
        Estudiantes e4;       
        
        // instanciamos los estudiantes
        
        e1 = new Estudiantes ("noveno", 4.5f,"Juan", "Bucaramanga", 14);
        e2 = new Estudiantes ("noveno", 4.7f,"Juana", "Ibague\t", 15);
        e3 = new Estudiantes ("noveno", 4.2f,"Marcos", "Valledupar", 14);
        e4 = new Estudiantes ("noveno", 4.8f,"Oscar", "Pereira\t", 16);
        
        // agregamos los estudiantes al arreglo
        grupo1.add (e1);
        grupo1.add (e2);
        grupo1.add (e3);
        grupo1.add (e4);
        

        
        //mostrar el tamaño del arreglo (Arraylist)
        System.out.println("El grupo tiene un total de: " + grupo1.size()+ " estudiantes");
        System.out.println("El primer estudianten pertenece al grupo: " + grupo1.get(0).getGradoEnCurso()+ " y tiene un total de " +  grupo1.size()+ " estudiantes");
        
        //mostrar los elementos del arreglo con FOR
        System.out.println("Nombre\tCiudad\tEdad\tGrado\tPromedio\t");    
               
        for (int i=0; i<grupo1.size();i++){
            System.out.println(grupo1.get(i).getNombre()+ "\t" + 
                    grupo1.get(i).getCiudadNacimiento() +  "\t" + 
                    grupo1.get(i).getEdad()+ "\t" + 
                    grupo1.get(i).getGradoEnCurso()+ "\t" + 
                    grupo1.get(i).getPromedio()+ "\t");
        
        }
    }
}
