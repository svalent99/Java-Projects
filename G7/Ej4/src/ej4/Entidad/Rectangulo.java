/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.Entidad;

import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */

////Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y 
//un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
//También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
//Se deberán además definir los métodos getters, setters y constructores correspondientes.
////Superficie = base * altura / Perímetro = (base + altura) * 2.
public class Rectangulo {
    Scanner leer=new Scanner(System.in);
    private int base,altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public  void crear_rectangulo(Rectangulo rect){
      
        System.out.println("Ingrese la base del recctangulo ");
        rect.base=leer.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        rect.altura=leer.nextInt();
        
    }
   public void calcular_superficie(Rectangulo rect){
        double superficie=0;
        superficie = rect.base * rect.altura;
        System.out.println("La superficie del rectangulo es: " + superficie);
       
   }
   
   public void calcular_perimetro (Rectangulo rect){
       double perimetro;
       perimetro = (rect.base + rect.altura) * 2;
       System.out.println("El perimetro del rectangulo es: " + perimetro);
       
   }
   
   public void dibujar_rectangulo(Rectangulo rect){
       
       int i,j;
      for(i=0;i<rect.altura;i++){
       for(j=0;j<rect.base;j++){
           if((i==0) || (i==rect.altura-1) || (j==0) || (j==rect.base-1) ){
           System.out.print("*");   
           }else{
             System.out.print(" ");   
           }
       } 
          System.out.println("");
      }
                  
   }
       
   }

