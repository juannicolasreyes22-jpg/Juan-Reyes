/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author juann
 */
public class Persona {
    //atributos
    String nombre;
    String edad;

    //constructor
    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    //metodos
    void esMayordeEdad() {
        if (Integer.parseInt(edad) >= 18) {
            JOptionPane.showMessageDialog(null, "Mi abuelo es mayor TRUE");
        } else {
            JOptionPane.showMessageDialog(null, "Mi abuelo es menor FALSE");
        }
    }
    
}
