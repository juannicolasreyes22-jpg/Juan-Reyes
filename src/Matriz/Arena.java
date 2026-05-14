/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author juann
 */
public class Arena {
    public static void main(String[] args) {
        String[][] arena = new String[3][3];
        
        arena[0][1] = "megacaballero";
        arena[1][2] = "caballero";
        arena[2][2] = "PEKKA";
        
        
       
        //fila
        for (int i = 0; i < arena.length; i++) {
        //columna
            for (int j = 0; j < arena[i].length; j++) {
                System.out.println("["+arena[i][j]+"]");    
                
            }
            System.out.println("");
        }
        
    }
    
}
