package Semana01.practico.trabajo01;

/**
 *
 * @author H´P
 */
public class ejercicio42 {
    public static void main(String[] args) {
        int voto,cont1=0,cont2=0,cont3=0;
        for(int i=0;i<250000;i++){
            voto=aleatorio(1,3);
            if(voto==1)
                cont1++;
            if(voto==2)
                cont2++;
            if(voto==3){
                cont3++;
            }
        }
        System.out.println("\nCandidato 1: "+cont1+" votos\n");
        System.out.println("\nCandidato 2: "+cont2+" votos\n");
        System.out.println("\nCandidato 3: "+cont3+" votos\n");
        if(cont1>cont2&&cont1>cont3)
            System.out.println("El gandor es el candidato 1 con "+cont1+" votos."); 
        else if(cont2>cont1&&cont2>cont3)
            System.out.println("El gandor es el candidato 2 con "+cont2+" votos.");        
        else System.out.println("El gandor es el candidato 3 con "+cont3+" votos.");
       
    }
    
    public static int aleatorio(int min,int max) {
        return (int)((max-min+1)*Math.random()+min);
    }
}
