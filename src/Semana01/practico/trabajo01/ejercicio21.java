package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n,ncliente=0,montototal=0;
        String nombre;
        do{
            System.out.println("1.Realizar venta\n2.Salir\n");
            n=leer.nextInt();
            if(n==1){
                System.out.println("Nombre del cliente: ");
                nombre=leer.next();
                System.out.println("Monto de la venta: ");
                montototal+=leer.nextInt();
                ncliente++;
            }
        }while(n!=2);
        System.out.println("Total de clientes atendidos: "+ncliente);
        System.out.println("Monto total de las ventas del dia: "+montototal);
    }
}
