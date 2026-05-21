/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

/**
 *
 * @author juann
 */
import java.util.Scanner;
public class Ejercici3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingrese la edad de la persona");
        int Edad=Sc.nextInt();
        
        if (Edad>=18) {
            System.out.println("Ingrese por favor");
        }else{
            System.out.println("No puede ingresar al evento");
        }
              
    }
    
}
