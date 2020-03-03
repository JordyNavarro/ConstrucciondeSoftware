package Semana06.teorico;

/**
 *
 * @author H´P
 */

interface Ipadre{
    abstract void c();
}

abstract class padre implements Ipadre{
    abstract void a();
    abstract void b();
}
 
class hija implements Ipadre{
    @Override
    public void c() {
        System.out.println("Exito!!");
    }
    
}

public class ejercicio03 {
    
}
