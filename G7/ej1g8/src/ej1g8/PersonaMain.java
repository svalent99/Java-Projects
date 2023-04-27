/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g8;

import ej1g8.Entidad.Persona;
import ej1g8.Service.Servicio;

/**
 *
 * @author ValentinaSotelo
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicio serv = new Servicio();
        Persona pers = new Persona();
        
        serv.CrearPersona(pers);
        serv.mostrarAtributos(pers);
       }
               
    }
               
    //}

        // TODO code application logic here
        //Crea un método void que reciba un objeto tipo PersonaMain como parámetro 
        //y utilice el get para mostrar sus atributos. Llama ese método desde el main
        
    

