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
public class Auto {
       // Atributos
    String marca;
    String modelo;
    
   

    // Constructor
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
     
        
     }
      // Métodos
    void acelerar(){
       JOptionPane.showInputDialog(null,"arrancar");
    }
}