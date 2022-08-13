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
public class EjercicioExtraN13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        13. Crear un programa que dibuje una escalera de números, donde cada línea de números
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
        usuario al comenzar. Ejemplo: si se ingresa el número 3:
            1
            12
            123
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int alt = leer.nextInt();
        String[] vec = new String[alt];
        System.out.println("");
        String palabra, concat = "";
        int altura = 0;
        for (String vec1 : vec) {
            altura++;
            palabra = Integer.toString(altura);
            concat = concat + palabra;
        }
        for (int i = 0; i < vec.length; i++) {
            vec[i] = concat.substring(0, i + 1);
            System.out.println(vec[i]);
        }
    }

}
