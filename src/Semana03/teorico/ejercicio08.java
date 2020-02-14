package Semana03.teorico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author H´P
 */

class bag <t> implements Iterable<t>{
    ArrayList<t>lista= new ArrayList<>();
    int tope;
    
    bag(int x){
        this.tope=x;
    }
    
    @Override
    public Iterator iterator(){
        return null;
    }
}

public class ejercicio08 {
    
}
