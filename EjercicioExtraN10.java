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
public class EjercicioExtraN10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.
        */
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()* 11);
        int num2 = (int) (Math.random()* 11);
        int resultado = num1 * num2;
        int respuesta=0;
        //System.out.println(num1);
        //System.out.println(num2);
        
        do{
        System.out.println("Adivine el resultado de una muliplicacion entre dos numeros aleatorios entre 0 y 10");
        respuesta = leer.nextInt();
        }while(resultado != respuesta);
        System.out.println("Correcto la respuesta es: " + resultado);    
    }
    
}
