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
public class EjercicioExtraN16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
        las personas ingresadas por teclado e indique si son mayores o menores de edad.
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
        mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
        */
        Scanner leerInt = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        String op = null;
        do{
        System.out.println("Ingrese nombre: ");
        String nom = leerString.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = leerInt.nextInt();
        if(edad >= 18){
            System.out.println("El dato ingresado es " + nom + "(" + edad +" años) MAYOR de edad");
            System.out.println("Desea Ingresar mas datos? (Si/No)");
            op = leerString.nextLine();
        }else {
            System.out.println("El dato ingresado es " + nom + "(" + edad +" años) y es MENOR de edad");
            System.out.println("Desea Ingresar mas datos? (Si/No)");
            op = leerString.nextLine();
        }
        }while(!"no".equalsIgnoreCase(op)&&"si".equalsIgnoreCase(op));
    }
    
}
