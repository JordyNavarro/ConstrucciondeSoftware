package Semana04.practico.actividad1;

/**
 *
 * @author H´P
 */
public class Alumno extends Persona{
    
    private int codigo;
    private int notas[];
    private float promedio;
    
    public Alumno(String nombre, String apellido, int dni,int codigo) {
        super(nombre, apellido, dni);
        this.codigo=codigo;
        this.notas=new int[4];
        this.promedio=0;
    }
    
    public float getPromedio(){
        int suma=0;
        for(int i=0;i<4;i++){
            suma+=notas[i];
        }
        promedio=(float)suma/4;
        return promedio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public boolean Aprobado(){
        if(this.getPromedio()>11){
            return true;
        }else
            return false;
    }
    
    public String Datos(){
        return "Alumno: "+this.getNombre()+" "+this.getApellido()+"\nDni: "+
            this.getDni()+"\nCodigo: "+this.getCodigo()+"\nPromedio: "+this.promedio+"\n";
    }
}
