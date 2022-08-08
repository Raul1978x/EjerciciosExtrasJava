/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejerciciosextras;

/**
 *
 * @author Raul
 */
public class EjercicioExtraN02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
        tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        int A = 5;
        int B = 8;
        int C = 15;
        int D = 18;
        int aux = 0;
        System.out.println("Valores Originales A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);     
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("Valores Cambiados A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);     
    }
    
}
