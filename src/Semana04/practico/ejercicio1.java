package Semana04.practico;

/**
 *
 * @author H´P
 */

class Humano{
    private String nombre;
    private String apellido;
    
    public Humano(String nombre,String apellido){
        this.nombre= nombre;
        this.apellido= apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String nombrecopleto(){
        return this.nombre+" "+this.apellido;
    }
}

class Alumno extends Humano{
    
    private int codigo;
    
    public Alumno(String nombre,String apellido,int codigo){
        super(nombre,apellido);
        this.codigo=codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String datos(){
        return this.nombrecopleto()+"\nCodigo: "+this.codigo;
    }
}

public class ejercicio1 {
    public static void main(String[] args) {
        Alumno a1=new Alumno("Juan","Perez",784851);
        System.out.println(a1.datos());
    }
}
