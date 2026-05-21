/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 4 – Número positivo o negativo
Pedir al usuario un número entero.
El programa debe indicar si el número es:
Positivo
Negativo
O igual a cero

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE4 {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingrese un numero porfavor");
        int E=Sc.nextInt();
        
        if (E>0) {
            System.out.println("es positivo");
        }if (E<0) {
            System.out.println("es negativo");
        } else {
            System.out.println("igual a cero");
        }
        
        
    }
    
}
