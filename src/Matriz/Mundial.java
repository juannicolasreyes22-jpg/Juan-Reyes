/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author juann
 */
public class Mundial {
    public static void main(String[] args) {
        String[][] tabla = new String[9][2];
        
        tabla[0][0]="Argentina";
        tabla[0][1]="2";
        System.out.println("Selecciones Goles:");
        
        tabla[1][0]="Brasil";
        tabla[1][1]="1";
        
        tabla[2][0]="Espana";
        tabla[2][1]="1";
        
        tabla[3][0]="Mexico";
        tabla[3][1]="0";
        
        tabla[4][0]="Francia";
        tabla[4][1]="4";
        
        tabla[5][0]="Alemania";
        tabla[5][1]="2";
        
        tabla[6][0]="Japon";
        tabla[6][1]="1";
        
        tabla[7][0]="Portugal";
        tabla[7][1]="1";
        
        tabla[8][0]="Inglaterra";
        tabla[8][1]="20";
        
         //fila
        for (int i = 0; i < tabla.length; i++) {
        //columna
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("["+tabla[i][j]+"]");    
                
            }
            System.out.println();
        }
        
    }
    }
    

