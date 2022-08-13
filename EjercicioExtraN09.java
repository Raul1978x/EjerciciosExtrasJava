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
public class EjercicioExtraN09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        9. Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
            Por ejemplo: 50 / 13:
                                    50 – 13 = 37 una resta realizada
                                    37 – 13 = 24 dos restas realizadas
                                    24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero a dividir");
        int num = leer.nextInt();
        System.out.println("Complete la division " + num + "/ ");
        int divisor = leer.nextInt();
        int resta=0;
        int cont = 0;
        do{
           resta = num - divisor;
           num = resta;
           cont++;
           }while(resta >= divisor);
        System.out.println("El resultado de la division " + num + "/" + divisor + " = " + cont + " de cociente y " + resta + " de resto");
    }
    
}
