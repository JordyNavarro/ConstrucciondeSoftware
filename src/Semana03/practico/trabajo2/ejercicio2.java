package Semana03.practico.trabajo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author H´P
 */

class numero{
    private int valor;
    
    public numero(int n){
        this.valor=n;
    }
    
    public int getvalor(){
        return this.valor;
    }
    
    public void setvalor(int n){
        this.valor=n;
    }
}

class Lista implements Iterable<numero>{
    
    List<numero>lista=new ArrayList<>();
    private int tope;
    
    Lista(){
        this.tope=100;
    }
    
    public int getTope(){
        return this.tope;
    }
    
    public void setTope(int i){
        this.tope=i;
    }
    
    public void add(numero n){
        if(tope>lista.size()){
            lista.add(n);
        }else{
            throw new RuntimeException("Esta lleno!!");
        }
    }
    
    public void mostrar(){
        for(numero e: lista){
            System.out.println(e.getvalor());
        }
    }
    
    @Override
    public Iterator<numero> iterator() {
        return lista.iterator();
    }
    
}

public class ejercicio2 {
    public static void main(String[] args) {
        Lista list= new Lista();
        while(true){
            if(list.getTope()>list.lista.size())
                list.add(new numero(aleatorio(1,100)));
            else break;
        }
        list.mostrar();
    }
    
    public static int aleatorio(int min,int max) {
        return (int)((max-min+1)*Math.random()+min);
    }
}
