/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4g9;

import Service.Servicio;
import java.util.Date;

/**
 *
 * @author ValentinaSotelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ser = new Servicio();
        Date dt = ser.fechaNacimiento();
        System.out.println("Su fecha de nacimiento es: "+dt.toString());
        ser.fechaActual();
        System.out.println("La fecha actual es "+ser.fechaActual().toString());
        System.out.println("Su edad es "+ ser.diferencia(dt,ser.fechaActual()));
    }

}
