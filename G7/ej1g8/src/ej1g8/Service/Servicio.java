/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g8.Service;

import ej1g8.Entidad.Persona;
import ej1g8.PersonaMain;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void CrearPersona(Persona persona) {
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        //return null;
        System.out.println("Ingrese el apodo");
        persona.setApodo(leer.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(leer.nextInt());
        
    }

   
        
    public void mostrarAtributos(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("apodo: " + persona.getApodo());
        System.out.println("edad: " + persona.getEdad());
    }
}

