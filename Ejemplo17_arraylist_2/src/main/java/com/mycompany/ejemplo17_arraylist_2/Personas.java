
package com.mycompany.ejemplo17_arraylist_2;

public class Personas {
    // atributos
    private String nombre;
    private String ciudadNacimiento;
    private int edad;
    
    // constructor

    public Personas(String nombre, String ciudadNacimiento, int edad) {
        this.nombre = nombre;
        this.ciudadNacimiento = ciudadNacimiento;
        
    }

    public Personas(int edad) {
        this.edad = edad;
    }
    
    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public int getEdad() {
        return edad;
    }
    
    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // metodos funcionales
    
    
    
}
