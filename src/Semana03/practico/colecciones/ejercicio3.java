/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.practico.colecciones;

/**
Crear la clase CuentaW que en el constructor tome como argumento una cadena de
caracteres y sea capaz de mantener información sobre el número de letras y palabras que hay en
dicha cadena, así como el número de veces que aparece cada signo (sin diferenciar mayúsculas
de minúsculas). Crear los métodos necesarios para poder consultar esa información. Crear una
clase que prueba a la anterior con varios ejemplos. 
 */
class CuentaW{
   private String cadena;
    
    public CuentaW(String cadena){
        this.cadena = cadena;
    }
    
    public void setCadena(String cadena){
        this.cadena = cadena;
    }
    
    private boolean letrasMinus(char i){
        for(char c = 'a';c<='z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
    private boolean letrasMayus(char i){
        for(char c = 'A';c<='Z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
   public int NumLetras(){
        int contLetras = 0;
        String caracter = "";
        for(int i=0;i<cadena.length();i++)            
            if(letrasMayus(cadena.charAt(i)) || letrasMinus(cadena.charAt(i)))
                contLetras++;        
        return contLetras;
    }
                
    public int NumPalabras(){
        int contPalabras=1;
       
        int i=0;
        while(i < cadena.length()){
            if(Character.isLetter(cadena.charAt(i))||Character.isDigit(cadena.charAt(i))){
                
            }else{
                for(int j=i;j<cadena.length()-1;j++){
                    i++;
                    if(Character.isLetter(cadena.charAt(i))||Character.isDigit(cadena.charAt(i))){
                        contPalabras++;
                        break;
                    }
                        
                }
            }
            i++;
            
                /*if(letrasMayus(cadena.charAt(i)) || letrasMinus(cadena.charAt(i)))                
                    if(!letrasMayus(cadena.charAt(i)) && !letrasMinus(cadena.charAt(i)))
                        contPalabras++;*/
                       
        }            
        return contPalabras;
    }     
}
public class ejercicio3 {
    public static void main(String[] args) {
        CuentaW c = new CuentaW("jordy navarro");
        System.out.println("Numero de letras que hay : "+c.NumLetras());
        System.out.println("Numero de palabras que hay : "+c.NumPalabras());
    }
}
