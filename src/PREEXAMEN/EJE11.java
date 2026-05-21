/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 11 – Contador de alumnos aprobados
Solicitar la cantidad de alumnos.
Luego pedir la nota de cada uno utilizando un ciclo.
El programa deberá mostrar cuántos alumnos aprobaron (nota mayor o igual a 6).

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE11 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        
        
        int aprobado=0;
        System.out.println("Ingrese la cantidad de alumnos:");
        int CA=Sc.nextInt();
        
        for (int i = 1; i <= CA; i++) {
            
            System.out.println("Ingrese la nota "+i+":");
            int N=Sc.nextInt();
            
       if(N<=6){
           aprobado++;
           
       }   
            
      
        }
        System.out.println("los aprobados son" + aprobado); 
    }
    
    
}
