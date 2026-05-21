/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** // Ejercicio 9 – Contador descendente
Utilizando while, mostrar los números desde 10 hasta 1.

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE9 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("los numeros del 10 al 1: ");
        
        int i=10;
        while (i>=1) { 
            System.out.println(i);
            i--;
            
        }
    }
    
}
