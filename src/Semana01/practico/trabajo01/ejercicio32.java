package Semana01.practico.trabajo01;

/**
 *
 * @author H´P
 */
public class ejercicio32 {
    public static void main(String[] args) {
        int contnorte=0,contsur=0,contcentro=0;
        int cantpersonas=aleatorio(2000,5000);
        String zona[]={"Norte","Sur","Centro"};
        for(int i=0;i<cantpersonas;i++){
            String cad=zona[aleatorio(0,2)];
            if("Norte".equals(cad))
                contnorte++;  
            if("Sur".equals(cad))
                contsur++;
            if("Centro".equals(cad))    
                contcentro++;
        }
        
        System.out.println("Cantidad de personas de norte: "+contnorte);
        System.out.println("Cantidad de personas de Sur: "+contsur);
        System.out.println("Cantidad de personas de Centro: "+contcentro);
        int may=0;
        String mayor="";
        if(contnorte>may){
            may=contnorte;
            mayor=zona[0];
        }           
        if(contsur>may){
            may=contsur;
            mayor=zona[1];
        }     
        if(contcentro>may){
            may=contcentro;
            mayor=zona[2];
        } 
        System.out.println("\nSeccion con mas votantes: "+mayor+" con "+may+" votantes");
    }
    
    static int aleatorio(int min,int max){
        return (int)((max-min+1)*Math.random()+min);
    }
}
