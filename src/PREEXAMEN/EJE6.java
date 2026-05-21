/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 6 – Días de la semana
Solicitar al usuario un número del 1 al 5.
Mostrar mediante switch el día correspondiente:
1 → Lunes
2 → Martes
3 → Miércoles
4 → Jueves
5 → Viernes

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE6 {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner (System.in);
        
        
        System.out.println("Dias de la semana ");
        System.out.println("1-Lunes");
        System.out.println("2-Martes");
        System.out.println("3-miercoles ");
        System.out.println("4-Jueves ");
        System.out.println("5-viernes");
        
        System.out.println("Elegir uno de estos dias");
        int dias = Sc.nextInt();
        
         switch (dias){
            case 1:
                System.out.println("Seleccionaste: el dia 1: lunes");
                break;
            case 2: 
                System.out.println("Seleccionaste: el dia 2: martes");
                break;
            case 3:
                System.out.println("Seleccionaste: el dia  3: miercoles");
                break;
            case 4: 
                System.out.println("Seleccionaste: el dia 4: jueves");
                break;
            case 5: 
                System.out.println("Seleccionaste: el dia 5: viernes");
                
        }
        
    }
    
}
