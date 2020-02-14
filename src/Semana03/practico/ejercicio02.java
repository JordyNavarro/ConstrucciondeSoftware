package Semana03.practico;

import java.util.Iterator;

/**
 *
 * @author H´P
 */

class operacion<Object> implements Iterable<Object>{
    
    Object num1,num2;
    public operacion(Object t1,Object t2){
        super();
        this.num1=t1;
        this.num2=t2;
    }      
     
    public Object Sumar(){
        return (num1+num2);
    }
    
    @Override
    public Iterator<Object> iterator(){
        return null;
    }
    
    
}

public class ejercicio02 {
    
}
