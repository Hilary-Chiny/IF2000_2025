/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author CHINY
 */
import java.util.Scanner;
public class Lab2_practica {

    public Lab2_practica() {
        // constructor vacío
    }

    public void Suma_Pares() {  
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares entre 2 y 1000 es: " + suma);
    }
    
    public void ConvertirTemperatura() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
    }//END
    
    public void Potencia() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base X: ");
        int x = sc.nextInt();

        System.out.print("Ingrese el exponente n: ");
        int n = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }

        System.out.println(x + " elevado a la " + n + " es: " + resultado);
    }//END
    
    public void Mes_Del_Año() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese un número del 1 al 12: ");
    int numero = sc.nextInt();

    // EL ARRAY CON LOS MESES 
    String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    if (numero >= 1 && numero <= 12) {
        System.out.println("El mes correspondiente es: " + meses[numero - 1]);
    } else {
        System.out.println("Número inválido");
    }
}//END
    
    public void Funcion_F() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese un valor para x: ");
    double x = sc.nextDouble();

    double resultado;

    if (x > 0) {
        resultado = x + 5;
        
    } else if (x < 0) {
        resultado = x * x;  
        
    } else { // x == 0
        resultado = 1;
    }

    System.out.println("F(" + x + ") = " + resultado);
}//END
    
   public void Area_Triangulo() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el valor del lado a: ");
    double a = sc.nextDouble();

    System.out.print("Ingrese el valor del lado b: ");
    double b = sc.nextDouble();

    System.out.print("Ingrese el valor del lado c: ");
    double c = sc.nextDouble();

    // SEMIPERIMETRO
    double p = (a + b + c) / 2;

    // CALCULAR LA POTENCIA 
    double area = Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);

    System.out.println("El área del triángulo es: " + area);
}//END

public void Intercambiar_Valores() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el valor de A: ");
    int a = sc.nextInt();

    System.out.print("Ingrese el valor de B: ");
    int b = sc.nextInt();

    // IMTERCAMBIO CON LA VARIABLE 
    int temp = a;
    a = b;
    b = temp;

    System.out.println("Después del intercambio:");
    System.out.println("A = " + a);
    System.out.println("B = " + b);
}//END

public void Ecuacion_Recta() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese X0: ");
    double x0 = sc.nextDouble();
    System.out.print("Ingrese Y0: ");
    double y0 = sc.nextDouble();

    System.out.print("Ingrese X1: ");
    double x1 = sc.nextDouble();
    System.out.print("Ingrese Y1: ");
    double y1 = sc.nextDouble();

    if (x0 == x1) {
        System.out.println("La recta es vertical: x = " + x0);
        return;
    }

    // CALCULAR LA PENDIENTE M
    double m = (y0 - y1) / (x0 - x1);

    // CALCULAR B
    double b = y0 - m * x0;

    System.out.println("La ecuación de la recta es: y = " + m + "x + " + b);
}//END

public void Suma_Menores() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese un número natural H: ");
    int h = sc.nextInt();

    int suma = 0;
    for (int i = 1; i < h; i++) {
        suma += i;
    }

    System.out.println("La suma de los números naturales menores que " + h + " es: " + suma);
}//END
public void Promedio_Numeros() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de números: ");
    int n = sc.nextInt();

    double suma = 0;

    for (int i = 1; i <= n; i++) {
        System.out.print("Ingrese el número " + i + ": ");
        double num = sc.nextDouble();
        suma += num;
    }

    double promedio = suma / n;
    System.out.println("El promedio es: " + promedio);
}//END

public void Pares_Impares() {
    Scanner sc = new Scanner(System.in);

    int sumaTotal = 0;
   int sumaPares = 0;
   int sumaImpares = 0;
    int pares = 0;
    int impares = 0;

    for (int i = 1; i <= 10; i++) {
        int num = sc.nextInt();
        sumaTotal += num;

        if (num % 2 == 0) {
            sumaPares += num;
            pares++;
        } else {
            sumaImpares += num;
            impares++;
        }
    }

    System.out.println("Pares: " + pares + "  Impares: " + impares);
    System.out.println("Suma total: " + sumaTotal);
    System.out.println("Suma pares: " + sumaPares + "  Suma impares: " + sumaImpares);
}//END

public void Sum_pareimpar() {
    int sumaPares = 0, sumaImpares = 0;

    for (int i = 1; i <= 200; i++) {
        if (i % 2 == 0) {
            sumaPares += i;
        } else {
            sumaImpares += i;
        }
    }

    System.out.println("Suma de pares: " + sumaPares);
    System.out.println("Suma de impares: " + sumaImpares);
}//END

public void Suma() {
    int suma = 0;

    for (int i = 1; i <= 100; i++) {
        suma += i * i;  // o i^2
    }

    System.out.println("La suma de los cuadrados de los 100 primeros números naturales es: " + suma);
}//END
public void Factorial() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese un número entero positivo N: ");
    int n = sc.nextInt();

    if (n < 0) {
        System.out.println("El número debe ser positivo");
        return;
    }

    long factorial = 1; 

    for (int i = 1; i <= n; i++) {
        factorial *= i;
    }

    System.out.println(n + "! = " + factorial);
}//END

public void Valor_Maximo() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese 10 números:");

    int max = Integer.MIN_VALUE; // INICIAR CON EL VALOR MAS MENOR

    for (int i = 1; i <= 10; i++) {
        int num = sc.nextInt();
        if (num > max) {
            max = num;
        }
    }

    System.out.println("El valor máximo es: " + max);
}


}
