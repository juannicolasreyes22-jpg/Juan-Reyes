/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PREEXAMEN;

/** // Ejercicio 5 – Menú de opciones
Crear un menú utilizando switch con las siguientes opciones:
1 - Ver perfil
2 - Configuración
3 - Cerrar sesión  
Según la opción elegida, mostrar un mensaje correspondiente.
En caso de ingresar una opción incorrecta, mostrar:
Opción inválida

 *
 * @author juann
 */
import java.util.Scanner;
public class EJE5 {
    public static void main(String[] args) {
        
         Scanner Sc=new Scanner (System.in);
        
        System.out.println("Menu de opciones");
        System.out.println("1-ver perfil");
        System.out.println("2-Configuraciones");
        System.out.println("3-Cerrar sesion ");
        
        System.out.println("Elegir unas de estas opciones");
        int opcion = Sc.nextInt();
        
        
         switch (opcion){
            case 1:
                System.out.println("Seleccionaste: la Opcion 1: Ver perfil");
                break;
            case 2: 
                System.out.println("Seleccionaste: la Opcion 2: Configuraciones");
                break;
            case 3:
                System.out.println("Seleccionaste: la Opcion 3: Cerrar sesion");
           default:
               System.out.println("Opcion invalida");
        }
        
        
        
        
    }
    
}
