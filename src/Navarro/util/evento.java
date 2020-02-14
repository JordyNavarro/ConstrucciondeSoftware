package Navarro.util;

/**
 *
 * @author H´P
 */
import Navarro.entidades.*;

public class evento {
    
    MisConstantes constantes= new MisConstantes();
    
    public void CostoIngreso(char C){
        for(Costo e: constantes.costos){
            if(e.getCodigo()==C){
                System.out.println("El costo de la entrada es: "+e.getCosto());
            }
        }
    } 
}


