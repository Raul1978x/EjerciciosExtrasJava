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
public class EjercicioExtraN08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
         */
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int total = 0;
        int pares = 0;
        do {
            System.out.println("Ingrese numeros");
            num = leer.nextInt();
            if (num < 0) {
                continue;
            } else if (num % 2 == 0) {
                pares++;
            }
            total++;

        } while (num % 5 != 0);
        System.out.println("La cantidad leida es: " + total);
        System.out.println("La cantidad de pares es: " + pares);
        System.out.println("La cantidad de impares es: " + (total - pares));

    }
}


