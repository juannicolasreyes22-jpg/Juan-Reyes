/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** //EJERCICIO 7 - Contador hasta 10
Mostrar números del 1 al 10 usando while.
 *
 * @author juann
 */
import java.util.Scanner;
public class Eje7 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
        
        System.out.println("Los numeros del 1 al 10:");
        
        int i=1;
        
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }
    
}
