/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana07.trabajo;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */
public class Registro {
    
    ArrayList<Trabajador>trabajadores=new ArrayList<>();
    
    public void addTrabajador(Trabajador e){
        trabajadores.add(e);
    }
}
