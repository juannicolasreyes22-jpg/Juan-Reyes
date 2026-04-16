/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** // 
EJERCICIO 12 - Suma acumulada
Mostrar la suma de los números del 1 al 100.

 *
 * @author juann
 */
import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        int suma=0;
        
         for (int i=1;i<=100; i++) {
             suma+=i;
            }
        System.out.println("La suma de los numeros del 1 al 100:"+suma);
        
    }
    
}
