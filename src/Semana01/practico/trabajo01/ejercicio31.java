package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio31 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String nombre;
        int op,op2,personas=0,primaria=0,secundaria=0,carreratecnica=0,profesionales=0,posgrado=0;
        do{
            System.out.println("1. Encuestar\n2. Salir");
            op=leer.nextInt();
            if(op==1){
                System.out.println("Nombre: ");
                nombre=leer.next();
                do{
                    System.out.println("Estudios:\n1.Primaria\n2.Secundaria\n3.Carrera Tecnica\n4.Estudios Profesionales\n5.Estudios de Posgrado");
                    op2=leer.nextInt();
                    switch(op){
                        case 1:
                            primaria++;
                            break;
                        case 2:
                            secundaria++;
                            break;
                        case 3:
                            carreratecnica++;
                            break;
                        case 4:
                            profesionales++;
                            break;
                        case 5:
                            posgrado++;
                            break;
                            
                    }
                }while(op2!=1&&op2!=2&&op2!=3&&op2!=4&&op2!=5);
                personas++;
            }
            if(op==2)
                break;
        }while(true);
        System.out.println("\nPorcentaje de personas con estudios en primaria: "+(float)(primaria*100/personas));
        System.out.println("\nPorcentaje de personas con estudios en secundaria: "+(float)(secundaria*100/personas));
        System.out.println("\nPorcentaje de personas con estudios en carrera tecnica: "+(float)(carreratecnica*100/personas));
        System.out.println("\nPorcentaje de personas con estudios profesionales: "+(float)(profesionales*100/personas));
        System.out.println("\nPorcentaje de personas con estudios en posgrado: "+(float)(posgrado*100/personas));
    }
}
