package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio28 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int op,costo,cant;
        float precio,ganancia=0;
        do{
            System.out.println("Elija una opcion:\n1. Registrar una venta\n2. Salir");
            op=leer.nextInt();
            if(op==1){
                System.out.println("Ingrese el precio del articulo: ");
                costo=leer.nextInt();
                System.out.println("Ingrese la cantidad de articulos: ");
                cant=leer.nextInt();
                precio=(float)costo*cant;
                ganancia+=precio;
                System.out.println("El monto de la compra es: "+precio+"\n");
            }
            if(op==2)
                break;
        }while(true);
        System.out.println("\n\nLa ganancia del dia es: "+ganancia);
    }
}
