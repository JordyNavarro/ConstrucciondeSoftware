package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio14 {
    public static int main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos que va registrar: ");
        int n=leer.nextInt();
        int op,hombres=0,mujeres=0;
        String nombres[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el nombre del alumno "+(i+1)+": ");
            nombres[i]=leer.next();
            System.out.println("Elija su sexo:\n1.Hombre\n2.Mujer");
            op=leer.nextInt();
            switch(op){
                case 1:
                    hombres++;
                    break;
                case 2:
                    mujeres++;
                    break;
                default:
                    System.out.println("Dato incorrecto");
            }
        }
        System.out.println("\nAlumnos:\n");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+". "+nombres[i]);
        }
        System.out.println("Cantidad de hombres: "+hombres);
        System.out.println("Cantidad de mujeres: "+mujeres);
        
        return hombres+mujeres;
    }
    
}
