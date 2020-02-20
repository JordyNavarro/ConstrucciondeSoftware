package Semana04.practico.actividad1;

/**
 *
 * @author H´P
 */
public class Profesor extends Persona{
    
    private int codigo;
    private String grado;
    
    public Profesor(String nombre, String apellido, int dni,int codigo,String grado) {
        super(nombre, apellido, dni);
        this.codigo=codigo;
        this.grado=grado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public String Datos(){
        return "Alumno: "+this.getNombre()+" "+this.getApellido()+"\nDni: "+
            this.getDni()+"\nCodigo: "+this.codigo+"\nGrado: "+this.grado+"\n";
    }
}
