package Semana02.practico;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio01 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Suma sumar=new Suma();
        Multiplicacion multiplicar= new Multiplicacion();
        Division dividir =new Division();
        int x,y,op;
        do{
           System.out.println("\n1.Sumar\n2.Multiplicar\n3.dividir\n4.Salir"); 
           op=leer.nextInt();
           if(op==1){
               System.out.println("Ingrese dos numeros:");
               x=leer.nextInt();
               y=leer.nextInt();
               sumar.asignar(x, y);
               System.out.println("La suma es: "+sumar.calcular());
           }
           if(op==2){
               System.out.println("\nIngrese dos numeros:");
               x=leer.nextInt(); 
               y=leer.nextInt();
               multiplicar.asignar(x, y);
               System.out.println("La multiplicacion es: "+multiplicar.calcular());              
           }
           if(op==3){
                System.out.println("\nIngrese dos numeros:");
                x=leer.nextInt();
                y=leer.nextInt();
                dividir.asignar(x, y);
                if(y>0)
                    System.out.println("La division es: "+dividir.calcular());
                else System.out.println(dividir.calcular());
            }
            if(op==4){
                break;
            }
        }while(true);

    }
}

class Suma{
    private int x;
    private int y;
    
    void asignar(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public int  calcular(){
        return (x+y);
    }
}

class Multiplicacion{
    private int x;
    private int y;
    
    void asignar(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public int  calcular(){
        return (x*y);
    }
}

class Division{
    private float x;
    private float y;
    
    void asignar(float x,float y){
        this.x=x;
        this.y=y;
    }
    
    public String  calcular(){
        String a;
        if(y==0){
            a="No se puede dividir";
        }else
            a=""+(x/y);
        return a;
    }
}