
package ejemplo_1.java_project;

// las imporaciones van despues de los paquetes osino se dañara todo el codigo

import java.util.Scanner; //esta libreria permite ingresar datos por consola


public class Java_project {

    public static void main(String[] args) {
        System.out.println("lo que sea");
        String nombre = "Juan del barrio";
        System.out.println("El nombre del cliente es: "+ nombre);
        int edad = 58;
        System.out.println(edad);
        double estatura_cliente = 1.89;
        System.out.println("La estatura del cliente es: "+ estatura_cliente+ " cms");
              
        //otro modulo
        
        /*Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre_cliente = lector.next();
        System.out.println("ingrese un numero: ");
        float num1 = lector.nextInt();
        //System.out.println("el numero digitado es: "+ num1);
        System.out.println("ingrese otro numero: ");
        float num2 = lector.nextInt();
        System.out.println("La suma de los dos numeros es de: "+ (num1 + num2));
        
        float suma = num1 + num2;
        float resta = num1 - num2;
        float multi = num1 * num2;
        float division = num1/num2;
        
        System.out.println("el nombre del cliente es: " + nombre_cliente);
        System.out.println("el resultado de la suma es: " + suma);
        System.out.println("el resultado de la resta es: " + resta);
        System.out.println("el resultado de la multi es: " + multi);
        System.out.println("el resultado de la divi es: " + division);
        */
        
        // ejemplo 4 - condicionales
        
        int num3;
        int num4;
        int num5;
        
        Scanner Nuevo_scanner = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        num3 = Nuevo_scanner.nextInt ();
        System.out.println("Ingrese el numero 2: ");  
        num4 = Nuevo_scanner.nextInt ();
        System.out.println("Ingrese el numero 3: ");  
        num5 = Nuevo_scanner.nextInt ();
        
        int resultado = num3+num4+num5;
        
        System.out.println("el resultado es: " + resultado );
        
        
        if (num3 > num4){
            System.out.println("el numero: " + num3 + " es mayor que " + num4);
        }
        else if (num4>num3){
            System.out.println("el numero: " + num4 + " es mayor que " + num3);
        }
        else 
            System.out.println("los numeros ingresados: " + num3 +" y" + num4 + " son iguales");
        
        
        
        
        
        
        
    }
}
