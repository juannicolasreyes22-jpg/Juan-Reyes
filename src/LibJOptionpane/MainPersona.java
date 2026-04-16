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
public class MainPersona {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("El nombre de mi abuelo es: ");
        String edad= JOptionPane.showInputDialog("La edad de mi abuelo es: ");
        
        Persona Ap = new Persona(nombre,edad);
        Ap.esMayordeEdad();
        
        
    }
}
