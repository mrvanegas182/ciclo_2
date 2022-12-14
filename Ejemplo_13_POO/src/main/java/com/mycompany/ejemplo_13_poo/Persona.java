
package com.mycompany.ejemplo_13_poo;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    
    // constructor

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nombre: " + getApellido());
        System.out.println("Nombre: " + getEdad());
       
    }
    
    
}
