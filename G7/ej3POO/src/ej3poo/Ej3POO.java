/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3poo;

import ej3poo.Entidad.Operacionn;

/**
 *
 * @author ValentinaSotelo
 */
public class Ej3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operacionn O1 = new Operacionn();
        O1.crearOperacion();
        O1.suma();
        O1.resta();
        O1.multiplicacion();
        O1.dividir();
    }
    
}
