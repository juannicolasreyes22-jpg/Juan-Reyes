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
public class Ejercici7 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        
        double total;
        System.out.println("Ingrese el nombre del producto");
        String Producto=Sc.nextLine();
        
         System.out.println("Ingrese el precio del producto");
        int Precio=Sc.nextInt();
        
         System.out.println("Ingrese la cantidad comprada");
        int Cantidad=Sc.nextInt();
        
        total=(Precio*Cantidad);
        
        if (total>=10000) {
            System.out.println("Corresponde aplicar revision de compra");   
        }else{
             System.out.println("Compra registrada correspondiente");
        }
        
        
        
        
    }
    
}
