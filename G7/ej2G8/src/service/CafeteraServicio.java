/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidad.Cafetera;

/**
 *
 * @author ValentinaSotelo
 */
public class CafeteraServicio {
    
    public void llenarCafetera(Cafetera c1){
        //c1.setCantidadActual(c1.getCapacidadMax())= c1.setCantidadActual(10));
         c1.setCantidadActual((int) c1.getCapacidadMax());
         if (c1.getCantidadActual()<c1.getCapacidadMax()){
             c1.setCantidadActual((int) c1.getCapacidadMax());
             System.out.println("La cafetera esta llena");
         }else {
             System.out.println("No se le puede agregar mas cafe, la cafetera ya esta llena");
         }
         }
    public Cafetera servirTaza (int tam,Cafetera c1 ){
        Cafetera taza;
//        return c1;
        if(c1.getCantidadActual()<tam){
            //c1.setCantidadActual((int) (c1.getCantidadActual()-tam));
            c1.setCantidadActual(0);
            System.out.println("No alcanza el cafe");
        } else {
           c1.setCantidadActual((int) (c1.getCantidadActual()-tam));
            System.out.println("Taza llena");
        }
        return c1;
        //devuelvo la cafetera actualizada
    }
    public Cafetera vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
        System.out.println("La cafetera esta vacia");
        return c1;
    }
    public Cafetera agreCafe(int cantidad,Cafetera c1){
        System.out.println("Ingrese la cantidad de cafe");
        if((cantidad + c1.getCantidadActual())<=c1.getCapacidadMax()){
              c1.setCantidadActual((int) (cantidad + c1.getCantidadActual()));
              System.out.println("Carga exitosa");
        }else if(c1.getCantidadActual()<c1.getCapacidadMax()){ 
            System.out.println("Se cargara proporcion restante");
            int diferencia=(int) (c1.getCapacidadMax()-c1.getCantidadActual());
            c1.setCantidadActual(cantidad- diferencia);
            
        }
        
        return c1;
        
    }
}


//Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
//Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
//simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
//El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.

//Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
