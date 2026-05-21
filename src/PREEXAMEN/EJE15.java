/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** // Ejercicio 15 – Contador de pares
Mostrar todos los números pares del 1 al 100 utilizando un ciclo.

 *
 * @author juann
 */
public class EJE15 {
    public static void main(String[] args) {

        System.out.println("Los numeros pares del 1 al 100 son");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
