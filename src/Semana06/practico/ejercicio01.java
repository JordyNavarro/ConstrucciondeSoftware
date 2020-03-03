package Semana06.practico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author H´P
 */

class Persona{
    private String nombre;
    private double sueldo;
    
    public Persona(String nombre,double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String datos(){
        return "Nombre: "+nombre+"\nSueldo: "+sueldo+"\n\n";
    }
}

class Padron{
    List<Persona>lista= new ArrayList<>();
    
}

abstract class Impresion{
    Padron padron= new Padron();
    abstract void imprimir();
}

class tinta extends Impresion{
    @Override
    void imprimir() {
        for(Persona e: padron.lista){
            System.out.println(e.datos());
        }
    }
    
}

public class ejercicio01 {
    
}
