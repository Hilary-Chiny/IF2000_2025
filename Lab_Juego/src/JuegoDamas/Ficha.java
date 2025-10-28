/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDamas;

/**
 *
 * @author CHINY
 */
public class Ficha {
    
     private char color; // R = Roja, N = Negra

    // CONSTRUCTOR
    public Ficha(char color) {
        this.color = color;
    }

    
    public char getColor() {
        return color;
    }

    // REPRESENTACION FICHA
   
    public String toString() {
        return String.valueOf(color);
    }
    
}
