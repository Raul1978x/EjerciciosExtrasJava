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
public class EjercicioExtraN06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.
        */
        Scanner leer = new Scanner(System.in);
        Scanner leerB = new Scanner(System.in);
        double altura = 0;
        double promMenor = 0;
        double prom = 0;
        double sAlt = 0;
        double sAltM = 0;
        int cont = 0;
        System.out.println("Ingrese la cantidad de personas a promediar");
        int pers = leer.nextInt();
        for(int i = 0; i < pers; i++){
        System.out.println("Ingrese las estaturas: ");
        altura = leerB.nextDouble();
        sAlt = altura + sAlt;
        if(altura < 1.6){
        sAltM = altura + sAltM;
        cont++;
        }
        prom = (float)sAlt/pers;
        promMenor = (float)sAltM/cont;
        }
        System.out.println("la altura promedio de todas las (" + pers + ") personas es: " +  prom);
        System.out.println("la altura promedio de las " + cont + " personas que miden menos de 1,60 mts es: " +  promMenor);
    }
    
}
