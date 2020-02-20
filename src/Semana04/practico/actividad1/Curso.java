package Semana04.practico.actividad1;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */
public class Curso {
    private String nombre;
    private String codCurso;
    public Profesor profesor;
    public ArrayList<Alumno>alumnos= new ArrayList<>();

    public Curso(String nombre, String codCurso, Profesor profesor) {
        this.nombre = nombre;
        this.codCurso = codCurso;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public String DatosAlumno(int i){
        return alumnos.get(i).Datos();
    }
    
    public void DatosCurso(){
        for(Alumno e: alumnos){
            System.out.println(e.Datos());
        }
    }
}
