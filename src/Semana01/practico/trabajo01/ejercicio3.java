package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int n=leer.nextInt();
        float suma=0;
        for(int i=1;i<=n;i++){
            suma+=(float)1/factorial(i);
        }
        System.out.println("La suma es: "+suma);
    }
    
    public static int factorial(int n) {
        int factor=1;
        if(n>1)
           factor=n*factorial(n-1); 
        
        return factor;
    }
 
}
