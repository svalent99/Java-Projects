/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
1 día, 2 horas.
 */
package Guia2Prac;

import java.util.Scanner;

/**
 *
 * @author gtale
 */
public class Extra {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int minutos, dias, horas, resto;
        
        System.out.println("Ingrese su tiempo en minutos");
        minutos = leer.nextInt();
        
        dias = minutos / 1440;
        resto = minutos % 1440;
        horas = resto / 60;
        resto = resto % 60;
        
        System.out.println("Usted ingreso " + dias + " días, " + horas + " horas y " + resto + " minutos." );
        
    }
}
