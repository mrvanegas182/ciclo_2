
package com.mycompany.ejemplo_13_poo;

public class Estudiante extends Persona {
    // atributos
    private int grado;
    private double promedio;
    
    // Los atributos como nombre, apellido y edad los hereda de la clase padre Persona.
    
    //Constructor

    public Estudiante(int grado, double promedio, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.grado = grado;
        this.promedio = promedio;
    }
        
      
    //Getters

    public int getGrado() {
        return grado;
    }

    public double getPromedio() {
        return promedio;
    }
    
    //Setters

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
       
    
    // Se va a crear un metodo funcional asociado al programa que queremos hacer
    
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Grado: " + getGrado());
        System.out.println("Promedio: " + getPromedio());
    
    }    
    
    
    
}
