package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio27 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el numero de obreros: ");
        int n=leer.nextInt();
        int horast[]=new int[n],hextra;
        float pago[]=new float[n],sueldob;
        System.out.println("Ingrese el pago por hora: ");
        sueldob=leer.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Ingrese las horas de trabajo del obrero "+(i+1)+": ");
            horast[i]=leer.nextInt();
            if(horast[i]>40){
                hextra=horast[i]-40;
                if(hextra>8){
                    pago[i]=(float)(hextra-8)*sueldob*3;
                    pago[i]+=8*2*sueldob;
                }
                pago[i]+=40*sueldob;
            }else
                pago[i]=horast[i]*sueldob;
            
        }
        
        for(int i=0;i<n;i++)
            System.out.println("\nEl sueldo total del obrero "+(i+1)+" es: "+pago[i]);
        
    }
}
