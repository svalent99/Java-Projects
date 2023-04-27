/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class RaicesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public double getDiscriminante(Raices raices) {
        return Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC());
    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices)>0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    public double calcularPositiva(Raices raices) {
        return (-1 * raices.getB() + (Math.sqrt(this.getDiscriminante(raices))) / (2 * raices.getA()));
    }

    public double calcularNegativa(Raices raices) {
        return (-1 * raices.getB() - (Math.sqrt(this.getDiscriminante(raices))) / (2 * raices.getA()));
    }

    public void obtenerRaices(Raices raices) {
        if (this.tieneRaices(raices)) {
            System.out.println("La solucion 1 es: " + this.calcularNegativa(raices));
            System.out.println("La solucion 2 es: " + this.calcularPositiva(raices));
        }

    }

    public void obtenerRaiz(Raices raices) {
        if (this.tieneRaiz(raices) == true) {
            System.out.println(this.calcularPositiva(raices));
        }

    }
    public void calcular(Raices raices){
        if(this.tieneRaices(raices)){
          this.obtenerRaices(raices);
        }else if(this.tieneRaiz(raices)){
            this.obtenerRaiz(raices);
        }else{
            System.out.println("No tiene solucion");
        }
    }
    public Raices cargarDatos(){
        Raices raices=new Raices();
        System.out.println("Ingrese a: ");
        raices.setA(leer.nextDouble());
        System.out.println("Ingrese b: ");
        raices.setB(leer.nextDouble());
        System.out.println("Ingrese c: ");
        raices.setC(leer.nextDouble());
        
        return raices;
    }
    
}

//Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
//Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
//Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 2 posibles soluciones.
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene
//nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, 
//se mostrará un mensaje.
//Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
