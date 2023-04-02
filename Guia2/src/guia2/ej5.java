/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author PAIS GAMER
 */
public class ej5 {
    
    //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
    //Nota: investigar la función Math.sqrt().
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nro ");
        int numero=leer.nextInt();
        int doble=numero*2,triple=numero*3;
        double raiz= Math.sqrt(numero);
        System.out.println( " el doble del nro es: " + doble + " el triple del nro es: " + triple + " la raiz del nro es: " + raiz);
        
      
    }
    
}
// c=x*2