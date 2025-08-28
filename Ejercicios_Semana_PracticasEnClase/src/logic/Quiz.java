/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Lenovo
 */

public class Quiz { 
    public Quiz(){ 
    
}
    public static void Figura() {

        // PRIMERA FILA
        for (int j = 0; j < 9; j++) {
            System.out.print("* ");
        }
        System.out.println();

        // SEGUNDA FILA VACIA
        System.out.println("*               *");

        // TERCERA FILA CON EL * EN MEDIO
        System.out.println("*       *       *");

        // CUARTA FILA VACIA
        System.out.println("*               *");

        // LA ULTIMA FILA
        for (int j = 0; j < 9; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
    
