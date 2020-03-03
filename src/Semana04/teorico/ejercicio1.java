package Semana04.teorico;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */
class Disco{
    private String titulo;
    private String autor;
    
    public Disco(String titulo,String autor){
        this.autor=autor;
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String datosdisco(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\n";
    }
}

class Genero extends Disco{
    private String genero;
    
    public Genero(String titulo, String autor,String genero) {
        super(titulo, autor);
        this.genero=genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String datosgenero(){
        return this.datosdisco()+"Genero: "+this.genero+"\n";
    }
}

class Formato extends Genero{
    
    private String formato;
    
    public Formato(String titulo, String autor, String genero,String formato) {
        super(titulo, autor, genero);
        this.formato=formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public String datosformato(){
        return this.datosgenero()+"Formato: "+formato+"\n";
    }
}

class Valor extends Formato{
    
    private double valor;
    
    public Valor(String titulo, String autor, String genero, String formato,double valor) {
        super(titulo, autor, genero, formato);
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String tostring(){
        return this.datosformato()+"Valor: "+valor+"\n";
    }
    
}

class ListaMultimedia{
    int tope;
    public ArrayList<Valor>listaDiscos= new ArrayList<>();

    public ListaMultimedia()  {
        tope=20;
    }
    
    public void Agregar(Valor e){
        if(listaDiscos.size()<tope){
            listaDiscos.add(e);
        }else
            System.out.println("Lista llena.");
    }
    
    public void MostrarLista(){
        for(Valor e: listaDiscos){
            System.out.println(e.tostring());
        }
    }
}

public class ejercicio1 {
    public static void main(String[] args) {
        ListaMultimedia lista= new ListaMultimedia();
        Valor d1= new Valor("piri", "Pedro Suarez","Rock","mp3",20.5);
        Valor d2= new Valor("ff", "Michael Jackson","Pop","mp4",15);
        Valor d3= new Valor("gg", "Deyvis","Cumbia","mp3",10.5);
        
        Disco d=new Valor("xvideos", "Juan",null,null,0);
        lista.Agregar(d1);
        lista.Agregar(d2);
        lista.Agregar(d3);
        lista.Agregar((Valor) d);
        
        lista.MostrarLista();
    }
 
}
