/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3g8;

import Service.PersonaServicio;

/**
 *
 * @author ValentinaSotelo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio s1 = new PersonaServicio();
        PersonaServicio s2 = new PersonaServicio();
        PersonaServicio s3 = new PersonaServicio();
        PersonaServicio s4 = new PersonaServicio();
        s1.crearPersona();
        if (s1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad");
        }
       switch(s1.calcularIMC()){
           case 0: System.out.println("Esta en su peso ideal");
           break;
           case -1: System.out.println("Esta por debajo de su peso");
           break;
           case 1: System.out.println("Esta por encima de su peso");
           break;
       }
        s1.crearPersona();
        if (s1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad");
        }
       switch(s1.calcularIMC()){
           case 0: System.out.println("Esta en su peso ideal");
           break;
           case -1: System.out.println("Esta por debajo de su peso");
           break;
           case 1: System.out.println("Esta por encima de su peso");
           break;
       }
        s2.crearPersona();
        if (s2.esMayorDeEdad()) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad");
        }
       switch(s2.calcularIMC()){
           case 0: System.out.println("Esta en su peso ideal");
           break;
           case -1: System.out.println("Esta por debajo de su peso");
           break;
           case 1: System.out.println("Esta por encima de su peso");
           break;
       }
        s3.crearPersona();
        if (s3.esMayorDeEdad()) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad");
        }
       switch(s3.calcularIMC()){
           case 0: System.out.println("Esta en su peso ideal");
           break;
           case -1: System.out.println("Esta por debajo de su peso");
           break;
           case 1: System.out.println("Esta por encima de su peso");
           break;
       }
        s4.crearPersona();
        if (s4.esMayorDeEdad()) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad");
        }
       switch(s4.calcularIMC()){
           case 0: System.out.println("Esta en su peso ideal");
           break;
           case -1: System.out.println("Esta por debajo de su peso");
           break;
           case 1: System.out.println("Esta por encima de su peso");
           break;
       }
    }

}
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
//deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto 
//si la persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
//para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos,
//por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
