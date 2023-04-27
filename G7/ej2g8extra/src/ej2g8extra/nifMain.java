/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2g8extra;

import Entidad.NIF;
import Service.NifServicio;

/**
 *
 * @author ValentinaSotelo
 */
public class nifMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NifServicio ns= new NifServicio();
        NIF niff=new NIF();
        ns.crearNif(niff);
        ns.mostrar(niff);
    }
    
}
