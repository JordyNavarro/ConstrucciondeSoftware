package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int n,i=1,cont=0;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n=leer.nextInt();
        while(n>=i){
            if(n%i==0){
                cont++;
            }
            i++;
        }
        if(cont==2)
        System.out.println("\nEs un numero primo");
        else System.out.println("\nNo es un numero primo");
       
        int a=1,b=0;
        while(a<=n){
            a=a+b;
            b=a-b;
            if(a==n)
                break;
        }
        if(a==n)
            System.out.println("Es fibonacci");
        else System.out.println("No es fibonacci");
    }
}
