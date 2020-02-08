package Semana01.practico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class Ejercicio01 {
    public static void main(String[] args) throws Exception{
        Scanner leer= new Scanner(System.in);
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int n1,n2;
        String nombre;
        saludo hola= new saludo();
        
        System.out.println("Ingrese su nombre: ");
        nombre= leer.next();
        hola.saludar(nombre);
        
        System.out.println("\nIngrese dos numeros:");
        n1=leer.nextInt();
        n2=leer.nextInt();
        System.out.println("La suma es: "+sumar(n1,n2));
        
        System.out.println("\nIngrese su nombre otra vez: ");
        nombre=bf.readLine();
        hola.saludar(nombre);
        
        System.out.println("\nIngrese dos numeros:");
        n1=Integer.parseInt(bf.readLine());
        n2=Integer.parseInt(bf.readLine());
        System.out.println("La suma es: "+sumar(n1,n2));
        
    }
    public static int sumar(int n1,int n2) {
        return n1+n2;
    }
}

class saludo{
    public void saludar(String name){
        System.out.println("Hola "+name);
    }
}

class buffer{
    
}