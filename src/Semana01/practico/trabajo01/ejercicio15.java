package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio15 {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n;
        System.out.println("Ingrese el numero de vehiculos que ingresaron: ");
        n=leer.nextInt();
        int matriculas[]=new int[n];
        int amarilla=0,rosa=0,roja=0,verde=0,azul=0;
        for(int i=0;i<n;i++){
            System.out.println("Ingrese la matricula del vehiculo "+(i+1)+": ");
            matriculas[i]=leer.nextInt();
            switch (matriculas[i]%10) {
                case 1:
                case 2:
                    amarilla++;
                    break;
                case 3:
                case 4:
                    rosa++;
                    break;
                case 5:
                case 6:
                    roja++;
                    break;
                case 7:
                case 8:
                    verde++;
                    break;
                case 9:
                case 0:
                    azul++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("\n\n");
        System.out.println("Cantidad de autos con calcomanias de color amarrillo: "+amarilla);
        System.out.println("Cantidad de autos con calcomanias de color rosa: "+rosa);
        System.out.println("Cantidad de autos con calcomanias de color roja: "+roja);
        System.out.println("Cantidad de autos con calcomanias de color verde: "+verde);
        System.out.println("Cantidad de autos con calcomanias de color azul: "+azul);
    }
    
}
