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
public class EjercicioExtraN23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().
         */
        Scanner leerString = new Scanner(System.in);

        String palabra;
        int palabras;
        String[][] sopaDeLetras = new String[20][20];
        String[] vec = new String[5];

        do {
            System.out.println("Ingrese palabras");
            palabra = leerString.nextLine();
            palabras = palabra.length();
        } while (palabras > 2 && palabras > 6);
      //char[] frase = palabra.toCharArray();
      for(char frase: palabra.toCharArray()){
          System.out.print(frase+ "*");
      }
      /*
      for(int i =0; i < frase.length; i++ ){
          System.out.println(frase);
}/*
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras[i].length; j++) {
                if(i==0 && j < 6){
                    sopaDeLetras[i][j] = palabra.substring(0,3);
                }
            }
        }*/

        /*
for(String[] fila : sopaDeLetras){
    for(String elemento : fila){
        elemento = palabra.substring(sopaDeLetras.length);
    }
}*/
        //imprimeMatriz(sopaDeLetras);
    }



    public static void imprimeMatriz(String[][] matriz) {
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
