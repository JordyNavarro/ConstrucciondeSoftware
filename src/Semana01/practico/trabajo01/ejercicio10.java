package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int dias=15,cont=1,tiempo,tiempototal=0,tmayora16=0;
        float promedio;
        while(dias>0){
            System.out.println("Ingrese El tiempo realizado el dia "+cont+": ");
            tiempo=leer.nextInt();
            if(tiempo>16)
                tmayora16++;           
            tiempototal+=tiempo;
            cont++;
            dias--;
        }
        promedio=(float)tiempototal/15;
        System.out.println("\ntiempos mayores a 16: "+tmayora16+"\npromedio de tiempos echos: "+promedio);
        if(promedio<=15||tmayora16==0){
            System.out.println("\nEl atleta esta apto para la competencia.");
        }else{
            System.out.println("\nEl atleta no esta apto para la competencia.");
        }
    }
}
