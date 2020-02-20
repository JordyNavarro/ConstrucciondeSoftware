package Semana03.practico;

import java.util.Iterator;

/**
 *
 * @author H´P
 */

class numero{
    Number valor;
    public numero(Number n){
        this.valor=n;
    }
}

class operacion<t> implements Iterable<t>{
    
    t num1,num2;
    public operacion(t t1,t t2){
        this.num1=t1;
        this.num2=t2;
    }      
    
    public t suma(){
        Number x=Float.parseFloat(num1.toString());
        Number y=Float.parseFloat(num2.toString());
        Number suma=null;
        if(num1.getClass().equals(Integer.class)){
            suma=x.intValue()+y.intValue();
        }else if(num1.getClass().equals(Float.class)){
            suma=x.floatValue()+y.floatValue();
        } 
        return (t)suma;
    }
    
    public t resta(){
        Number x=Float.parseFloat(num1.toString());
        Number y=Float.parseFloat(num2.toString());
        Number resta=null;
        if(num1.getClass().equals(Integer.class)){
            resta=x.intValue()-y.intValue();
        }else if(num1.getClass().equals(Float.class)){
            resta=x.floatValue()-y.floatValue();
        } 
        return (t)resta;
    }

    
    @Override
    public Iterator<t> iterator(){
        return null;
    }
}

public class ejercicio02 {
    public static void main(String[] args) {
        operacion<Float>op= new operacion<>(5.2f,5f);
        operacion<Integer>op1= new operacion<>(4,7);
        System.out.println(op.suma());
        System.out.println(op.resta());
        System.out.println(op1.suma());
        System.out.println(op1.resta());
        
    }
}
