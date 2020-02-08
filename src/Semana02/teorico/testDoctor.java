package Semana02.teorico;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */
public class testDoctor {
    
    
    public static void main(String[] args) {
        ArrayList<Doctor>Listadoctor = new ArrayList<>();
        Listadoctor.add(new Doctor(1,"Juan"));
        Listadoctor.add(new Doctor(2,"Maria"));
        Listadoctor.add(new Doctor(3,"Luis"));
        Listadoctor.add(new Doctor(4,"Oscar"));
        
        Listadoctor.forEach((e) -> {
            System.out.println(e.tostring());
        });
    }
}
