package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n,suma=0,cont=0;
        System.out.println("Ingrese los numeros");
        while(true){
            n=leer.nextInt();
            if(n<0) break;
            suma+=n;
            cont++;
        }
        System.out.println("El promedio es: "+(float)suma/cont);
        
        
        System.out.println("\n\nIngrese los numeros");
        suma=0;
        cont=0;
        do{
            n=leer.nextInt();
            suma+=n;
            cont++;
        }while(n>0);
        System.out.println("El promedio es: "+(float)(suma-n)/(cont-1));
    }
    
}
