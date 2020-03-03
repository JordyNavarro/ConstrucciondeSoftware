package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio26 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int edad,precio,op;
        float perdida[]={0,0,0,0,0},descuento,perdidatotal=0;
        System.out.println("Ingrese el precio de las entradas: ");
        precio=leer.nextInt();
        do{
            System.out.println("\nElija una opcion:\n1.Vender\n2.Salir"); 
            op=leer.nextInt();
            if(op==1){
                System.out.println("Ingrese su edad del cliente: ");
                edad=leer.nextInt();
                if(edad<5){
                    System.out.println("No puede ingresar");
                }
                if(edad>=5&&edad<=14){
                    descuento=(float)(precio*0.35);
                    perdida[0]+=descuento;
                }
                if(edad>=15&&edad<=19){
                    descuento=(float)(precio*0.25);
                    perdida[1]+=descuento;
                }if(edad>=20&&edad<=45){
                    descuento=(float)(precio*0.1);
                    perdida[2]+=descuento;
                }
                if(edad>=46&&edad<=65){
                    descuento=(float)(precio*0.25);
                    perdida[3]+=descuento;
                }
                if(edad>=66){
                    descuento=(float)(precio*0.35);
                    perdida[4]+=descuento;
                }
            }
            if(op==2)
                break;
        }while(true);
        for(int i=0;i<5;i++){
            System.out.println("\nLa perdida en la categoria "+(i+1)+" es: "+perdida[i]);
            perdidatotal+=perdida[i];
        }
        System.out.println("\n\nLa perdida total es "+perdidatotal);
    }
}
