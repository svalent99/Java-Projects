/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class NifServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearNif(NIF nif) {
        System.out.println("Ingrese su dni");
        nif.setDni(leer.nextLong());
        int resto=(int)nif.getDni()%23;
        System.out.println("El resto es "+resto);
        char[] verif = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        nif.setLetra(verif[resto]);
    }
    public void mostrar(NIF nif){
        String[]letras={"0", "0", "0", "0", "0", "0", "0","0"};
        String num=String.valueOf(nif.getDni());
        int nro=7;
        for (int i= num.length()-1;i>=0; i--) {
             letras[nro]=num.substring(i,i+1);
             nro--;
            
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(letras[i]);
            
        } System.out.println("- " + nif.getLetra() );
    }
}
//En NIFService se dispondrá de los siguientes métodos:
//Métodos getters y setters para el número de DNI y la letra.
//Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, le asigna la letra que le corresponde según
//Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente
