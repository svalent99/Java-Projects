/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class Servicio {

    public Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su fecha de nacimiento");
        int dia = leer.nextInt(), mes = leer.nextInt(), año = leer.nextInt();
        return new Date(año - 1900, mes - 1, dia);
    }

    public Date fechaActual() {
        return new Date();
    }
    
    public int diferencia(Date fechaNacimiento,Date fechaActual){
        int edad=fechaActual.getYear()-fechaNacimiento.getYear();
        if (fechaActual.getMonth()<fechaNacimiento.getMonth()) {
            return edad-1;
        }else{
            return edad;
        }
       
    }
}
//Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
//Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.

//Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle
