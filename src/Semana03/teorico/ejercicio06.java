package Semana03.teorico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author H´P
 */

class bolsa implements Iterable{
    ArrayList<Object>lista= new ArrayList<>();
    int tope;
    
    public bolsa(int tope){
        this.tope=tope;
    }
    
    public void add(Object objeto){
        if(lista.size()<=tope){
            lista.add(objeto);            
        }else{
            
        }
    }
    
    @Override
    public Iterator iterator(){
        return null;
    }
}

public class ejercicio06 {
    
}
