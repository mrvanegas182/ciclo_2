

package com.mycompany.reto1;

public class Reto1 {

    public static double [] reporte (double [] valores){
    
    double [] informe = new double [3];
  
    double promedio = 0;
    double menor = valores [0];
    double mayor = valores [0];
    double suma =0;
    double contador = 0; 
    
     // calculo del promedio
    for (int i=0;i < valores.length;i++){
        suma =  suma + valores [i];
        contador = contador + 1;
        promedio = suma/contador;
     // calculo del menor
        if (valores[i]<menor){
        menor = valores[i];
        }
        //calculo del mayor
        if (valores[i]>mayor){
        mayor = valores[i];
        }
    }
    informe [0] = promedio;
    informe [1] = menor;
    informe [2] = mayor; 
        
    return informe;    
    }      
    
    
    public static void main(String[] args) {
        System.out.println("Ethereum");
        double [] precios_diarios = {4.1,4.8,1.5,2.3,0.1,
                                     0.9,1.4,1.8,1.5,3.0};
     
        double [] total = reporte (precios_diarios);    
        
        for (int i = 0; i<total.length;i++){
            System.out.print(total[i] + "\t");}
            }
  
        
}
            
        
        
    


