package Semana04.practico.actividad1;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */
public class Academia {
    private String nombre;
    public ArrayList<Curso>cursos=new ArrayList<>();
    
    public Academia(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void DatosCurso(String nombre){
        for(Curso e: cursos){
            if(e.getNombre().equals(nombre)){
                e.DatosCurso();
            }
        }
    }
}
