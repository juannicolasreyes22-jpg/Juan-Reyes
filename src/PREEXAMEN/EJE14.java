/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** // Ejercicio 14 – Promedio de notas
Solicitar 3 notas al usuario.
Calcular el promedio y mostrar:
El promedio final
Si el alumno aprobó o desaprobó

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE14 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingresar la primer nota");
        int N1=Sc.nextInt();
        
        System.out.println("Ingresar la segunda nota");
        int N2=Sc.nextInt();
        
        System.out.println("Ingresar la tercera nota");
        int N3=Sc.nextInt();
        
        
        int promedio=(N1+N2+N3)/3;
        
        System.out.println("El promdeio final es " +promedio);
        if (promedio>=6) {
            System.out.println("El alumno aprobo ");
        } else {
            System.out.println("El alumno desaprobo");
        }
    }
    
}
