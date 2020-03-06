package Semana07.trabajo;

/**
 *
 * @author H´P
 */
public class Trabajador extends Persona{
    
    private String puesto;
    private float sueldo;
    
    
    public Trabajador(String nombre, String apellido, int dni,String puesto,float sueldo) {
        super(nombre, apellido, dni);
        this.puesto=puesto;
        this.sueldo=sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public String datosTrabajador(){
        return super.Datos()+"\t"+puesto+"\t"+sueldo+"\n";
    }
}
