package javaejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class EjercicioExtraN21 {

    public static void main(String[] args) {
        /*
        Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
        adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
            Primer trabajo práctico evaluativo 10%
            Segundo trabajo práctico evaluativo 15%
            Primer Integrador 25%
            Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
        igual al 7 de sus notas del curso.
         */
        Scanner leer = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        int cant = leer.nextInt();

        String[] alumnos = new String[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = leerString.nextLine();
        }
        double[][] matriz = new double[cant][5];

        llenarMatriz(matriz, alumnos);
        imprimeMatriz(matriz, alumnos);
    }

    public static void llenarMatriz(double[][] matriz, String[] alumnos) {

        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    System.out.println("Ingrese la nota del Primer trabajo práctico evaluativo del alumno " + alumnos[i]);
                    matriz[i][j] = (int) leer.nextInt();
                    //matriz[i][j] = (int) (Math.random() * 10);
                }
                if (j == 1) {
                    System.out.println("Ingrese la nota del Segundo trabajo práctico evaluativo del alumno " + alumnos[i]);
                    matriz[i][j] = (int) leer.nextInt();
                    //matriz[i][j] = (int) (Math.random() * 10);
                }
                if (j == 2) {
                    System.out.println("Ingrese la nota del Primer Integrador del alumno " + alumnos[i]);
                    matriz[i][j] = (int) leer.nextInt();
                    //matriz[i][j] = (int) (Math.random() * 10);
                }
                if (j == 3) {
                    System.out.println("Ingrese la nota del Segundo Integrador del alumno " + alumnos[i]);
                    matriz[i][j] = (int) leer.nextInt();
                    //matriz[i][j] = (int) (Math.random() * 10);
                }
                if (j == 4) {
                    matriz[i][j] = ((matriz[i][0] * 0.1) + (matriz[i][1] * 0.15) + (matriz[i][2] * 0.25) + (matriz[i][3] * 0.5));
                }
            }
        }
    }

    public static void imprimeMatriz(double[][] matriz, String[] alumnos) {
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(alumnos[i] + "   ");

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
                if (j == 4 && matriz[i][j] >= 7) {
                    cont++;
                }
            }
            System.out.println();
        }
        System.out.println("Aprobados: " + cont);
        System.out.println("Desaprobados" + (matriz.length - cont));
    }
}
