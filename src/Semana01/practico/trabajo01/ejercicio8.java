package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int clientes=15,kilos,cont=1;
        float ganancia=0,descuento,precio,pago;
        System.out.println("Ingrese el precio por kilo: ");
        precio=(float)leer.nextDouble();
        while(clientes>0){
            System.out.println("\nIngrese cuantos kilos comprara el cliente "+cont+": ");
            kilos=leer.nextInt();
            if(kilos>10){
                descuento=(float)(kilos*precio*0.15);
            }else{
                descuento=0;
            }
            pago=(kilos*precio)-descuento;
            ganancia+=pago;
            System.out.println("El pago del cliente "+cont+" es: "+pago);
            cont++;
            clientes--;
        }
        System.out.println("\n\nLa ganancia total es: "+ganancia);
    }
}
