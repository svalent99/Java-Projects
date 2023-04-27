/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author PAIS GAMER
 */
public class ej1guia {
    
    public static void main(String[] args) {
        
        //Implementar un programa que le pida dos números enteros al usuario y 
        //determine si ambos o alguno de ellos es mayor a 25.
        
         Scanner leer = new Scanner(System.in);
    System.out.println("ingrese el primer numero");                    
    int num1 = leer.nextInt();
    System.out.println("ingrese el segundo numero");                    
    int num2 = leer.nextInt();
        if (num1>25||num2>25) {
            System.out.println(" uno de los nros es mayor a 25 ");      
            
        } else {
            System.out.println(" ninguno de ellos es mayor a 25");
        }
        
    }
    
}
