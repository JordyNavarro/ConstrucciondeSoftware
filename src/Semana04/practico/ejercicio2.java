package Semana04.practico;

import java.util.ArrayList;

/**
 *
 * @author H´P
 */

class Disco{
    private String titulo;
    private String autor;
    private String genero;
    private int añoProduccion;

    public Disco(String titulo, String autor, String genero, int añoProduccion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero= genero;
        this.añoProduccion = añoProduccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nombre) {
        this.titulo = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setCanciones(String autor) {
        this.autor = autor;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoProduccion() {
        return añoProduccion;
    }

    public void setAñoProduccion(int añoProduccion) {
        this.añoProduccion = añoProduccion;
    }
    
    public String tostring(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nGenero: "+genero
                +"\nAño de produccion: "+añoProduccion+"\n";
    }
}

class ListaMultimedia{
    int tope;
    public ArrayList<Disco>listaDiscos= new ArrayList<>();

    public ListaMultimedia() {
        this.tope=20;
    }
    
    public void Agregar(Disco e){
        if(listaDiscos.size()<tope){
            listaDiscos.add(e);
        }else
            System.out.println("Lista llena.");
    }
    
    public void MostrarLista(){
        for(Disco e: listaDiscos){
            System.out.println(e.tostring());
        }
    }
    
}


public class ejercicio2 {
    public static void main(String[] args) {
        ListaMultimedia lista= new ListaMultimedia();
        Disco d1= new Disco(null, "Michael", "Pop", 2015);
        Disco d2= new Disco(null, "Pedro", "Rock", 2016);
        Disco d3= new Disco(null, "Deyvis", "Cumbia", 2008);
        lista.Agregar(d1);
        lista.Agregar(d2);
        lista.Agregar(d3);
        
        lista.MostrarLista();
    }
}
