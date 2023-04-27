/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej169;

import Entidad.Cadena;
import Service.CadenaServicio;

/**
 *
 * @author ValentinaSotelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        CadenaServicio servicio = new CadenaServicio();

        Cadena cadena = new Cadena("Hola gente");

        servicio.mostrarVocales(cadena);

        servicio.invertirFrase(cadena);

        servicio.vecesRepetido('u', cadena);

        servicio.compararLongitud(cadena);

        servicio.unirFrases(cadena);

        servicio.reemplazar(cadena, "&");

        System.out.println(servicio.contiene(cadena, "n"));

    }


    }
    


