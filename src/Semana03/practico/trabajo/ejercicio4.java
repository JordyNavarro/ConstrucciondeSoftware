package Semana03.practico.trabajo;

/**
 *
 * @author H´P
 */

class Figura{
    private String nombre;
    private int lados;
    
    public Figura(String nombre,int lados){
        this.nombre=nombre;
        this.lados=lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
}

class nodo{
    Figura figura;
    nodo siguiente;
    nodo anterior;

    nodo(Figura figura){
        this.figura=figura;
        this.anterior=null;
        this.siguiente=null;
    }   
}

public class ejercicio4 {
    nodo ultimo;
    nodo primero;
    
    ejercicio4(){
        ultimo=primero=null;
    }
    
    
    public void Agregar(Figura f){
        nodo newnodo=new nodo(f);
        if(ultimo==null){
            primero=ultimo=newnodo;
        }else{
            ultimo.siguiente=newnodo;
            newnodo.anterior=ultimo;
            ultimo=newnodo;
        }
    }
    
     void mostrarcola(){
        nodo temp=primero;
        while(temp!=null){
            System.out.println(temp.figura.getNombre());
            temp=temp.siguiente;
        }
    }
    void mostrarpila(){
        nodo temp=ultimo;
        while(temp!=null){
            System.out.println(temp.figura.getNombre());
            temp=temp.anterior;
        }
    }
}

class main{
    public static void main(String[] args) {
        ejercicio4 ejem= new ejercicio4();
        ejem.Agregar(new Figura("cuadrado",4));
        ejem.Agregar(new Figura("triangulo",3));
        ejem.Agregar(new Figura("rombo",4));
        ejem.Agregar(new Figura("pentagono",5));
        ejem.Agregar(new Figura("octagono",8));
        ejem.Agregar(new Figura("circulo",0));
        
       // ejem.mostrarcola();
        ejem.mostrarpila();
    }
}