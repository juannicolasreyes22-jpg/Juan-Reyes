/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author juann
 */
public class Manejar {
     // Atributos
    String nombre;
    String marca;
    String color;
    String nueva;

    // Constructor
    public Manejar(String nombre, String marca, String color, String nueva) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.nueva = nueva;
    }

    // Métodos
    void manejar() {
        System.out.println(nombre + " esta manejando su camioneta");
    } 
    void marca(){
        System.out.println(nombre + " es la marca ");
    }
    void color(){
        System.out.println(nombre + " tiene el color la camionta  ");
    }
    void nueva(){
        System.out.println(nombre + " es la camioneta ");
    }
    
   
}
    

