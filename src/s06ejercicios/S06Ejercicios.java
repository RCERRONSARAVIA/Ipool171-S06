/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06ejercicios;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S06Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        System.out.println("EJERCICIO S06");
        System.out.println("");
        // Datos1
            String Nombre01="";
            int cantidad01 = 1;
            double precio01 = 8;
            
            String Nombre02="";
            int cantidad02=0;
            double precio02=0;
            
            String Nombre03="";
            int cantidad03=0;
            double precio03=0;
            
            // Declaramos e inicializando variable tipo Scanner
            Scanner sc = new Scanner(System.in);
            
            // Producto 01 -> nombre                               
            System.out.println("Ingrese \"nombre\" producto 01: ");
            Nombre01 = sc.next();
            // producto 01 -> cantidad
            System.out.println("Ingrese \"cantidad\" producto 01: ");
            cantidad01 = sc.nextInt();
            // producto 01 -> precio
            System.out.println("Ingrese \"precio\" producto 01: ");
            precio01 = sc.nextDouble();
            
            // Producto 01 -> nombre                               
            System.out.println("Ingrese \"nombre\" producto 02: ");
            Nombre02 = sc.next();
            // producto 01 -> cantidad
            System.out.println("Ingrese \"cantidad\" producto 02: ");
            cantidad02 = sc.nextInt();
            // producto 01 -> precio
            System.out.println("Ingrese \"precio\" producto 02: ");
            precio02 = sc.nextDouble();
            
            // Producto 01 -> nombre                               
            System.out.println("Ingrese \"nombre\" producto 03: ");
            Nombre03 = sc.next();
            // producto 01 -> cantidad
            System.out.println("Ingrese \"cantidad\" producto 03: ");
            cantidad03 = sc.nextInt();
            // producto 01 -> precio
            System.out.println("Ingrese \"precio\" producto 03: ");
            precio03 = sc.nextDouble();
            
            
            
           
                  
           //datos2
            
            double subtotal = 0;
            subtotal += cantidad01 * precio01;
            subtotal += cantidad02 * precio02;
            subtotal += cantidad03 * precio03;
            
            double impuesto = subtotal * 0.18;
          
            double total = subtotal + impuesto;
            
            System.out.println("El total es: " + total);
    
    }

            
    
    
    
    
}
    
    
    
    
}
