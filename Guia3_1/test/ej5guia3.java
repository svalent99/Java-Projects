
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAIS GAMER
 */
public class ej5guia3 {

    //  Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    //5 *****
    //3 ***
    //11 ***********
    //2 **
    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.println(" ingrese 4 numeros ");
            num = leer.nextInt();

            while (num > 20 || num<1) {
                System.out.println("numero invalido");
                num = leer.nextInt();
             
            }
            for (int j = 0; j < num ; j++) {
                System.out.println(" * ");
            }
        }

    }

}
    
