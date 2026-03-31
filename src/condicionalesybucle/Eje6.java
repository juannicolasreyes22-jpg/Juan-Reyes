/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** //EJERCICIO 6 - Calculadora básica
Ingresar:
- dos números
- una operación (+, -, *, /)

 *
 * @author juann
 */
import java.util.Scanner;
public class Eje6 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero");
        int N1 =Sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int N2 =Sc.nextInt();
        
        System.out.println("Ingrese la operacion: ");
        int ope=Sc.nextInt();
        
        
        switch (ope){
            case 1 :
                System.out.println("La sumas es de: "+(N1+N2));
                break;
            case 2: 
                System.out.println("La resta es de: "+(N1-N2));
                break;
            case 3:
                System.out.println("La multiplicacion es de: "+(N1*N2));
                break;
            case 4:
                System.out.println("La division es de: "+(N1/N2));    
        }
    }
    
}
