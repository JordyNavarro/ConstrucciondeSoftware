package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio29 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float ultimoregistro[]=new float[5],peso,promedio[]=new float[5];
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el ultimo registro del miembro "+(i+1)+": ");
            ultimoregistro[i]=leer.nextFloat();
            peso=0;
            for(int j=0;j<10;j++){
                System.out.println("Ingrese el peso registrado en la bascula "+(j+1)+": ");
                peso+=leer.nextFloat();
            }
            System.out.println("\n\n");
            promedio[i]=(float)peso/10;
        }
        for(int i=0;i<5;i++){
            if((promedio[i]-ultimoregistro[i])<0){
                System.out.println("El miembro "+(i+1)+" Bajo de peso");
            }else{
                System.out.println("El miembro " + (i + 1) + " Subio de peso");
            }
        }    
    }
}
