/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author ValentinaSotelo
 */
public class Cadena {

    private String frase;

    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;

        this.longitud = this.frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}

