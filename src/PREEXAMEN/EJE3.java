/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** // Ejercicio 3 – Edad permitida
Desarrollar un programa que solicite la edad de una persona.
Si la edad es mayor o igual a 18, mostrar:
Acceso permitido
Caso contrario, mostrar:
Acceso denegado

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingrese la edad de la persona ");
        int E=Sc.nextInt();
        
        if (E>=18) {
            System.out.println("Acceso permitido");   
        } else {
            System.out.println("Acceso denegado");
        }
    }
    
}
