
package com.mycompany.ejemplo15_poo;


public class Ejemplo15_POO {

    public static void main(String[] args) {
        System.out.println("Otro ejemplo de poliformismo");
        
        Persona persona1 = new Persona ("Melisa", "Femenino", 26, false);
        System.out.println(persona1.getDatos());
               
        Persona persona2 = new Estudiante("UDEA","Sistemas", "Juan", "Masculino", 52, true);
        System.out.println(persona2.getDatos());
        
        //crear objeto con arrays
        Persona [] p = new Persona []{persona1, persona2};
    
        for (int i=0; i<p.length; i++){
            System.out.println(p[i].getDatos());
        }
        System.out.println("verificamos la enfermedad");
        
        for (int i=0; i<p.length;i++){
            if (p[i].isEnfermedad()){
                System.out.println(p [i].getNombre()+ " Deberias ir al medico prontamente");
            }
            else {
                System.out.println(p [i].getNombre()+ " Todavia puedes esperar otros 6 meses para ir al medico");
            }
        }
    }
}
