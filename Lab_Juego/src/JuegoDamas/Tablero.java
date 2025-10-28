/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoDamas;

/**
 *
 * @author CHINY
 */
public class Tablero {
    
    private Ficha[][] matriz = new Ficha[8][8]; // BOARD 8x8

    //CONSTRUCTOR
    public Tablero() {
        inicializarTablero();
    }

    // INITIALIZE THE BOARD WITH THE PIECE 
    private void inicializarTablero() {
        // NEGRAS ARRIBA (ROWS 0 a 2)
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 8; col++) {
                if ((fila + col) % 2 == 1) {
                    matriz[fila][col] = new Ficha('N');
                }
            }
        }

        // ROJAS HACIA ABAJO (ROWS 5 a 7)
        for (int fila = 5; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                if ((fila + col) % 2 == 1) {
                    matriz[fila][col] = new Ficha('R');
                }
            }
        }
    }

    // SHOW THE GAME BOARD
    public void mostrarTablero() {
        System.out.println("\n  0 1 2 3 4 5 6 7"); //COLUMNAS 
        for (int fila = 0; fila < 8; fila++) {
            System.out.print(fila + " ");
            for (int col = 0; col < 8; col++) {
                if (matriz[fila][col] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(matriz[fila][col] + " ");
                }
            }
            System.out.println();
        }
    }

    // MOVE A PIECE 
    public boolean moverFicha(int filaOrigen, int colOrigen, int filaDestino, int colDestino, char turno) {
        // COORDENADAS
        if (!coordenadasValidas(filaOrigen, colOrigen) || !coordenadasValidas(filaDestino, colDestino)) {
            System.out.println("El Movimiento esta fuera del tablero");
            return false;
        }

        
        Ficha ficha = matriz[filaOrigen][colOrigen];
        if (ficha == null) {
            System.out.println("No hay ficha en la posición");
            return false;
        }

        // COLOR DE FICHA
        if (ficha.getColor() != turno) {
            System.out.println("No puedes mover la ficha del oponente");
            return false;
        }

        // VERIFICAR LA CASIILA VACIA HACIA DONDE SE VA A MOVER
        if (matriz[filaDestino][colDestino] != null) {
            System.out.println("La casilla de destino está ocupada");
            return false;
        }

        // DIAGONAL MOVEMENT
        int movFila = Math.abs(filaDestino - filaOrigen);
        int movCol = Math.abs(colDestino - colOrigen);

        if (movFila != 1 || movCol != 1) {
            System.out.println("Solo puedes mover una casilla en diagonal");
            return false;
        }

        // COLOR MOVEMENT 
        if (turno == 'R' && filaDestino >= filaOrigen) {
              System.out.println("Las rojas solo pueden moverse hacia arriba.");
              return false;
}

         if (turno == 'B' && filaDestino <= filaOrigen) {
              System.out.println("Las negras solo pueden moverse hacia abajo.");
              return false;
}

        // MOVE FICHA
        matriz[filaDestino][colDestino] = ficha;
        matriz[filaOrigen][colOrigen] = null;
        return true;
    }

    // COORDWENADAS EN TABLERO
    private boolean coordenadasValidas(int fila, int col) {
        return fila >= 0 && fila < 8 && col >= 0 && col < 8;
    }
    
}
