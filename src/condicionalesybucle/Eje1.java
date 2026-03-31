/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** // EJERCICIO 1 - Acceso al sistema
Solicitar al usuario su edad.
- Si es mayor o igual a 18 → "Acceso permitido"
- Si no → "Acceso denegado"

 *
 * @author juann
 */
import java.util.Scanner;
public class Eje1 {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);
        
        System.out.println("Ingresa tu edad: ");
        int edad =Sc.nextInt();
        
        if(edad>18){
            System.out.println("Acceso permitido");
        } else{
            System.out.println("Acceso denegado");
        }
    }
    
}
