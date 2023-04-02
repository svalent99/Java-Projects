/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author ValentinaSotelo
 */
public class Libro {
   
    public int ISBN;
    public String titulo;
    public String autor;
    public int numerodePaginas;
    
    public Libro() {
    }

    public Libro(int ISBN,int numerodePaginas) {
        this.ISBN = ISBN;
        this.numerodePaginas=numerodePaginas;
    }
    public Libro (String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo del libro");
        this.titulo=leer.next();
        System.out.println("Ingrese el autor del libro");
        this.autor=leer.next();
        System.out.println("Ingrese el numero de paginas del libro");
        this.numerodePaginas=leer.nextInt();
    }
    public void MostrarLibro(){
        System.out.println("El ISBN es "+ this.ISBN);
        System.out.println("El titulo es " +this.titulo);
        System.out.println("El autor es " +this.autor);
        System.out.println("El numero de paginas es " +this.numerodePaginas);
        
    }
    }
