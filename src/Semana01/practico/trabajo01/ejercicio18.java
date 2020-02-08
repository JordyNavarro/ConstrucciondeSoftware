package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos: ");
        int n=leer.nextInt();
        String nombres[]= new String[n];
        int hombres=0,mujeres=0,sumah=0,sumam=0,temp;
        for(int i=0;i<n;i++){
            System.out.println("Ingrese los datos del alumno "+(i+1)+":\n");
            System.out.println("Nombres: ");
            nombres[i]=leer.next();
            System.out.println("Edad: ");
            temp=leer.nextInt();
            System.out.println("Elija su sexo:\n1.Hombre\n2.Mujer");
            int op=leer.nextInt();
            switch(op){
                case 1:
                    hombres++;
                    sumah+=temp;
                    break;
                case 2:
                    mujeres++;
                    sumam+=temp;
                    break;
                default:
                    System.out.println("Dato incorrecto");
            }
            
        }
        System.out.println("\nEl promedio de las edades de las mujeres es: "+(float)sumam/mujeres);
        System.out.println("\nEl promedio de las edades de los hombres es: "+(float)sumah/hombres);
        System.out.println("\nEl promedio total de las edades es: "+(float)(sumam+sumah)/(mujeres+hombres));
    }
}
