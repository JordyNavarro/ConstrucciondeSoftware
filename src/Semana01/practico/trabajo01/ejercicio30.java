package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio30 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int op;
        float precio,costo,suma=0;
        String etiqueta;
        do{
            System.out.println("Elija una opcion:\n1.Comprar\n2.Salir");
            op=leer.nextInt();
            if(op==1){
                System.out.println("Precio: ");
                costo=leer.nextFloat();
                System.out.println("Etiqueta: ");
                etiqueta=leer.next();
                if("roja".equals(etiqueta)){
                    precio=costo-(float)(costo*0.2);
                }else{
                    precio=costo;
                }
                suma+=precio;
            }
            if(op==2)
                break;
        }while(true);
        System.out.println("\nEl costo total de las compras es: "+suma);
    }
}
