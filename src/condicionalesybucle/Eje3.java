/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

/** //EJERCICIO 3 - Clasificación de nota
Ingresar una nota (0 a 10):
- 9-10 → "Excelente"
- 7-8 → "Aprobado"
- 4-6 → "Recupera"
- 0-3 → "Desaprobado"

 *
 * @author juann
 */
import java.util.Scanner;
public class Eje3 {
    public static void main(String[] args) {
        
        Scanner Sc =new Scanner (System.in);
        
        System.out.println("Ingrese la nota");
        int Nota =Sc.nextInt();
       
       if(Nota<=10&&Nota>=9){
           System.out.println("Excelente");
       } else if (Nota<=8&&Nota>=7){
           System.out.println("Aprobado");
       } else if (Nota<=6&&Nota>=4){
           System.out.println("Recupera");
       }else{
           System.out.println("Desaprobado");
       }
    }
    
}
