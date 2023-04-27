/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2g8;

import Entidad.Cafetera;
import java.util.Scanner;
import service.CafeteraServicio;

/**
 *
 * @author ValentinaSotelo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        CafeteraServicio cs1 = new CafeteraServicio();
        Cafetera c1 = new Cafetera();
        cs1.llenarCafetera(c1);
        System.out.println("Agregue la cantidad de cafe, en la taza a servir");
        int Cant = leer.nextInt();
        cs1.servirTaza(Cant, c1);//se sirve x cantidad de cafe a la taza
         cs1.vaciarCafetera(c1);
        System.out.println("Agregue la cantidad de cafe, en la taza a servir");
        int agreg = leer.nextInt();
        cs1.agreCafe(agreg, c1);

    }

}
