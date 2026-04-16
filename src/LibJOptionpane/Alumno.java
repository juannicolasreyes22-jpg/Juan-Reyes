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
public class Alumno {
      // Atributos
    String nombre;
    String nota;
   

    // Constructor
    public Alumno(String nombre, String nota) {
        this.nombre = nombre;
        this.nota= nota;
    }
     // Métodos
    void aprobar(){
         if (Integer.parseInt(nota)>=6){
             JOptionPane.showMessageDialog(null,"Felicidades Aprobaste!! :D ");
         }else{
             JOptionPane.showMessageDialog(null,"Reprobaste :( ");
         }
    }
}

            
        
    
    

