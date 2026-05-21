/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 2 – Saludo personalizado
Crear un programa que solicite al usuario:
Nombre
Apellido
Luego mostrar el siguiente mensaje:
Bienvenido/a [nombre] [apellido]

 *
 * @author juann
 */
import  java.util.Scanner;
public class EJE2 {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del usuario");
        String N=Sc.nextLine();
        
        System.out.println("Ingrese el apellido del usuario");
        String A=Sc.nextLine();
        
        System.out.println("Bienvenido /a ["+N+"]["+A+"]");
        
        
        
    }
    
}
