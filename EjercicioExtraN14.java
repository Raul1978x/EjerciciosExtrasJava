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
public class EjercicioExtraN14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int n = leer.nextInt();
        double prom1 = 0, prom2 = 0, prom3 = 0, prom4 = 0;
        double media = 0, media1 = 0, media2 = 0, media3 = 0, media4 = 0, prom = 0, promT = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i + 1));
            int m = leer.nextInt();
            int[] hijos = new int[m];
            switch (m) {
                case 0:
                    System.out.println("La familia " + (i + 1) + " no tiene hijos");
                    break;
                case 1:
                    System.out.println("Ingrese la edad de su hijo");
                    for (int j = 0; j < m; j++) {
                        hijos[j] = leer.nextInt();
                        prom = m;
                    }
                    media = hijos[i];
                    break;
                case 2:
                    System.out.println("Ingrese la edad de sus hijos");
                    for (int j = 0; j < m; j++) {
                        hijos[j] = leer.nextInt();
                        media1 += +hijos[j];
                        prom1 = m;
                    }

                    break;
                case 3:
                    System.out.println("Ingrese la edad de sus hijos");
                    for (int j = 0; j < m; j++) {
                        hijos[j] = leer.nextInt();
                        media2 += +hijos[j];
                        prom2 = m;
                    }

                    break;
                case 4:
                    System.out.println("Ingrese la edad de sus hijos");
                    for (int j = 0; j < m; j++) {
                        hijos[j] = leer.nextInt();
                        media3 += +hijos[j];
                        prom3 = m;
                    }

                    break;
                case 5:
                    System.out.println("Ingrese la edad de sus hijos");
                    for (int j = 0; j < m; j++) {
                        hijos[j] = leer.nextInt();
                        media4 += +hijos[j];
                        prom4 = m;
                    }

                    break;
            }
            promT = (media + media1 + media2 + media3 + media4) /(prom + prom1 + prom2 + prom3 + prom4);
        }

        System.out.println("La cantidad familias ingresadas es " + n
                + " y la edad media de sus hijos es " + promT);
    }

}
