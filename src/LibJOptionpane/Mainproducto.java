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
public class Mainproducto {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
        String precio = JOptionPane.showInputDialog("Ingrese el precio del producto: ");

        Producto aP = new Producto(nombre, precio);
        aP.esCaro();

    }

}
