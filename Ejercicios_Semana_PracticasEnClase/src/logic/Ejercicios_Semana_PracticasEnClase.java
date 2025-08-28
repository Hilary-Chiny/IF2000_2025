/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author CHINY
 * 
 * 
 */
import java.util.Scanner;
import java.util.Random;

public class Ejercicios_Semana_PracticasEnClase {
    
    public Ejercicios_Semana_PracticasEnClase(){
    
}
    
    public void quiz2_B_piramide(int n) {
    
    for (int i = 0; i <= n; i++) {

        // Espacios en blanco a la izquierda
        for (int j = 0; j <= (n - i) - 1; j++) {
            System.out.print(" "); 
        }//END INTERNO A

        
        for (int k = 0; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }//END INTERNO B

        System.out.println();
    }
}
 
    public void cuadro(int n) {
        
    for (int i = 0; i < n; i++) { // FILAS
        
        for (int j = 0; j < n; j++) { 
            // BORDES DEL CUADRITO
            
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                System.out.print("* ");
            } else {
                System.out.print("  "); //ESTO PARA QUE QUEDE ALINEADO
            }
        }
        System.out.println(); 
    }
}
    
    
    
     public void piramide_derecha(int n) {
         
     for (int i = n; i >= 1; i--) {     // EMPIEZA LA PIRAMIDE INVERSA HACIA LA DERECHA
         
        for (int j = 0; j < i; j++) {  // ARTEROSCOS
            
            System.out.print("*");
            
        }
        System.out.println(); 
    }
}

     
     
    public void ordenarArreglo() {
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // DATOS
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        //ORDENAMIENTO
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int h = 0; h < numeros.length - 1 - i; h++) {
                if (numeros[h] > numeros[h + 1]) {
                  
                    //INTERCAMBIO
                    int temp = numeros[h];
                    numeros[h] = numeros[h + 1];
                    numeros[h + 1] = temp;
                }
            }
        }

        // PRINT RESULTADO
        System.out.println("\nArreglo ordenado ascendentemente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
     public void ordenarAleatorios() {
        int[] numeros = new int[100];
        Random rand = new Random();

        // NUMEROS 
        for (int i = 0; i < 100; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        // ORDENAR DESENDENTE
        for (int i = 0; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (numeros[i] < numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        // PRINT
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
     
     public void ElTablero() {
        char[] filas = {'A','B','C','D','E','F','G','H'};

        System.out.println("  1 2 3 4 5 6 7 8");

        for (int i = 0; i < 8; i++) {
            System.out.print(filas[i] + " ");
            for (int j = 0; j < 4; j++) {
                if (i < 3) System.out.print("N ");       // F NEGRAS
                else if (i > 4) System.out.print("R ");  // F ROJAS
            }
            System.out.println();
        }
     }

}//end metodo
    

