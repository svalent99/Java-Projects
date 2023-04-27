/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import ej4.Entidad.Rectangulo;

/**
 *
 * @author ValentinaSotelo
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo figura1=new Rectangulo();
        figura1.crear_rectangulo(figura1);
        figura1.calcular_superficie(figura1);
        figura1.calcular_perimetro(figura1);
        figura1.dibujar_rectangulo(figura1);
        
    }
    
}
