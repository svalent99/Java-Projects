/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8ej1.Servicio;

import g8ej1.Entidad.CuentasBancarias;
import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class Servicio {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cuentaBancariaServicio(CuentasBancarias c1){
        System.out.println("Ingrese su numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su dni");
        c1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su saldo inicial");
        c1.setSaldoActual(leer.nextDouble());
    }
    public void ingresar(CuentasBancarias c1){
        //int dinero;
        System.out.println("Ingrese el monto a ingresar");
        double dinero=leer.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual()+dinero);
        System.out.println("Su saldo actual es: "+c1.getSaldoActual() );
    }
        
        public void retirar(CuentasBancarias c1){
        //int dinero;
        System.out.println("Ingrese el monto a retirar");
        double dinero=leer.nextDouble();
        if (dinero > c1.getSaldoActual()){
            System.out.println("Su saldo es insuficiente,se retirara el resto: " + c1.getSaldoActual());
            c1.setSaldoActual(0);
            
        } else{
        c1.setSaldoActual(c1.getSaldoActual()-dinero);
        System.out.println("Su saldo actual es: "+ (dinero - c1.getSaldoActual()) );
        
    }
}
        public void extraccionrapida(CuentasBancarias c1){
        //int dinero;
        double porcentaje;
        System.out.println("Ingrese el monto a retirar, no mayor al 20%");
        double dinero=leer.nextDouble();
        porcentaje=(c1.getSaldoActual()*20)/100;
        if (dinero <= porcentaje){
        c1.setSaldoActual(c1.getSaldoActual()+dinero);
        }else{
            System.out.println("su monto supera el 20%");
        }
         System.out.println("Su saldo actual es "+c1.getSaldoActual() );
}
         public void consultarSaldo (CuentasBancarias c1){
        System.out.println("su saldo actual es: " + c1.getSaldoActual());
         }
       
         public void consultarDatos(CuentasBancarias c1){
        System.out.println("su saldo disponible es " + c1.getSaldoActual());
             System.out.println("su nro de cuenta es: " + c1.getNumeroCuenta());
             System.out.println("Su dni es: " + c1.getDniCliente());
}

    //public void consultarDatos(g8ej1.CuentasBancarias c1) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.