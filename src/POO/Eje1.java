/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author juann
 */
public class Eje1 {
    // Atributos
    String nombre;
    String raza;

    // Constructor
    public Eje1(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    // Métodos
    void ladrar() {
        System.out.println(nombre + " dice GUAU!GUAU!");
    } 
    void comer(){
        System.out.println(nombre + " esta comiendo ");
    }
    void llama(){
        System.out.println(nombre+ " se llama");
    }
    void raz(){
        System.out.println(nombre+ " es su raza");
    }

   
}
    

