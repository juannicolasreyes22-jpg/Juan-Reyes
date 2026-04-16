/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author juann
 */
public class Auto {
     // Atributos
    String marca;
    String modelo;
    int velocidad;
   

    // Constructor
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad=0;
        
    }
     // Métodos
    void acelerar(int acelerar){
        velocidad +=acelerar;
        System.out.println(velocidad + " aumenta la velocidad  "+velocidad);
    }
    void frenar(int frenar){
        velocidad -=frenar;
        System.out.println(velocidad + " disminuye la velocidad "+velocidad);
    }
    
   
}

