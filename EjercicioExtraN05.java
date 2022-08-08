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
public class EjercicioExtraN05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        5. Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.
        */
        Scanner leerString = new Scanner(System.in);
        Scanner leerInt = new Scanner(System.in);
        System.out.println("Ingrese que tipo de socio es ('A', 'B' o 'C'): ");
        String socio = leerString.nextLine();
        System.out.println("Ingrese el costo del tratamiento: ");
        int valor = leerInt.nextInt();
        switch (socio){
            case "a":
            case "A":
                System.out.println("El socio deberá abonar: $" + (valor -(valor*0.5)) + " de un valor total de: $" + valor);
                break;
            case "b":
            case "B":
                System.out.println("El socio deberá abonar: $" + (valor - (valor*0.35)) + " de un valor total de: $" + valor);
                break; 
            case "c":
            case "C":
                System.out.println("El socio deberá abonar: $" + valor + " de un valor total de: $" + valor);
                break;    
        }
        
        
    }
    
}
