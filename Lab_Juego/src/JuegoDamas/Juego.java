/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDamas;


import java.util.Scanner;

/**
 *
 * @author CHINY
 */
public class Juego {
    
    private Tablero tablero;
    private char turno; // 'R' o 'N'

    // Constructor
    public Juego() {
        tablero = new Tablero();
        turno = 'R'; // THE RED BEGIN
    }

    // START THE GAME
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            tablero.mostrarTablero();
            System.out.println("\nTurno de: " + (turno == 'R' ? "Rojas (R)" : "Negras (N)"));

            // REQUEST THE COORDINATES
            System.out.print("Fila origen: ");
            int filaOrigen = sc.nextInt();
            
            System.out.print("Columna origen: ");
            int colOrigen = sc.nextInt();

            System.out.print("Fila destino: ");
            int filaDestino = sc.nextInt();
            
            System.out.print("Columna destino: ");
            int colDestino = sc.nextInt();

            // MOVE THE PIECE 
            if (tablero.moverFicha(filaOrigen, colOrigen, filaDestino, colDestino, turno)) {
              
                // CAMBIAR EL TURNO SI EL MOVIMIENTO FUE VALIDO 
                turno = (turno == 'R') ? 'B' : 'R';
            }

            System.out.print("\n¿Deseas continuar jugando? (si/no): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        System.out.println("Juego terminado.");
        sc.close();// CEND THE GAME
    }

    
    
}
