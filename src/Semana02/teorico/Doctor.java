package Semana02.teorico;

/**
 *
 * @author H´P
 */
public class Doctor {
    private int id;
    private String name;
    
    Doctor(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public String tostring(){
        return "Id: "+id+"\tNombre: "+name;
    }
}
