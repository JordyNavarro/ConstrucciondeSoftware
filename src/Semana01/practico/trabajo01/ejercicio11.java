package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int categoria[]={0,0,0};
        float porcentaje[]= new float[3];
        int edad,n,cant=0;       
        do{
            System.out.println("Elija el animal que estudiara:\n1. Elefantes\n2. Jirafas\n3. Chimpances");
            n=leer.nextInt();
        }while(n!=1&&n!=2&&n!=3);    
        if(n==1){
            cant=20;
        }
        if(n==2){
            cant=15;
        }
        if(n==3){
            cant=40;
        }           
        for(int i=0;i<cant;i++){
            System.out.println("Ingrese cuantos años tiene el animal "+(i+1)+": ");
            edad=leer.nextInt();
            if(edad>=0&&edad<=1){
                categoria[0]++;
            }
            if(edad>1&&edad<3){
                categoria[1]++;
            }
            if(edad>=3){
                categoria[2]++;
            }
        }
        porcentaje[0]=(float)categoria[0]*100/cant;
        porcentaje[1]=(float)categoria[1]*100/cant;
        porcentaje[2]=(float)categoria[2]*100/cant;
        System.out.println("\nEl porcentaje de la categoria de 0 a 1 año es: "+porcentaje[0]);
        System.out.println("\nEl porcentaje de la categoria mayor de 1 y menor de 3 años es: "+porcentaje[1]);
        System.out.println("\nEl porcentaje de la categoria de 3 años o mas es: "+porcentaje[2]);
    }
    
}
