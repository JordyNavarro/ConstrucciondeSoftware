package Semana03.practico.trabajo;

/**
 *
 * @author H´P
 */

class dado{
    
    private int valor;
    
    public void tirar(){
        this.valor=aleatorio(1,6);
    }
    
    public void imprimir(int i){
        System.out.println("Valor "+i+": "+this.valor);
    }
    
    public int retornarValor(){
        return this.valor;
    }
    
    int aleatorio(int min,int max){
        return (int)((max-min+1)*Math.random()+min);
    }
}

class JuegoDados{
    private dado dados[]=new dado[3];
    
    public JuegoDados(){
        dados[0]=new dado();
        dados[1]=new dado();
        dados[2]=new dado();
    }
    
    public void jugar(){
        for(int i=0;i<3;i++){
            this.dados[i].tirar();
            this.dados[i].imprimir(i+1);
        }
        if(dados[0].retornarValor()==dados[1].retornarValor()&&dados[0].retornarValor()==dados[2].retornarValor()){
            System.out.println("\nGano");
        }else{
            System.out.println("\nPerdio");
        }
    }
}

public class ejercicio1 {
    public static void main(String[] args) {
        JuegoDados juego=new JuegoDados();
        juego.jugar();
    }
}
