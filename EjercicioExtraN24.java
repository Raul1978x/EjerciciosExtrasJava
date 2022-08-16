/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class EjercicioExtraN24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que complete un vector con los N primeros números de la sucesión
        de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
        números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
        La sucesión del número 2 se calcula sumando (1+1)
        Análogamente, la sucesión del número 3 es (1+2),
        Y la del 5 es (2+3),
        Y así sucesivamente…
        La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
        Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
        Fibonaccin = 1 para todo n<=1
        Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
        como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
        Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
        https://quantdare.com/numeros-de-fibonacci/
         */
        int n, a = 0, b = 1, c = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            if (i < n - 1) {
                System.out.print(a + ", ");
            } else {
                System.out.print(a + " ");
            }
        }
        System.out.println("");
    }
    
}
