package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float X=7400000,Y=360000,interes,interestotal=0,pagomensual,pagototal=0,temp=0;
        double I=0.01;
        int mes=1,cont=0;
        while(X>temp){
            temp+=Y;
            cont++;
        }
        System.out.println("El numero de pagos necesarios es: "+cont);
        while(X>0){
            if(X>Y){
                interes=(float)I*X;
                interestotal+=interes;
                pagomensual=Y+interes;
                pagototal+=pagomensual;
                X-=Y;
                System.out.println("\n\nEl interes aplicado el mes "+mes+" es: "+interes);
                System.out.println("\nEl pago total del mes es: "+pagomensual);
                System.out.println("\nEl interes acumulado es: "+interestotal);
                System.out.println("\nMonto restante por devolver: "+X);
                mes++;
            }else{
                interes=(float)I*X;
                interestotal+=interes;
                pagomensual=X+interes;
                pagototal+=pagomensual;
                X=0;
                System.out.println("\n\nEl interes aplicado el mes "+mes+" es: "+interes);
                System.out.println("\nEl pago total del mes es: "+pagomensual);
                System.out.println("\nEl interes acumulado es: "+interestotal);
                System.out.println("\nMonto restante por devolver: "+X);
                mes++;
            }
            System.out.println("\n\nEl pago total es: "+pagototal);
        }
        
    }
}
