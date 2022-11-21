
package com.mycompany.ejemplo_14_poo;

public class Triangulo extends Figuras {
    private double altura;
    private double base;
    
    
    //constructor

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    //getters

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    // Setters

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    // metodos funcionales
    @Override
    public double getArea (){
         double F = base*altura/2;
         return F;
    }
    @Override
    public double getPerimetro(){
            double G = 3*base;
            return G;
        }
    
    
}
       
                