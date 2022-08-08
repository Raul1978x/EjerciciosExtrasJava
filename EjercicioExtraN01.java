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
import static java.lang.Math.floor;

public class EjercicioExtraN01 {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
      
        /*
        1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        */
        Scanner leer = new Scanner(System.in);
        double horas = 0;
        double dias = 0;
        float dia = 0;
        
        System.out.println("Ingrese un valor de tiempo en minutos");
        int tiempo = leer.nextInt();
        
        if(tiempo > 1440 && tiempo < 43200){
            dias = (double)tiempo/(60*24);
            dia =             
            
            double frac = dias - (float)floor(dias);
            /*
            System.out.println(dia);
            System.out.println(dias);
            System.out.println(frac);
            */
            horas = ((int)frac*10)/60;
        }//else if(tiempo > 60 && tiempo < 1440){
          //  horas = tiempo/60;
            
        System.out.println("El valor ingresado equivale a " + dia + " dia/s.");
        System.out.println("El valor ingresadado equivale a " + horas + " Hs.");
        }
    }
}

