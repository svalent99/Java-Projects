/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.PardeNumeros;

/**
 *
 * @author ValentinaSotelo
 */
public class Servicio {
    public void mostrarValores(){
        PardeNumeros pdn=new PardeNumeros();
        System.out.println("El numero 1 es: " + pdn.getN1());
        System.out.println("El numero 2 es: " + pdn.getN2());
    }
    public double devolverMayor(PardeNumeros pdn){
        if(pdn.getN1()>pdn.getN2()){
            System.out.println("El numero mayor es: "+pdn.getN1());
            return pdn.getN1();
        
    }else{
            System.out.println("El numero mayor es "+pdn.getN2());
            return pdn.getN2();
} 
}
    public void calcularPotencia(PardeNumeros pdn){
        double mayor=Math.round(pdn.getN1());
        double menor=Math.round(pdn.getN2());
        double resultado;
        if(pdn.getN1()>pdn.getN2()){
            resultado=Math.pow(mayor, menor);
        }else{
            resultado=Math.pow(menor, menor);
        }
        System.out.println("El resultado de la potencia es: "+resultado);
    }
    public void calcularRaiz(PardeNumeros pdn){
        double absoluto;
        if (pdn.getN1() > pdn.getN2()){
             absoluto = Math.abs(pdn.getN2());

         }else {
              absoluto = Math.abs(pdn.getN1());
         }
        double raiz=Math.sqrt(absoluto);
        System.out.println("La raiz del menor es " + raiz);
    }
}
//Método mostrarValores que muestra cuáles son los dos números guardados.
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
//Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
