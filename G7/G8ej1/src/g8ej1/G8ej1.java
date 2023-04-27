/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8ej1;

import g8ej1.Entidad.CuentasBancarias;
import g8ej1.Servicio.Servicio;

/**
 *
 * @author ValentinaSotelo
 */
public class G8ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Servicio s1= new Servicio();
        CuentasBancarias c1= new CuentasBancarias();
        
       s1.cuentaBancariaServicio(c1);
       s1.consultarDatos(c1);
       s1.consultarSaldo(c1);
       s1.extraccionrapida(c1);
       s1.ingresar(c1);
       s1.retirar(c1);
      
        
    }
    
}
