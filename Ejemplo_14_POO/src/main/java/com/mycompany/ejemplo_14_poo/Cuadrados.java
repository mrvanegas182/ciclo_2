
package com.mycompany.ejemplo_14_poo;

public class Cuadrados extends Figuras {
    //atributos
    private double lado;
    
    // Constructor

    public Cuadrados(double lado) {
        this.lado = lado;
    }
    
    //Getters  
   
    public double getLado() {
        return lado;
    }
    //Setter
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //metodos funcionales
    
    @Override
    public double getArea (){
        double A = lado*lado;
        return A;
    }
    
    @Override
    public double getPerimetro(){
        double B = 4*lado;
        return B;
    }    
    

   
    
    
}
