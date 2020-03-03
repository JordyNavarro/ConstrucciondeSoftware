package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va ingresar: ");
        int n=leer.nextInt();
        int may;
        int arr[]=new int[n];
        System.out.println("\nIngrese los numeros: ");
        for(int i=0;i<n;i++){
            arr[i]=leer.nextInt();
        }
        may=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>may){
                may=arr[i];
            }
        }
        System.out.println("El numero mayor es: "+may);
    }
}
