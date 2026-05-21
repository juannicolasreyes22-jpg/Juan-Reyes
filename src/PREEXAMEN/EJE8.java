/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 8 – Tabla de multiplicar
Solicitar un número al usuario y mostrar su tabla de multiplicar del 1 al 10 utilizando for.
Ejemplo:
5 x 1 = 5
5 x 2 = 10

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE8 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingrese el numero ");
        int N=Sc.nextInt();
        
         for (int i = 1; i <= 10; i++) {
             int resultado=N*i;
             
            System.out.println(N+"x"+i+"="+resultado);
        }
    }
    
}
