
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
public class ej1G3 {
    // Crear un programa que dado un número determine si es par o impar. 

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        int n;
        n = leer.nextInt();

        if (n % 2 != 0) {
            System.out.println("el numero es IMPAR");
            
        }else{
            System.out.println("El numero ingresado es PAR");
            
        }

        }

    }


