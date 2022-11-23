
package com.mycompany.ejemplo17_arraylist_2;

public class Estudiantes extends Personas {
    private String gradoEnCurso;
    private float promedio;
    
    // constructor
    
    public Estudiantes(String gradoEnCurso, float promedio, String nombre, String ciudadNacimiento, int edad) {
        super(nombre, ciudadNacimiento, edad);
        this.gradoEnCurso = gradoEnCurso;
        this.promedio = promedio;
    }
        
    // Getters

    public String getGradoEnCurso() {
        return gradoEnCurso;
    }

    public float getPromedio() {
        return promedio;
    }
    
    // Setters

     public void setGradoEnCurso(String gradoEnCurso) {
        this.gradoEnCurso = gradoEnCurso;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

        
    // metodos funcionales

   

    

    
    
    
    
    
}
