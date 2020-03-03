package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de obreros: ");
        n=leer.nextInt();
        System.out.println("\n\n");
        int horast[]=new int[n];
        int pago[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Ingrese la horas de trabajo del obrero "+(i+1)+": ");
            horast[i]=leer.nextInt();
            if(horast[i]<=40){
                pago[i]=horast[i]*20;
            }else if(horast[i]>40){
                pago[i]=(40*20)+((horast[i]-40)*25);
            }
        }
        System.out.println("\n\n");
        for(int i=0;i<n;i++){
            System.out.println("El pago del obrero "+(i+1)+" es: "+pago[i]);
        }
    }
}
