/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 13 – Calculadora básica
Crear un programa que solicite:
Primer número
Segundo número
Operación matemática
Menú:
1 - Sumar
2 - Restar
3 - Multiplicar
4 - Dividir
Mostrar el resultado según la opción elegida.

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE13 {
    public static void main(String[] args) {
         Scanner Sc=new Scanner(System.in);
         
         System.out.println("Ingrese el primer numero: ");
         int N1=Sc.nextInt();
        
         System.out.println("Ingrese el segundo numero: ");
         int N2=Sc.nextInt();
         
         System.out.println("Operaciones matematicas");
         System.out.println("Menu: ");
         System.out.println("1 - Sumar");
         System.out.println("2 - Restar");
         System.out.println("3 -Multiplicar");
         System.out.println("4 - Dividir");
         
         System.out.println("Elegir la operacion matematica");
         int Operaciones=Sc.nextInt();
         
         int resultado=0;
         switch (Operaciones) {
            case 1:
                System.out.println("Sumar");
                resultado=(N1+N2);
                break;
            case 2:
                System.out.println("Restar");
                resultado=(N1-N2);
                break;
            case 3:
                System.out.println("Multiplicar");
                resultado=(N1*N2);
                break;
            case 4:
                System.out.println("Dividir");
                resultado=(N1/N2);
                
          
        }
         System.out.println("El resultado de la oparacion matematica elegidas es: "+resultado);
         
    }
    
}
