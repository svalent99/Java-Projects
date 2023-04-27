/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class Circunferencia {
    
//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
//A) Método constructor que inicialice el radio pasado como parámetro.
//B) Métodos get y set para el atributo radio de la clase Circunferencia.
//C) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//D) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//E) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void CrearCircunferencia(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese el radio ");
        this.radio=leer.nextDouble();
        
    }
    public void Area(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        double Area=(Math.PI)*(Math.pow(this.radio,2));
        System.out.println(" El valor del area es " +Area);
       
}
    public void Perimetro(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        double Perimetro=2*Math.PI*this.radio;
        System.out.println(" El valor del perimetro es " +Perimetro);
}
}