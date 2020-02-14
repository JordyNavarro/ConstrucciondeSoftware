package Semana03.practico.trabajo;

/**
 *
 * @author H´P
 */

class Cliente{
    private String nombre;
    private float monto;
    
    public Cliente(String nombre){
        this.nombre=nombre;
        this.monto=0;
    }
    
    public void Depositar(float monto){
        this.monto+=monto;
    }
    
    public void Extraer(float monto){
        this.monto-=monto;
    }
    
    public float retornarMonto(){
        return this.monto;
    }
    
    public void Datos(){
        System.out.println("Nombre: "+nombre+" monto: "+monto);
    }
}

class Banco{
    
    private Cliente cliente1,cliente2,cliente3;
    
    public Banco(){
        cliente1=new Cliente("Juan");
        cliente2=new Cliente("Angela");
        cliente3=new Cliente("Luis");
    }
    
    public void operar(){
        cliente1.Depositar(100);
        cliente2.Depositar(500);
        cliente3.Depositar(1000);
        cliente3.Extraer(500);
    }
    
    public void DepositosTotales(){
        float suma=cliente1.retornarMonto()+cliente2.retornarMonto()+cliente3.retornarMonto();
        System.out.println("El monto del banco es: "+suma);
        cliente1.Datos();
        cliente2.Datos();
        cliente3.Datos();
    }
}

public class ejercicio2 {
    public static void main(String[] args) {
        Banco banco=new Banco();
        banco.operar();
        banco.DepositosTotales();
    }
}
