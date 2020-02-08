package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de numeros primos que desea obtener: ");
        Scanner leer= new Scanner(System.in);
        int n,cont,cant=0;
        n= leer.nextInt();
            
        for(int i=1;cant<n;i++){
            cont=0;
            for(int j=1;j<=i;j++)
                if(i%j==0)
                    cont++;
                
            if(cont==2){
                System.out.println(i);
                cant++;
            }
            
        }
    }
}
