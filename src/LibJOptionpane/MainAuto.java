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
public class MainAuto {
    public static void main(String[] args) {
        
    String marca=JOptionPane.showInputDialog("Ingrese la marca del auto: ");
    String modelo=JOptionPane.showInputDialog("Ingrese el modelo del auto: ");
    
    Auto primerAuto=new Auto (marca,modelo);
    primerAuto.acelerar();
        
    }
  
    }
