
package com.mycompany.ejemplo15_poo;

//Clase hija de personas
public class Estudiante extends Persona{
    private String universidad;
    private String carrera;
    
    //contructor

    public Estudiante(String universidad, String carrera, String nombre, String genero, int edad, boolean enfermedad) {
        super(nombre, genero, edad, enfermedad);
        this.universidad = universidad;
        this.carrera = carrera;
    }
    
    //Getters

    public String getUniversidad() {
        return universidad;
    }

    public String getCarrera() {
        return carrera;
    }
    
    //Setters

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    //metodos funcionales
    
    @Override
    public String getDatos(){
        String texto = super.getDatos() + "universidad: \t " + universidad + "\n" + "carrera: \t "+ "\n" + carrera;
        return texto;                       
    }
    
}
