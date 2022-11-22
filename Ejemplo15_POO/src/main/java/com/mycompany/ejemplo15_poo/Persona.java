
package com.mycompany.ejemplo15_poo;

//Clase padre
public class Persona {
    private String nombre;
    private String genero;
    private int edad;
    private boolean enfermedad;
    
    
    // constructor

    public Persona(String nombre, String genero, int edad, boolean enfermedad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.enfermedad = enfermedad;
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEnfermedad(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    //metodos funcional
    
    public String getDatos(){
        String texto = "Nombre: \t" + nombre + "\n" + 
                        "genero: \t" + genero + "\n" + 
                        "edad: \t" + edad + "\n" + 
                        "enfermedad: " + enfermedad+ "\n";                
        return texto;                       
    }
    
    
}
