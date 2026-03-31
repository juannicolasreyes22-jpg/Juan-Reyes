/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** // 
 *
 * @author juann
 */
import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
     
        int opcion = 0;
        
        
        do{
            System.out.println("Mostrar menu:");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. salir");
            System.out.println("selecion una opcion");
            int opcio= Sc.nextInt();
            
            
        switch (opcio){
            case 1:
                System.out.println("Saludar");
                break;
            case 2:
                System.out.println("Mostrar fecha");
                break;
            case 3:
                System.out.println("salir");
            }
            
        }while (opcion!=3);
        
        
        
    }
    
}
