package Semana02.teorico;

/**
 *
 * @author H´P
 */
public class ejercicio10 {
    public static void main(String[] args) {
        numero num=new numero();
        incrementar(num);
        System.out.println(num.getx());
    }
    static void incrementar(numero a){
        a.setx(30);
    }
}

class numero{
    private int x=10;
    
    void setx(int n){
        this.x=n;
    }
    int getx(){
        return this.x;
    }
}
