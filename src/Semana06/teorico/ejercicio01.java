package Semana06.teorico;

/**
 *
 * @author H´P
 */

class animal{    
    void correr(){
        
    }     
}

class tortuga extends animal{
    @Override
    void correr(){
        throw new RuntimeException("La tortuga no puede correr");
    }
}
public class ejercicio01 {
    
}
