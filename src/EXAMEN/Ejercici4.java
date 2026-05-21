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
public class Ejercici4 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Menu de inscripcion deportiva");
        System.out.println("1-Futbol");
        System.out.println("2-Basquet");
        System.out.println("3-Voley ");
        
        System.out.println("Ingrese el deporte que quiere ir");
        int Opcion=Sc.nextInt();
        
        switch (Opcion) {
            case 1:
                System.out.println("Seleccionaste: la Opcion 1: Futbol");
                break;
            case 2:
                System.out.println("Seleccionaste: la Opcion 2: Basquet");
            case 3:
                System.out.println("Seleccionaste: la Opcion 3: Voley");
            default:
                System.out.println("La opcion ingresa no corresponde al menu");
        }
      
    }
}
