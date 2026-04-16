/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author juann
 */
public class Estudiante {
      // Atributos
    String nombre;
    int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    void estudiar() {
        System.out.println(nombre + " esta estudiando...");
    }

    void rendir() {
        System.out.println(nombre + " esta rindiendo un examen...");
    }
    void comer(){
        System.out.println(nombre + " esta comiendo... ");
    }
}

    

