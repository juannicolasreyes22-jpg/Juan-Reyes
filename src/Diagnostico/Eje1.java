/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diagnostico;

/*
 * //Se solicita crear una clase llamada DetallePersona que realice   lo siguiente:
	Debe declarar las siguientes variables y deberás asignar los valores que correspondan, además de seleccionar el tipo de dato adecuado para cada variable.
>nombreCompleto
>edad
>altura (En metros)
>paisDeOrigen
>Indicar si es casado o soltero con sólo un caracter, ejemplo: 
‘C’ -> casado, ‘S’ -> soltero

 * @author juann
 */
public class Eje1 {
    public static void main(String[] args) {
        String nombrecompleto="Juan Nicolas Reyes";
        int edad=16;
        double altura=1.79;
        String paisOrigen="Argentina";
        char estadocivil='s';
        
        
        System.out.println("Mi nombre completo es: "+nombrecompleto);
        System.out.println("Mi edad es: "+edad);
        System.out.println("Mi altura es: "+altura);
        System.out.println("Mi pais es: "+paisOrigen);
        System.out.println("Mi estado civil es: "+estadocivil);
    }
}