package Semana01.practico.trabajo01;

import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner leer= new  Scanner(System.in);
        int n,alumnos,materias;
        float promgrupos,sumamaterias,sumaalumno,sumagrupo=0,suma;
        System.out.println("Ingrese el numero de grupos que existe: ");
        n=leer.nextInt();
        grupo grupos[]= new grupo[n];
        for(int i=0;i<n;i++){
            System.out.println("Ingrese cuantos alumnos hay en el grupo "+(i+1)+": ");
            alumnos=leer.nextInt();
            grupos[i]=new grupo(alumnos);
            sumaalumno=0;
            for(int j=0;j<alumnos;j++){
                System.out.println("Ingrese cuantas materias tiene el alumno "+(j+1)+": ");
                materias=leer.nextInt();
                grupos[i].alumnos[j]=new Alumno(materias);
                //sumamaterias=0;
                for(int k=0;k<materias;k++){
                    System.out.println("Ingrese las notas de la materia "+(k+1)+": ");
                    suma=0;
                    grupos[i].alumnos[j].materias[k]=new materia();
                    for(int l=0;l<3;l++){
                        System.out.println("Nota "+(l+1)+": ");
                        grupos[i].alumnos[j].materias[k].notas[l]=leer.nextInt();
                    }
                    //grupos[i].alumnos[j].materias[k].promedio=suma/3;
                    //sumamaterias+=grupos[i].alumnos[j].materias[k].promedio;
                }
                //grupos[i].alumnos[j].promedio=(float)sumamaterias/materias;
                //sumaalumno+=grupos[i].alumnos[j].promedio;
            }
            //grupos[i].promedio=(float)sumaalumno/alumnos;
            //sumagrupo+=grupos[i].promedio;
        }
        //promgrupos=(float)sumagrupo/n;
        for (int i = 0; i< grupos.length; i++) {
            for (int j = 0; j < grupos[i].alumnos.length; j++) {
                for (int k = 0; k < grupos[i].alumnos[j].materias.length; k++) {
                    System.out.println("El promedio de notas de la materia "+(k+1)+" del alumno "+(j+1)+" del grupo "+(i+1)+" es: "+grupos[i].alumnos[j].calcularPromedioAlumno());
                }
                System.out.println("El promedio total de las materias del alumno"+(j+1)+" es: "+grupos[i].alumnos[j].calcularPromedioAlumno());
                
            }
            System.out.println("El promedio total del grupo "+(i+1)+" es: "+grupos[i].calcularPromedioGrupo());
        }
        
    }
}

class grupo{
    Alumno alumnos[];
    float promedio;
    grupo(int n){
        alumnos=new Alumno[n];
    }
    float calcularPromedioGrupo(){
        int acu=0;
        for (int i = 0; i < alumnos.length; i++) {
            acu+=(int)alumnos[i].calcularPromedioAlumno();
        }
        promedio=acu/alumnos.length;
        return promedio;
    }
}

class Alumno{
    materia materias[];
    float promedio;
    Alumno(int n){
        materias= new materia[n];
    }
    float calcularPromedioAlumno(){
        float acu=0;
        for (int i = 0; i <materias.length; i++) {
            acu+=materias[i].calcularPromedioMateria();
        }
        promedio=acu/materias.length;
        return promedio;
    }
}

class materia{
    int notas[];
    float promedio;
    
    materia(){
        notas=new int[3];
    }
    float calcularPromedioMateria(){
        int acu=0;
        for (int i = 0; i < 3; i++) {
            acu+=notas[i];
        }
        promedio=acu/3;
        return promedio;
    }
    
    
}