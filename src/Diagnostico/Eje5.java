/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostico;

import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Eje5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        
        System.out.println("Ingresa la edad del ususario");
        int Edad =Sc.nextInt();
        
        if (Edad>16){
            System.out.println("Tienes permitido conducir");
       }else{
            System.out.println("No tines permitido conducir");
        }
        
        
    }
    
}
