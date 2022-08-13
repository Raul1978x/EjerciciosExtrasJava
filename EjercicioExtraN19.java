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
public class EjercicioExtraN19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        19. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos).
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int N = leer.nextInt();
        int[] vec1 = new int[N];
        int[] vec2 = new int[N];
        int cont = 0;
        for (int i = 0; i < N; i++) {
            vec1[i] = (int) (Math.random() * 10);
            vec2[i] = (int) (Math.random() * 10);
            //vec2[i] = vec1[i];
        }
        imprimeVector(vec1, N);
        imprimeVector(vec2, N);

        System.out.println("");
        for (int i = 0; i < N; i++) {
            if (vec1[i] != vec2[i]) {
                System.out.println("No son iguales");
                break;
            }
            if (vec1[i] == vec2[i]) {
                cont++;
            }
        }
        if (cont == N) {
            System.out.println("Los vectores son iguales");
        }
}

    public static void imprimeVector(int[] vec, int tam) {
        System.out.println("");
        System.out.print("Vector = ");
        for (int i = 0; i < tam; i++) {
            System.out.print("|" + vec[i] + "|");
        }
    }
}
