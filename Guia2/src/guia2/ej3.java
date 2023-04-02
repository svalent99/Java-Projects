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
public class ej3 {
    //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
    //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    
    public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese una frase ");
        frase = leer.nextLine();
        System.out.println( "La frase en MAYUS es "+ (frase.toUpperCase()) );
        System.out.println( "La frase en MINU es "+ (frase.toLowerCase()) );
    }
    
}
