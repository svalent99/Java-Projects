
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
public class ej5G3 {
    public static void main(String[] args) {
        
        //Escriba un programa en el cual se ingrese un valor limite positivo,
        //y a continuación solicite números al usuario hasta que la suma de 
        //los numeros introducidos supere el limite inicial.
        Scanner leer = new Scanner(System.in);
        int num,numlimit,suma = 0;
        System.out.println("Ingrese un valor limite positivo");
        numlimit=leer.nextInt();
      
        while (suma <= numlimit) {
            System.out.print("Ingrese un número: ");
            num=leer.nextInt();
            suma=suma+num;
    }
        System.out.println("la suma del numero es "+suma);
}
}