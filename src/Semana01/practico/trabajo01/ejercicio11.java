package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int favor,contra,nulo,cant;
        float pfavor,pcontra,pnulo;
        System.out.println("Ingrese cuantos estan a favor:");
        favor=leer.nextInt();
        System.out.println("Ingrese cuantos estan en contra:");
        contra=leer.nextInt();
        System.out.println("Ingrese cuantos no opinan:");
        nulo=leer.nextInt();
        cant=favor+contra+nulo;
        pfavor=(float)favor*100/cant;
        pcontra=(float)contra*100/cant;
        pnulo=(float)nulo*100/cant;
        
        System.out.println("Votos a favor: "+pfavor+ "%");
        System.out.println("Votos en contra: "+pcontra+ "%");
        System.out.println("No opina: "+pnulo+ "%");
    }
}
