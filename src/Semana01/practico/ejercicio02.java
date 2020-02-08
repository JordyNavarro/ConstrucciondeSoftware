package Semana01.practico;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        /*int n,suma=0;
        System.out.println("Ingrese un numero: ");
        n= leer.nextInt();
        while(n>0){
            suma+=n%10;
            n/=10;     
        }
        System.out.println("La suma de los digitos es:  "+suma);
    */
       
        
        
    //1    
        int cant,metros,centimetros,decimetros,milimetros;
        System.out.println("Ingrese una cantidad en minlimetros: ");
        cant= leer.nextInt();
        metros=cant/1000;
        cant=cant%1000;
        decimetros=cant/100;
        cant=cant%100;
        centimetros=cant/10;
        cant=cant%10;
        milimetros=cant;
        System.out.println("metros: "+metros+"\ndecimetros: "+decimetros+
                "\ncentimetros: "+centimetros+"\nmilimetros: "+milimetros);
        
        
        
    //2
   
        double a,b,c,d;
        System.out.println("\n\nIngrese el valor de a: ");
        a=leer.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b=leer.nextInt();
        c=((4*pow(a,2))+(3*b*a)+pow(b,2))/(pow(a,2)-pow(b,2));
        System.out.println("c= "+c);
        
        d=(3*pow(c,2)+a+b)/4;
        System.out.println("d= "+d);
        
        
   
   // 3
        int n1,n2,n3,n4,suma;
        float p1,p2,p3,p4;
        System.out.println("\n\nIngrese 4 numeros: ");
        n1=leer.nextInt();
        n2=leer.nextInt();
        n3=leer.nextInt();
        n4=leer.nextInt();
        suma=n1+n2+n3+n4;
        System.out.println("suma: "+suma+"\n");
        p1=(float)(n1*100)/suma; 
        System.out.println(n1+" es el "+p1+"%"+" de "+suma+"\n");
        p2=(float)(n2*100)/suma; 
        System.out.println(n2+" es el "+p2+"%"+" de "+suma+"\n");
        p3=(float)(n3*100)/suma; 
        System.out.println(n3+" es el "+p3+"%"+" de "+suma+"\n");
        p4=(float)(n4*100)/suma; 
        System.out.println(n4+" es el "+p4+"%"+" de "+suma+"\n");
        
        
        
       //4
        int horas,minutos,segundos;
        System.out.println("\nIngrese un numero de horas: ");
        horas=leer.nextInt();
        minutos=horas*60;
        segundos=minutos*60;
        System.out.println("horas: "+horas+"\nminutos: "+minutos+"\nsegundos: "+segundos);
        
        
        
        //5
        int n;
        
        float gradosf,gradosc;
        do{
            System.out.println("\n\n1. Convretir a grados fahrenheit\n2. Convertir a grados celsius\n3. Salir");
            n=leer.nextInt();
            if(n==1){
                System.out.println("\nIngrese la cantidad de grados celsius: ");
                gradosc=leer.nextInt();
                gradosf=(gradosc*(float)(9.0/5.0)+32);
                System.out.println("\nGrados fahrenheit: "+gradosf);
            }else if(n==2){
                System.out.println("\nIngrese la cantidad de grados fahrenheit: ");
                gradosf=leer.nextInt();
                gradosc=(gradosf-32)*(float)(5.0/9.0);
                System.out.println("\nGrados celsius: "+gradosc);
            }
        }while(n!=3);
    }
    
    
    
}