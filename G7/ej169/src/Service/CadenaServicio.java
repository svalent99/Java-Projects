/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {

        int contadorVocales = 0;

        String frase = cadena.getFrase().toLowerCase();

        int longitud = cadena.getLongitud();

        for (int i = 0; i < longitud; i++) {

            char caracter = frase.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {

                contadorVocales++;
            }

        }

        System.out.println("Cantidad de vocales: " + contadorVocales);
    }

    public void invertirFrase(Cadena cadena) {

        String frase = cadena.getFrase();

        String fraseInvertida = "";

        int longitud = cadena.getLongitud();

        for (int i = longitud - 1; i >= 0; i--) {

            fraseInvertida += frase.charAt(i);
        }

        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public void vecesRepetido(char letra, Cadena cadena) {

        String frase = cadena.getFrase();

        int contadorLetra = 0;

        int longitud = cadena.getLongitud();

        for (int i = 0; i < longitud; i++) {

            if (letra == frase.charAt(i)) {

                contadorLetra++;
            }
        }

        System.out.println("La letra se repite: " + contadorLetra);

    }

    public void compararLongitud(Cadena cadena) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la frase");

        String nuevaFrase = leer.nextLine();

        if (nuevaFrase.length() == cadena.getLongitud()) {

            System.out.println("Son iguales");

        } else {

            System.out.println("No son iguales");

        }

    }

    public void unirFrases(Cadena cadena) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la frase");

        String frase = leer.nextLine();

        String fraseUnida = cadena.getFrase() + " " + frase;

        System.out.println("La frase unida es: " + fraseUnida);

    }

    public void reemplazar(Cadena cadena, String caracter) {

        String otraFrase = cadena.getFrase().replace("e", caracter);

        System.out.println("La frase reemplazada es:" + otraFrase);

    }

    public boolean contiene(Cadena cadena, String letra) {

        return cadena.getFrase().contains(letra);

//Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no
    }

}
