/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;
import javax.swing.JOptionPane;
/**
 *
 * @author juann
 */
public class EjemploArreglo {
    public static void main(String[] args) {

        String[] Animal = new String[5];

        Animal[0] = "tortuga";
        Animal[1] = "elefante";
        Animal[2] = "jirafa";
        Animal[3] = "pez";
        Animal[4] = "aveztruz";

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, Animal[i]);
        }

    }

}
