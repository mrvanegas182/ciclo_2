
package com.mycompany.ejemplo_14_poo;


public class Circulo extends Figuras {
    //atributos
    private double radio;
    private double pi=3.1416;
    
    //constructor

    public Circulo(double radio) {
        this.radio = radio;
       
    }

        //Getter
    public double getRadio() {
        return radio;
    }

  
     //Setter

    public void setRadio(double radio) {
        this.radio = radio;
    }

   
  
        
    //metodos funcionales
    @Override
    public double getArea(){
        double C = (radio*radio) * pi;
        return C;
            
                
    } 
        
    @Override
        public double getPerimetro(){
            double D = (2*radio) * pi;
            return D;
        }
        
    
}
