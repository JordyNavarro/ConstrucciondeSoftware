package Navarro.util;

/**
 *
 * @author H´P
 */
import Navarro.entidades.*;
import java.util.ArrayList;

public class MisConstantes {
    
    public ArrayList<Costo>costos=new ArrayList<>();
    private float IGV;
    
    public MisConstantes(){
        costos.add(new Costo(01,'P',"Platinium",250));
        costos.add(new Costo(02,'G',"Gold",150));
        costos.add(new Costo(03,'V',"Vip",95));
        this.IGV=0;
    }    
}
