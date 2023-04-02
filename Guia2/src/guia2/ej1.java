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
public class ej1 {
    
    //Escribir un programa que pida dos números enteros por teclado y calcule 
    //la suma de los dos. El programa deberá después mostrar el resultado de la suma
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese el primer numero");                    
    int num1 = leer.nextInt();
    System.out.println("ingrese el segundo numero");                    
    int num2 = leer.nextInt();
        System.out.println("la suma es igual a: " + (num1+num2));
}
}