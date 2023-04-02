
import java.util.Scanner;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
package Guia2Prac;

/**
 *
 * @author gtale
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int longi, correcto, incorrecto;
        boolean salida=false;
        String FDE;
        correcto=0;
        incorrecto=0;
        do{
            System.out.println("Ingrese una secuencia FDE");
            FDE = leer.nextLine();
            longi = FDE.length();
            if(FDE.equals("&&&&&")){
                salida=true;
                break;
            }else{
                if(FDE.length()<=5 && FDE.substring(0,1).equals("X") && FDE.substring(longi-1,longi).equals("O") ){
                    correcto++;
                    System.out.println("Secuencia Correcta");
                }else{
                    incorrecto++;
                    System.out.println("Secuencia Incorrecta");
                }
            }
            
        }while(salida==false);
        
        System.out.println("Se han ingresado " + correcto + " secuencias correctas");
        System.out.println("Se han ingresado " + incorrecto + " secuencias incorrectas");
    }
}
