/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.if2000program;

import logic.Ejercicios_Semana_PracticasEnClase;
import logic.Lab1_practica;
import logic.Quiz;
/**
 *
 * @author CHINY
 */
public class IF2000Program {
    public static void main(String[] args) {
       Ejercicios_Semana_PracticasEnClase ej = new Ejercicios_Semana_PracticasEnClase();
    
        ej.quiz2_B_piramide(5);
        ej.cuadro(5);
        ej.piramide_derecha(12);
        ej.ordenarArreglo();
        ej.ordenarAleatorios();
        ej.ElTablero();
       
       
        Quiz qh = new Quiz ();
        qh.Figura();
       
        Lab1_practica lab = new Lab1_practica();
        
        lab.Num_ParImpar();
        lab.ValorAbsoluto();
        lab.SumarSerie();
        lab.ordenarTresNumeros();
        lab.Notas();
        lab.Pulsaciones();
        lab.Utilidad();
        lab.Primo();
        lab.Descuento_Computadoras();
        lab.Area_Triangulo();
    }
}
