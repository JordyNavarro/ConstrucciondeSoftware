package Semana01.practico.trabajo01;

import java.util.Scanner; 

/**
 *
 * @author H´P
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos: ");
        int n=leer.nextInt();
        float prom[]=new float[n];
        for (int i=0;i<n;i++){
            int suma=0;
            System.out.println("Ingrese las notas del alumno "+(i+1)+": ");
            for(int j=0;j<4;j++){
                suma+=leer.nextInt();      
            }
            prom[i]=(float)suma/4;
        }
        System.out.println("\n");
        for(int i=0;i<n;i++){
            System.out.println("Promedio del alumno "+(i+1)+" es: "+prom[i]);
        }
    }
}
