
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
public class ej4guia3 {
    
    
    //Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle
     //y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
       //  pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
    
    public static void main(String[] args) {

        int num = 0;
        int suma = 0;
        int contador = 0;
         do {
            Scanner leer = new Scanner(System.in);
            System.out.println("ingrese 20 numeros");
            num = leer.nextInt();
            contador++;

            if (num < 0)
            {
                continue;
            }
              suma=suma+num;

            if (num == 0)
            {
                System.out.println("se capturo el 0");
                break;
            }

        } while (contador < 20);

        System.out.println(suma);
    }

}


