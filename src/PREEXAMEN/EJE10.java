/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** // Ejercicio 10 – Suma acumulativa
Realizar un programa que solicite números al usuario.
El programa deberá seguir pidiendo números mientras el usuario ingrese valores positivos.
Cuando se ingrese un número negativo, mostrar la suma total acumulada.

 *
 * @author juann
 */
import java.util.Scanner;

public class EJE10 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
         int numero;
        int suma = 0;

        System.out.println("Ingrese numeros positivos");
        System.out.println("Para finalizar ingrese un numero negativo");

        do {
            System.out.print("Numero: ");
            numero = Sc.nextInt();

            if (numero >= 0) {
                suma = suma + numero;
            }

        } while (numero >= 0);

        System.out.println("La suma total acumulada es: " + suma);
        
    }
    
    
    
}
