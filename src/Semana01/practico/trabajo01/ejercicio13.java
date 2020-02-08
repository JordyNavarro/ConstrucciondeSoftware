package Semana01.practico.trabajo01;

/**
 *
 * @author H´P
 */
public class ejercicio13 {
    public static void main(String[] args) {
        int cant=0;
        float preprobados;
        int notas[]= new int[50];
        System.out.println("Notas:\n");
        for(int i=0;i<50;i++){
            notas[i]=aleatorio(10,100);
            System.out.println(notas[i]);
            if(notas[i]<70){
                cant++;
            }
        }
        preprobados=(float)(cant*100/50);
        System.out.println("\nPorcentaje de reprobados: "+preprobados);
    }
    public static int aleatorio(int min,int max) {
        return (int)((max-min+1)*Math.random()+min);
    }
}
