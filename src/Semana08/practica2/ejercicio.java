/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana08.practica2;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */

class Persona{
    String nombre;
    int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
}

class Alumno extends Persona{
    int codido;
    public Alumno(String nombre, int dni) {
        super(nombre, dni);
    }
    
}
class clase{
    ArrayList<Alumno>alumnos= new ArrayList<>();
    
    void agregaralum(Alumno e){
        alumnos.add(e);
    }
}
public class ejercicio {
    public static void main(String[] args) {
        Persona p=new Alumno("", 0);
    }
}