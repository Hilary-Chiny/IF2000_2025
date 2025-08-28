/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author CHINY
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Lab1_practica {

    public Lab1_practica() {
        
    }

    // VERIFICADOR 
    public void Num_ParImpar() {
        
        Scanner sc = new Scanner(System.in);

        // DATOS
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        // PROCESO
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            
            System.out.println("El número " + numero + " es IMPAR.");
        } 
    }
        public void ValorAbsoluto() {
        Scanner sc = new Scanner(System.in);

        // DATOS
        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();

        // PROCESO
        double absoluto = (numero < 0) ? -numero : numero;

        // PRINT
        System.out.println("El valor absoluto de " + numero + " es: " + absoluto);
    }
        
        public void SumarSerie() {
        int suma = 0;

        System.out.println("Serie números 3, 6, 9, ..., 99:");

        
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }

        System.out.println("\n suma de la serie es: " + suma);
    }
        
        
        public void ordenarTresNumeros() { 
            
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3]; 

        // ENTRADA
        System.out.print("Ingrese el primer número: ");
        numeros[0] = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        numeros[1] = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        numeros[2] = sc.nextInt();

        // PROCESO Y ORDENAR LOS NUMEROS 
        Arrays.sort(numeros);

        // SALIDA
        System.out.println("Números en orden ascendente: " 
         + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
        
        public void Notas() {
            
        Scanner sc = new Scanner(System.in);
        boolean huboDiez = false;
        int nota;

        System.out.println("Ingrese notas de 0 a 10 (ingrese -1 para terminar):");

        nota = sc.nextInt();
        while (nota != -1) {
            if (nota == 10) {
                huboDiez = true;
            }
            nota = sc.nextInt();
        }

        if (huboDiez) {
            System.out.println("Hubo al menos una nota con el valor 10");
        } else {
            System.out.println("No hubo nota de valor 10");
        }
    }

        
       public void Pulsaciones() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0); //CONVERTIR LAS LETRAS A MAYUSCULA
        
        double pulsaciones;

        if (sexo == 'F') {
            pulsaciones = (220 - edad) / 10.0;
        } else if (sexo == 'M') {
            pulsaciones = (210 - edad) / 10.0;
        } else {
            System.out.println("Sexo incorrecto. Ingrese M o F.");
            return; // END DEL METODO
        }

        System.out.println("Número de pulsaciones por cada 10 segundos: " + pulsaciones);
    }
       
        public void Utilidad() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese la antiguedad en años: ");
        double años = sc.nextDouble();

        double utilidad;
        
        if (años < 1) utilidad = salario * 0.05; //SI LA ANTIGUEDAD DEL TRABAJADOR ES MENOS DEL AÑO
        
        else if (años < 2) utilidad = salario * 0.07;
        
        else if (años < 5) utilidad = salario * 0.10;
        
        else if (años < 10) utilidad = salario * 0.15;
        
        else utilidad = salario * 0.20;

        System.out.println("La utilidad anual que corresponde es a: " + utilidad);
    }
        
        public void Primo() {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int N = sc.nextInt();

        if (N < 2) {
            System.out.println(N + " no es primo.");
            return;
        }

        int i;
        for (i = 2; i < N; i++) {
            if (N % i == 0) break; // ACA ES DONDE ENCUENTRA EL DIVISOR 
        }

        System.out.println(i == N ? N + " es primo." : N + " no es primo.");
    }
       
        public void Descuento_Computadoras() {
        Scanner sc = new Scanner(System.in);

        final double PRECIO = 11000;

        System.out.print("Ingrese la cantidad de computadoras: ");
        int cantidad = sc.nextInt();

        double total = cantidad * PRECIO;
        double descuento = 0;

        if (cantidad < 5) {
            descuento = total * 0.10;
        } else if (cantidad < 10) {
            descuento = total * 0.20;
        } else {
            descuento = total * 0.40;
        }

        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + (total - descuento));
    }
        
        public void Area_Triangulo() {
        Scanner sc = new Scanner(System.in);

        // DATOS
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();

        // PROCESO
        double area = (base * altura) / 2;

        // RESULTADO
        System.out.println("El área del triángulo es: " + area);
    }
    }//END