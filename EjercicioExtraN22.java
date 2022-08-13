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
public class EjercicioExtraN22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        22. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        muestre la suma de sus elementos.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la matriz");
        int N = leer.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz");
        int M = leer.nextInt();
        
        int [][] matriz = new int[N][M];
        int suma = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matriz[i][j] = (int)(Math.random()*10);
                suma = matriz[i][j] + suma;
            }
        }
        imprimeMatriz(matriz);
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }
     public static void imprimeMatriz(int[][] matriz) {
        System.out.println("");
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("|" + matriz[i][j] + "|");
        }
         System.out.println("");
    }
}
}
