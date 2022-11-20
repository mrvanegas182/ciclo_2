

package com.mycompany.oop;


public class OOP {
//
    //atributos
    
    private int [] edad; 
    
    // constructor: datos iniciales con los que empieza a trabajar mi proyecto
    //un constructor se llamada exactamente igual que la clase del proyecto

     
    
    public OOP(){
        int[] edades = new int [] {15,16,14,13,16,12,
                                   12,16,15,14,13,12,
                                   11,16,15,14,12,13 };
    
        this.edad = edades;
    
    //getters: metodo que me permite obtener el valor de un atributo
    }

    public int[] getEdad() {
        return edad;       
    }
    // setter: metodo que me permite configurar el valor de una tributo


    public void setEdad(int[] edad) {
        this.edad = edad;     
    }
    
    // metodos funcionales:  mostrar la suma de edad. promedio, operaciones en general
    
    public static double  []  informe (int[]edad){
    
        double suma= 0;   
        double promedio=0;
        double [] misDatos = new double [2];
        
        
        
        for (int i =0; i <edad.length;i++){
            suma += edad[i];
        }    
        
        promedio = suma /edad.length;
        misDatos[0] = suma;
        misDatos[1] = promedio;
        
                   
        return misDatos;
    
    }
    
    
    
    
    //programa principal
    public static void main(String[] args) {
       //crear nuevo obejto llamado las edades de la clase OOP
       OOP las_edades = new OOP();
       double [] datos = informe (las_edades.getEdad());
       System.out.println("Suma\tpromedio");
       for (int i=0; i< datos.length ;i++){
           System.out.print(datos[i] + "\t");
        
        }
      
       
        
        
    }
}
