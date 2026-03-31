/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** // EJERCICIO 4 - Mayor de tres números
Ingresar tres números distintos.
Mostrar cuál es el mayor.

 *
 * @author juann
 */
import java.util.Scanner;
public class Eje4 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
        
        
        System.out.println("Ingrese el primer numero");
        int N1 =Sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int N2 =Sc.nextInt();
        
        System.out.println("Ingrese el tercer numero");
        int N3 =Sc.nextInt(); 
        
        if(N1>N2&&N1>N3){
            System.out.println("El mayor es: "+1);
       }else if (N2>N1&&N2>N3){
            System.out.println("El mayor es: "+2);
       }else{
            System.out.println("El mayor es: "+3);
       }
        
        
    }
}
