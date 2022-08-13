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
public class EjercicioExtraN15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.
         */
        Scanner leer = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = leer.nextInt();
        String operacion = null;
        do {
            System.out.println("Ingrese la operacion a realizar(+, -, *, /)");
            operacion = leerString.nextLine();
        } while (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") && !operacion.equals("/"));
        operaciones(n1,n2,operacion);

    }
    public static void operaciones(int n1, int n2, String operacion){
        int resultado = 0;
        switch (operacion){
            case "+":
                resultado = n1 + n2;
                System.out.println( n1 + " + " + n2 + " = " + resultado);
                break;
            case "-":
                resultado = n1 - n2;
                System.out.println( n1 + " - " + n2 + " = " + resultado);
                break;
            case "*":
                resultado = n1 * n2;
                System.out.println( n1 + " * " + n2 + " = " + resultado);
                break;
            case "/":
                resultado = n1 / n2;
                System.out.println( n1 + " / " + n2 + " = " + resultado);
                break;
    }
}
}

