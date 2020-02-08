package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio31 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int op,cant;
        double costo;
        float precio,suma=0;
        do{
            System.out.println("Elija su opcion:\n1.Anotar compra\n2.Salir");
            op=leer.nextInt();
            if(op==1){
                System.out.println("Precio del articulo: ");
                costo=leer.nextDouble();
                System.out.println("Cantidad: ");
                cant=leer.nextInt();
                precio=(float)costo*cant;
                suma+=precio;
            }
            if(op==2)
                break;
        }while(true);
        System.out.println("\nEl costo total de las compras es: "+suma);
    }
}
