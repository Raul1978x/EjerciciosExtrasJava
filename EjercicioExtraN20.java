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
public class EjercicioExtraN20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int size = leer.nextInt();
        int[] vector = new int[size];
        llenaVecAlea(vector);
        imprimeVector(vector);
    }

    public static void llenaVecAlea(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);

        }
    }
     public static void imprimeVector(int[] vec) {
        System.out.println("");
        System.out.print("Vector = ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print("|" + vec[i] + "|");
        }
         System.out.println("");
    }
}
