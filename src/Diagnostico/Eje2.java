/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagnostico;

/** //2️⃣Se solicita crear una clase llamada GenerarEmail para generar un email a partir de los siguientes datos:
>nombreCompleto -> Lionel Andres Messi
>Empresa -> Cen Tech
>Dominio -> CEN.TECH.COM.AR
Resultado Final:

 * @author juann
 */
public class Eje2 {
    public static void main(String[] args) {
        String nombrecompleto=" Harry_Kane";
        String empresa=" Cen.Tech";
        String Dominio=" CEN.TECH.COM.AR";
        char l='@';
        
        System.out.println("Nombre de Usuario: " +nombrecompleto);
        System.out.println("Nombre de Empresa: " +empresa);
        System.out.println("Nombre de Dominio: " +Dominio);
        
        System.out.println("Creando Email ......\n" + nombrecompleto+l+Dominio);
    }
}
