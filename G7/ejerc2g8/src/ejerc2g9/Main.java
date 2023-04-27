/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2g9;

import Entidad.PardeNumeros;
import Service.Servicio;

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
        PardeNumeros parden=new PardeNumeros();
        Servicio serv=new Servicio();
        serv.mostrarValores();
        serv.devolverMayor(parden);
        serv.calcularPotencia(parden);
        serv.calcularRaiz(parden);
    }
    
}
