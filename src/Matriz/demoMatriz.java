/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriz;

/**
 *
 * @author juann
 */
public class demoMatriz {
    public static void main(String[] args) {
        String[][] arena = new String[5][5];
        //colocamos un barbaro en fila1, columna 3
        arena[1][3] = "juan";
        arena[2][1] = "harry kane";
        arena[2][4] = "llema";
        arena[3][2] = "juan";
        arena[4][4] = "juan";
        //para acceder a esa posicion
        String carta = arena[1][3];
        
        //filas 
        for (int i = 0; i < arena.length; i++) {
        //columnas
        for (int j = 0; j < arena.length; j++) {
             System.out.println("["+arena[i][j]+"]");   
            }
            System.out.println("");
        }
    }
}
