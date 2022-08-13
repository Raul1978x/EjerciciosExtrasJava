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
public class EjercicioExtraN18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        N, con los valores ingresados por el usuario.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int [] vector = new int[N];
        int suma=0;
        for(int i=0;i<N;i++){
            System.out.println("Vector [" + i + "] = ");
            vector[i]= leer.nextInt();
            suma += + vector[i];
        }
        System.out.println("La suma de los elementos del Vector es: " + suma);
    }
    
}
