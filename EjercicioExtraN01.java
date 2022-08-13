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
public class EjercicioExtraN01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
         */
        Scanner leer = new Scanner(System.in);
        int hora = 60, resta = 0, min = 0;
        int dia = 1440, contH = 0;
        int contD = 0;
        int horas = 60;
        System.out.println("Ingrese un valor de tiempo en minutos");
        int tiempo = leer.nextInt();
        if (tiempo > 1440 && tiempo < 44641) {
            do {
                resta = tiempo - dia;
                tiempo = resta;
                contD++;
            } while (resta > dia);
            do {
                resta = tiempo - horas;
                tiempo = resta;
                contH++;
            } while (dia > horas && resta > 60);
            System.out.println("El valor ingresado equivale a " + contD + " dia/s y " + contH + " horas y " + resta + " minutos.");
        } else if (tiempo >= 60 && tiempo <= 1440) {
            do {
                resta = tiempo - hora;
                tiempo = resta;
                contH++;
            } while (hora < resta);
            System.out.println("El valor ingresado equivale a " + contH + " hora/s y " + tiempo + " minutos");
        } else if (tiempo > 0 && tiempo < 60) {
            do {
                min = tiempo;
            } while (resta >= min);
            System.out.println("El valor ingresado equivale a " + min + " minutos.");
        }
    }
}
