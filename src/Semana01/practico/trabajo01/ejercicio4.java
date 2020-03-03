package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero: ");
        n=leer.nextInt();
        System.out.println("Tabla de multiplicacion de "+n+":\n");
        for (int i = 0; i < 12; i++) {
            System.out.println(n+"x"+(i+1)+"= "+(n*(i+1)));
        }
    }
}
