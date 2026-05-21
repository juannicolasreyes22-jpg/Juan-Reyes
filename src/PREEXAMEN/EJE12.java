/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** //Ejercicio 12 – Login simple
Crear un programa que solicite:
Usuario
Contraseña
Si el usuario es:
admin
y la contraseña es:
1234
mostrar:
Acceso correcto
Caso contrario:
Usuario o contraseña incorrectos


 *
 * @author juann
 */
import java.util.Scanner;
public class EJE12 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner (System.in);
        
        System.out.println("Ingrese el usuario ");
        String U=Sc.nextLine();
        
        System.out.println("Ingrese la contrasena");
        String C=Sc.nextLine();
        
        if (U.equals("admin")&&C.equals("1234")) {
            System.out.println("Acceso correcto");
            
        } else{
            System.out.println("Usuario o contrasena incorrecto");
        }
        
              
    }
    
}
