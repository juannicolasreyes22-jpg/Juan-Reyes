/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXAMEN;

/**
 *
 * @author juann
 */
import java.util.Scanner;
public class Ejercici1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingrese el nombre de la materia ");
        String materia=Sc.nextLine();
        
        System.out.println("Ingrese el curso ");
        int curso=Sc.nextInt();
        
        System.out.println("Ingrese la cantidad de alumos incriptos ");
        int Cantidad=Sc.nextInt();
        
        
        System.out.println("El nombre de la materia es: "+materia);
        System.out.println("El curso es: "+curso);
        System.out.println("La cantidad de alumnos inscritos es: "+Cantidad);
        
        
    }
    
}
