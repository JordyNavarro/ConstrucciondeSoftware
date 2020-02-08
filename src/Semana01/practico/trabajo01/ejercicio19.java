package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el numero de clientes: ");
        int n=leer.nextInt();
        int monto[]=new int[n];
        float descuento[]=new float[n];
        String color[]={"rojo","amarillo","blanco"},temp;
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el monto del cliente "+(i+1));
            monto[i]=leer.nextInt();
            temp=color[aleatorio(0,2)];
            System.out.println("Elegir bola:\ncolor: "+temp);
            if(temp=="rojo"){
                descuento[i]=(float)(monto[i]*0.4);
            }else if(temp=="amarillo"){
                descuento[i]=(float)(monto[i]*0.25);
            }else{
                descuento[i]=0;
            }
        }
        System.out.println("\n\n");
        for(int i=0;i<n;i++){
            System.out.println("Descuento del cliente "+(i+1)+": "+descuento[i]+"\nTotal a pagar: "+(float)((monto[i]-descuento[i])));
        }
    }
    public static int aleatorio(int min,int max) {
        return (int)((max-min+1)*Math.random()+min);
    }
}
