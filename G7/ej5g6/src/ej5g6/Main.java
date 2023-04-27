/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5g6;

import Entidad.Persona;
import Service.servicio;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicio sr = new servicio();
        Persona pr = sr.crearPersona();
        sr.mostrarPersona(pr);
        System.out.println("Ingrese la edad a comparar");
        System.out.println("La persona es mayor a la edad que ingresamos? " + sr.menorQue(pr, leer.nextInt()));

    }

}
