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
public class Producto {
    //atributos
    String nombre;
    String precio;

    //constructor
    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    //metodos
    void esCaro() {
        if (Integer.parseInt(precio) >= 10000) {
            JOptionPane.showMessageDialog(null, "TRUE");
        } else {
            JOptionPane.showMessageDialog(null, "FALSE");
        }
    }

}
