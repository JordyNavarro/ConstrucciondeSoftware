package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float ganancia,inversion;
        System.out.println("Ingrese el monto inicial de inversion: ");
        inversion=leer.nextFloat();
        for(int i=0;i<12;i++){
            ganancia= (float) (inversion*0.02);
            inversion+=ganancia;
        }
        System.out.println("La cantidad obtenida es: "+inversion);
    }
}
