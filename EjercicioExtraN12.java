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
public class EjercicioExtraN12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
                0-0-0
                0-0-1
                0-0-2
                0-0-E
                0-0-4
                0-1-2
                0-1-E
        Nota: investigar función equals() y como convertir números a String.
        */
        int uni=0;
        int dec=0;
        int cen=0;
        String uniCad;
        String decCad;
        String cenCad;                
        
        for(int i = 0; i < 9; i++){
            cen += +1;    
            dec += +1;
            uni += +1;
            //System.out.println(uni);
            uniCad = Integer.toString(uni);
            cenCad = Integer.toString(cen);
            decCad = Integer.toString(dec);
            if(uni == 3 && dec == 3 && cen == 3){
                uniCad = "E";
                cenCad = "E";
                decCad = "E";
                System.out.println(cenCad + " - " + decCad + " - " + uniCad);
            }else {
                System.out.println(cenCad + " - " + decCad + " - " + uniCad);
            }
        
        }
        
        
    }
    
    
    
}
