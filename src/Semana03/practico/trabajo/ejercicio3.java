package Semana03.practico.trabajo;

/**
 *
 * @author H´P
 */

class Socio{
    private String nombre;
    private int antiguedad;
    
    public Socio(String nombre,int antiguedad){
        this.nombre=nombre;
        this.antiguedad=antiguedad;
    }
    
    public float retornarAntiguedad(){
        return this.antiguedad;
    }
    
    public String Datos(){
        return "Nombre: "+nombre+"  Antiguedad: "+antiguedad;       
    }
}

class Club{
    Socio socios[]=new Socio[3];
    
    public Club(){
        socios[0]=new Socio("Jose",8);
        socios[1]=new Socio("Pedro",15);
        socios[2]=new Socio("Miguel",12);
    }
    public void SocioAntiguo(){
        Socio ant=this.socios[0];
        for(int i=0;i<3;i++){
            if(socios[i].retornarAntiguedad()>ant.retornarAntiguedad()){
                ant=socios[i];
            }
        }
        System.out.println("El socio con mayor antiguedad es: "+ant.Datos());
    }
}

public class ejercicio3 {
    public static void main(String[] args) {
        Club club= new  Club();
        club.SocioAntiguo();
    }
}
