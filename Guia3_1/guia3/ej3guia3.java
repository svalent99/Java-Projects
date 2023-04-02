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
public class ej3guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
        // TODO code application logic here
        
       /// Escriba un programa que valide si una nota está entre 0 y 10, 
       //sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
       int nota=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        
        if (nota<=10) {
            System.out.println("su nota es VALIDA");
            
        }
   
       while ( nota >= 10  ) {
            System.out.println("ingrese otra nota ");
            nota = (int) leer.nextDouble();
           
        }
        System.out.println("la nota es correcta ");

               
        
    }
    
    
}
