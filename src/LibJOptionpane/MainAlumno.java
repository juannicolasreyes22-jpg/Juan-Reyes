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
public class MainAlumno {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
        String nota = JOptionPane.showInputDialog("Ingrese la nota del alumno: ");

        Alumno alumno = new Alumno(nombre, nota);
        alumno.aprobar();

    }

}
    
    

