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
public class ConsoladeDialogo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"HOLA");
        
        String nombre= JOptionPane.showInputDialog("Ingresa tu nombre");
         JOptionPane.showInputDialog(null,"hola mi nombre es: "+nombre);
         
        String dormir = JOptionPane.showInputDialog("Cuantas goras duermo");
        JOptionPane.showInputDialog(null,"dormir");
    }
}
