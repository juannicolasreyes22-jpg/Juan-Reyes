/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** //EJERCICIO 5 - Menú de opciones
Mostrar un menú:
1. Ver perfil
2. Editar datos
3. Cerrar sesión

Según la opción ingresada, mostrar el mensaje correspondiente.
Ejemplo: ”Seleccionaste: la Opción 1: Ver perfil”
 *
 * @author juann
 */
import java.util.Scanner;
public class Eje5 {
    public static void main(String[] args) {
         Scanner Sc =new Scanner (System.in);
         
        System.out.println("Menu de opciones");
        System.out.println("1. Ver perfil");
        System.out.println("2. Editar datos");
        System.out.println("3. Cerrar sesion ");
        System.out.println("Ingrese una opcion");
        int opcion = Sc.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Seleccionaste: la Opcion 1: Ver perfil");
                break;
            case 2: 
                System.out.println("Seleccionaste: la Opcion 2: Editar datos");
                break;
            case 3:
                System.out.println("Seleccionaste: la Opcion 3: Cerrar sesion");
        }
        
        
        
    }
    
}
