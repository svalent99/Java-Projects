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
public class ej4 {
    
    //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
    //La fórmula correspondiente es: F = 32 + (9 * C / 5).
   
    public static void main(String[] args) {
        
        double centigrados,fahrenheit;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en centigrados ke calaaarr");
        centigrados = leer.nextDouble();
        fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("la temperatura en fahrenheit es: " + fahrenheit);
        
        
        
    }
    
}
