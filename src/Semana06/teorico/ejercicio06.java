package Semana06.teorico;

/**
 *
 * @author H´P
 */

interface Ipersisten{
    public void  save(Object o);
}

class person{
    private String name;
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name=name;
    }
}    
    
class dataMysql implements Ipersisten{
        
    @Override  
    public void save(Object o) {
        if(o instanceof person){
            System.out.println("La persona fue almacenada!!");
        }
    }       
}

class dataOracle implements Ipersisten{

    @Override
    public void save(Object o) {
        if(o instanceof person){
            System.out.println("La persona fue almacenada!!");
        }
    }
    
}

public class ejercicio06 {
    
}
