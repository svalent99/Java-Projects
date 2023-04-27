
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAIS GAMER
 */
public class CARPETA {
    public static void main(String[] args) {
    

  /// Escriba un programa que valide si una nota está entre 0 y 10, 
       //sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
       int nota=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota");
        
      nota=leer.nextInt();
            
        
   
       while ( nota >= 10  ) {
            System.out.println("ingrese otra nota ");
            nota = (int) leer.nextDouble();
           
        }
       

             if (nota<=10) {
            System.out.println("su nota es VALIDA");   
        
    }
    
   } 

}