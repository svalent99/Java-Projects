/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g8.Entidad;



/**
 *
 * @author ValentinaSotelo
 */
public class Persona {
    private String nombre;
    private String apodo;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apodo, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
    
     
//        
//    }
//    
//}
   // Crea un método void que reciba un objeto tipo PersonaMain como parámetro y 
    //utilice el get para mostrar sus atributos. Llama ese método desde el main
    //import java.util.Scanner;

    
        
        
    


    
