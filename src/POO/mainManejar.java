/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author juann
 */
public class mainManejar {
     public static void main(String[] args) {

        Manejar M1 = new Manejar("Juan","Reanult","rojo","nueva");
        Manejar M2 = new Manejar("Renault","Renault","rojo","nueva");
        Manejar M3 = new Manejar("rojo","Renault","rojo","nueva");
        Manejar M4 = new Manejar("nueva","Renault","rojo","nueva");
        
        M1.manejar();
        M2.marca();
        M3.color();
        M4.nueva();
    }
}
    

