package Semana03.practico;

/**
 *
 * @author H´P
 */

class Alumno{
    
    private String nombre;
    private int edad;
    
    public Alumno(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public void MostrarNombre(){
        System.out.println("El nombre del alumno es: "+this.nombre);
    }
    
    public void MostrarEdad(){
        System.out.println("\nLa edad es: "+this.edad);
        if(this.edad>=18){
            System.out.println("Es mayor de edad");
        }else System.out.println("No es mayor de edad");
    }
}


public class ejercicio01 {
    public static void main(String[] args) {
        Alumno alumno= new Alumno("Luis", 25);
        alumno.MostrarNombre();
        alumno.MostrarEdad();
    }
}
