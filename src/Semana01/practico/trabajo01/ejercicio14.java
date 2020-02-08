package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el sueldo base: ");
        float sueldo=leer.nextFloat();
        System.out.println("Ingrese el numero de vendedores de la tienda: ");
        int n=leer.nextInt();
        float comision,temp,comisiones[]=new float[n];
        for(int i=0;i<n;i++){
            System.out.println("Ingrese las ventas del vendedor "+(i+1)+": ");
            comision=0;
            for(int j=0;j<3;j++){
                temp=leer.nextInt();
                comision+=temp*0.1;
            }
            comisiones[i]=comision;
        }
        
        for(int i=0;i<n;i++){
            System.out.println("\nLas comisiones por venta del vendedor "+(i+1)+" son: "+comisiones[i]);
            System.out.println("El sueldo total es: "+(sueldo+comisiones[i]));
        }
    }
}
