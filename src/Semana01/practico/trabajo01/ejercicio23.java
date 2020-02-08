package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float galones=0,pago=0,ganancia=0;
        double galon=3.785;
        int op;
        do{
            System.out.println("Ingrese el tipo de gasolina:\n1. A(50$)\n2. B(55$)\n3. C(60$)\n4. D ");
            op=leer.nextInt();
            if(op!=4){
                System.out.println("Ingrese cuantos galones desea: ");
                galones=leer.nextFloat();
            }
            if(op==1){
                pago=(float)(galones*galon*50);
                System.out.println("Total a pagar: "+pago+"\n");
                ganancia+=pago;
            }
            if(op==2){
                pago=(float)(galones*galon*55);
                System.out.println("Total a pagar: "+pago+"\n");
                ganancia+=pago;
            }
            if(op==3){
                pago=(float)(galones*galon*60);
                System.out.println("Total a pagar: "+pago+"\n");
                ganancia+=pago;
            }
            
        }while(op!=4);
        System.out.println("\nLa ganancia total fue: "+ganancia);
    }
}
