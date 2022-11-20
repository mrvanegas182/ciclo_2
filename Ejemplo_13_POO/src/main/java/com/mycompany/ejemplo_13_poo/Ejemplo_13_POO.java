
package com.mycompany.ejemplo_13_poo;

public class Ejemplo_13_POO {

    /*Diseñar un proyecto a partir de herencia que tenga:
    - una persona como clase padre
    - una persona como clase hija
 
    */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante (7, 4.5, "Juan", "Restrepo", 13 ); 
        e1.mostrarDatos();
        Persona p1 = new Persona ("Maria", "Jimenez",35);
    
    }
    
}
