/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana03.practico.colecciones;
class WUR{
    
    String texto = null;
    String palabras[] = null;

    public WUR(String texto) {
        this.texto = texto;
        this.palabras = texto.split(" ");
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void contarTodas() {
        /*String palabras[] = this.texto.split(" ");//divide una cadena de texto en palabras
        String palabrasB[] = this.texto.split(" ");
*/      String palabrasRep[]=new String[palabras.length];
        String palabrasnorep[]=new String[palabras.length];
        int cantidad = palabras.length;
        int contador[]=new int[palabras.length];
        int cont1=0;
        int cont2=0;
        for (int i = 0; i < cantidad; i++) {
            
            contador[i]=0;
            String palabra = palabras[i];  

            for (int j =0; j < cantidad; j++) {
                if(i!=j)
                    if (palabra.equalsIgnoreCase(palabras[j])) { 
                        contador[i]++;
                    }    
            }
            if (contador[i] > 0) {
                palabrasRep[cont1]=palabra;
                cont1++;
            }else{
                palabrasnorep[cont2]=palabra;
                cont2++;
            }

        }
        System.out.println("Palabras repetidas");
        for(int i=0;i<palabrasRep.length;i++){

            if(palabrasRep[i]!=null)
                System.out.print(palabrasRep[i]+"\n");
        }
        System.out.println("Palabras no repetidas");
        for(int i=0;i<palabrasnorep.length;i++){   
            if(palabrasnorep[i]!=null)
                System.out.print(palabrasnorep[i]+"\n");
        }
    }

    public int contar_Repetidas(String palabra) {
        int contador = 0;
        for (int i = 0; i < this.palabras.length; i++) {
            if (this.palabras[i].equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}
public class ejercicio4 {
    public static void main(String[] args) {
        WUR w = new WUR("all all we need need is love love love");
        w.contarTodas();
    }
}
