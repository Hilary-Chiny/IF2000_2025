/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Lenovo
 */
public class Ejercicios_Semana_PracticasEnClase {
    
    public Ejercicios_Semana_PracticasEnClase(){
    
}
    
    public void quiz2_B_piramide(int n){
        //controla los espacios
        for (int i = 0; i <= n; i++) {
       
            for (int j = 0; j <= (n-i)-1; j++) {
                 System.out.print("");
            }//end for ingterno A
            //controla los *s de la piramide
            
            for (int k = 0; k <= (2*i-1); k++) {
                System.out.print("*");           
            }//end interno B 
           
            System.out.println("");
        }
    }

    public void quiz_B_piramide(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}//end metodo
    

