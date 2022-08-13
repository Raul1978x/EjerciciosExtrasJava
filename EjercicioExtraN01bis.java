  //To change this license header, choose License Headers in Project Properties.
 // To change this template file, choose Tools | Templates
 // and open the template in the editor.
 //
package ejerciciosdeaprendizaje.ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio1bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int minutos;
        int horas;
        int dias;

        System.out.println("Introduce los minutos: ");
        minutos = scanner.nextInt();
        

        dias = minutos / (60*24);
        horas = minutos % (60*24) / 60;
        minutos = minutos - (dias * 60 * 24) - (horas * 60);
        System.out.println("Transcurrieron " + dias + " dias , " + horas + " horas y " + minutos + " minutos");
    }
    
}
