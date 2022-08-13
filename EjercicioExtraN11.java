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
public class EjercicioExtraN11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int resultado=0;
        int result=num;
        int cont=0;
        do{
            resultado = num/10;
            num = resultado;
            cont++;
        }while(resultado > 0);
        System.out.println("El numero " + result + " tiene " + cont + " digitos" );
    }
    
}
