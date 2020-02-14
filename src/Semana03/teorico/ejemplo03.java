package Semana03.teorico;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */

class Persona{
    private int x,y;
    
    public Persona(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public Persona(){
        this.x=0;
        this.y=0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}

public class ejemplo03 {
    public static void main(String[] args) {
        ArrayList<Persona>personas= new ArrayList<>();
        Persona p1=new Persona();
        p1.setX(5);
        p1.setY(6);
        personas.add(new Persona(5,7));
    }
}
