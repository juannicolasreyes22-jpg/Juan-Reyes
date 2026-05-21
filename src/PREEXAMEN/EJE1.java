/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 1 – Datos personales
Realizar un programa que permita:
Guardar el nombre de un alumno.
Guardar su edad.
Mostrar ambos datos por pantalla utilizando System.out.println.

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("el nombre del alumno es :");
        String  N=Sc.nextLine();
        
        System.out.println("la edad del alumno es :");
        int E=Sc.nextInt();
        
    }
    
}
