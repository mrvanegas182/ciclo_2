
package com.mycompany.ejemplo_14_poo;

import java.util.Scanner;

public class Ejemplo_14_POO {

    public static void main(String[] args) {
    // calcular el perimetro y el area de figuras planas
        Scanner lector = new Scanner (System.in);
        int dato;
    
        do{
            System.out.println("Presione 1: para un cuadrado, 2: para un circulo, 3: para triangulos y 0 para salir.");
        
            dato = lector.nextInt();
       
            switch (dato){
                
                case 0: 
                    System.out.println("Saliste del sistema con exito");
                    break;
                case 1:
                    System.out.println("Ud seleccionó: " + (dato)+ "por favor ingrese el lado del cuadrado: ");
                    double lado = lector.nextDouble();
                    Cuadrados cuadrado1 = new Cuadrados (lado);
                    System.out.println("El area del cuadrado con lados de: " + (lado) + "es de" + cuadrado1.getArea ());
                    System.out.println("El perimetro del cuadrado con lados de: " + (lado) + "es de" + cuadrado1.getPerimetro ());
                    break;
                case 2:
                    System.out.println("Ud seleccionó: " + (dato)+ "por favor ingrese el radio del circulo: ");
                    double radio = lector.nextDouble();
                    Circulo circulo1 = new Circulo (radio);
                    System.out.println("El area del circulo con radio de: " + (radio) + "es de" + circulo1.getArea ());
                    System.out.println("El perimetro del circulo con radio de: " + (radio) + "es de" + circulo1.getPerimetro ());    
                    break;
                case 3:
                    System.out.println("Ud seleccionó: " + (dato)+ " por favor ingrese la altura del triangulo: ");
                    double altura = lector.nextDouble();
                    System.out.println("Por favor ingrese la base del triangulo: ");
                    double base = lector.nextDouble();
                    Triangulo triangulo1 = new Triangulo (altura,base);
                    
                    System.out.println("El area del triangulo es de " + triangulo1.getArea ());
                    System.out.println("El perimetro del triangulo es de " + triangulo1.getPerimetro ());
                    break;
                default: 
                    System.out.println("NO es una opcion valida");
                    
        
            }
        }while (dato !=0); 
    }
    
}