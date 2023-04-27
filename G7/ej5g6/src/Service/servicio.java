/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");  
        String name=leer.next();
        System.out.println("Ingrese su fecha de nacimiento");
        int dia=leer.nextInt(),mes=leer.nextInt(),año=leer.nextInt();
        Date fecha=new Date(año - 1900, mes - 1, dia);
        return new Persona(name,fecha);
    }
    public int calcularEdad(Persona prs){
        Date actual=new Date();
        int edad=actual.getYear()-prs.getFecha().getYear();
        if (actual.getMonth()<prs.getFecha().getMonth()) {
            return edad-1;
        }else{
            return edad;
    }
}
    public boolean menorQue(Persona prs, int edad){
        if (edad<calcularEdad(prs)) {
            return true;
        }else{
            return false;
        }
    }
    public void mostrarPersona(Persona prs){
        System.out.println(" nombre: "+prs.getName()+" su edad es "+calcularEdad(prs));
       
    }
}
//Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
//Método mostrarPersona que muestra la información de la persona deseada.