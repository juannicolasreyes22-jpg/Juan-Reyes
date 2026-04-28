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
public class Micomidasfavoritas {
    public static void main(String[] args) {
        String[] comida = new String[5];

        comida[0] = "pizzas";
        comida[1] = "napolitana";
        comida[2] = "empana arabe";
        comida[3] = "bazio";
        comida[4] = "milanesa de pure";
        
        JOptionPane.showMessageDialog(null, comida[2]);

        for (int i = 0; i < comida.length; i++) {
            JOptionPane.showMessageDialog(null, comida[i]);
            

        }

    }
}
    

