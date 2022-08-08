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
public class EjercicioExtraN07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
        de n números (n>0). El valor de n se solicitará al principio del programa y los números
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el
        bucle “while” y otra con el bucle “do - while”.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a procesar");
        int n = leer.nextInt();
        
        int i = 0;
        int mayor = 0;
        int menor = 100000;
        int suma = 0;
        double prom = 0;
        // CON WHILE
       
        while (i < n) {
            i++;
            System.out.println("Ingrese los numeros");
            int num = leer.nextInt();
            suma = num + suma;
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        prom = (double) suma /n;
        System.out.println("El valor menor es: " + menor);
        System.out.println("El valor mayor es: " + mayor);
        System.out.println("El valor promedio es: " + prom);
         
        // CON DO WHILE
        /*
        do {
            i++;
            System.out.println("Ingrese los numeros");
            int num = leer.nextInt();
            
            if (menor > num) {
                menor = num;
            }
            if (mayor < num) {
                mayor = num;
            }
            suma = num + suma;
            
            }while (i < n);

            prom = (double) suma/n;
            System.out.println("El valor menor es: " + menor);
            System.out.println("El valor mayor es: " + mayor);
            System.out.println("El valor promedio es: " + prom);
*/
        } 
    }


