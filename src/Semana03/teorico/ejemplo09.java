package Semana03.teorico;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author H´P
 */

class Worker{
    private String codigo;
    private String nombre;
    private String areaLaboral;
    private double sueldo;
    private int hextras;
    private String afiliacion;
    DecimalFormat df= new DecimalFormat("#.##");

    public Worker(String codigo, String nombre, String areaLaboral, double sueldo, int hextras, String afiliacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.hextras = hextras;
        this.afiliacion = afiliacion;
    }
    
    public String getAreaLaboral(){
        return this.areaLaboral;
    }
    
    public String getNombre(){
        return this.nombre;
    }
   
    public double montoExtra(){
        return this.sueldo*this.hextras/240;
    }
    
    public double montoseguro(){
        if(this.afiliacion.equals("AFP")){
            return this.sueldo*0.17;
        }else{
            return this.sueldo*0.05;
        }
    }   
    
    public double montoessalud(){
        return this.sueldo*0.03; 
    }
    
    public double montodescuento(){
        return this.montoessalud()+this.montoseguro();
    }
    
    public double sueldobruto(){
        return this.sueldo+this.montoExtra();
    }
    
    public double sueldoneto(){
        return this.sueldobruto()-this.montodescuento();
    }
    
    public String tostring(){
        return "Codigo: "+codigo+"\nNombre: "+nombre+"\nArea Laboral: "+
            areaLaboral+"\nSueldo: "+sueldo+"\nHoras extra: "+hextras+"\nAfiliacion: "+
            afiliacion+"\nMonto H.extras: "+df.format(montoExtra())+"\nMonto seguro: "+
            df.format(montoseguro())+"\nMonto ESSALUD: "+df.format(montoessalud())+
            "\nMonto descuento: "+df.format(montodescuento())+"\nSueldo bruto: "+
            df.format(sueldobruto())+"\nSueldo neto: "+df.format(sueldoneto())+"\n\n";
    }
    
}

class Person implements Iterable<Worker>{
    ArrayList<Worker>lista= new ArrayList<>();
    
    void add(Worker p1){
        lista.add(p1);
    }
    String NombreEmpSueldo(){
        String cad="";
        double sueldotemp=0.0;
        for(Worker w:lista){
            if(w.sueldoneto()>=sueldotemp){
                sueldotemp=w.sueldoneto();
            }
        }
        for(Worker w:lista){
            if(w.sueldoneto()==sueldotemp){
                cad+=w.getNombre()+" ";
            }
        }
        return cad;
    }
    double sueldoNetoAreas(String area){
        double acu=0;
        for(Worker w:lista){
            if(w.getAreaLaboral()==area){
                acu+=w.sueldoneto();
            }
        }
        return acu;
    }
   
    @Override
    public Iterator<Worker> iterator() {
        return lista.iterator();    
    }
 
}


public class ejemplo09 {
    public static void main(String[] args) {  
        DecimalFormat dt=new DecimalFormat("#.##");
        String laboral[]={"Sistemas","Administracion","Marketing"};
        String afi[]={"AFP","SNP"};
        Person listapersona=new Person();
        Worker w1=new Worker("1","Jose",laboral[aleatorio(0,2)],1500.0,10,afi[aleatorio(0,1)]);
        Worker w2=new Worker("2","Mario",laboral[aleatorio(0,2)],2000.0,10,afi[aleatorio(0,1)]);
        Worker w3=new Worker("3","Antonio",laboral[aleatorio(0,2)],2500.0,10,afi[aleatorio(0,1)]);
        Worker w4=new Worker("4","Miguel",laboral[aleatorio(0,2)],3000.0,10,afi[aleatorio(0,1)]);
        Worker w5=new Worker("4","Pablo",laboral[aleatorio(0,2)],1800.0,10,afi[aleatorio(0,1)]);
        listapersona.add(w1);
        listapersona.add(w2);
        listapersona.add(w3);
        listapersona.add(w4);
        listapersona.add(w5);
        for(Worker w:listapersona){
            System.out.println(w.tostring());
        }  
        System.out.println("A- Empleado que tiene mayor sueldo NETO: "+listapersona.NombreEmpSueldo());
        System.out.println("B- Sueldo neto de marketing: "+dt.format(listapersona.sueldoNetoAreas("Administracion")));
    }
    static int aleatorio(int min,int max){
        return (int)((Math.random()*(max-min))+min);
    }
}
