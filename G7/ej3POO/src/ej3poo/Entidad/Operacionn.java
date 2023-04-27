/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3poo.Entidad;

import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class Operacionn {
    private int numero1;
    private int numero2;

    public Operacionn() {
    }

    public Operacionn(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero 1 y el numero 2 ");
        this.numero1=leer.nextInt();
        this.numero2=leer.nextInt();
        
    }
    
    public int suma(){
        int suma = numero1+numero2;
        System.out.println("La suma de los dos numeros es " + suma);
        return suma;
    }
    public int resta(){
       int resta=numero1-numero2;
        System.out.println("La resta de los dos numeros es " + resta);
        return resta;
    }
     public int multiplicacion(){
         int multiplicar=numero1*numero2;
         if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero");
            return 0;
        }else{
             System.out.println("El resultado de la multiplicacion es " + multiplicar);
           return this.numero1 * this.numero2;
    }
    }
    
    public int dividir() {
        int division=numero1/numero2;
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return 0;
            
        }else{
            System.out.println("El resultado de la division es " + division);
            return this.numero1 / this.numero2;
            
        }
    }
}
