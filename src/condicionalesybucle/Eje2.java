/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** //EJERCICIO 2 - Número positivo o negativo
Solicitar un número al usuario.
- Si es mayor a 0 → "Número positivo"
- Si es menor a 0 → "Número negativo"
- Si es 0 → "Número neutro"

 *
 * @author juann
 */
import java.util.Scanner;
public class Eje2 {
    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);
        
        System.out.println("Ingrese el numero: ");
        int N =Sc.nextInt();
        
          if(N>0){
              System.out.println("Numero positivo");
          } else if (N<0){
              System.out.println("Numero negativo");
          } else{
              System.out.println("Numero neutro");
          }
    }
    
}
