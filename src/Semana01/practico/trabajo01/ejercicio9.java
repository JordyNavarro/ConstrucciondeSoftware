package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va ingresar: ");
        int n=leer.nextInt();
        int min;
        int arr[]=new int[n];
        System.out.println("\nIngrese los numeros: ");
        for(int i=0;i<n;i++){
            arr[i]=leer.nextInt();
        }
        min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("El numero menor es: "+min);
    }
}
