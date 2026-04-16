/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostico;
import java.util.Scanner;
/**
 *
 * @author juann
 */
public class Eje3 {
    public static void main(String[] args) {
        
    
     Scanner Sc = new Scanner (System.in);
       // String nombre;
        //int Edad;
        //double salario;
        
        
        System.out.println("Ingrese el nombre del empleado: ");
        String NDE=Sc.nextLine();
        
        System.out.println("Ingrese la edad del empleado: ");
        int Edad =Sc.nextInt();
        
        System.out.println("Ingrese el salario que cobra el empleado : ");
        double salario =Sc.nextInt();
        
        System.out.println("El nombre del empleados es: "+NDE);
        System.out.println("La edad del empleado es: "+Edad);
        System.out.println("El salario que cobra es de: "+salario);
    }
}

