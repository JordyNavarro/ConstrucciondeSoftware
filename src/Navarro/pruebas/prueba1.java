package Navarro.pruebas;

import Navarro.util.evento;
import java.util.Scanner;

/**
 *
 * @author H´P
 */
public class prueba1 {
    public static void main(String[] args) {
        evento evt= new evento();
        Scanner leer= new Scanner(System.in);
        String  s;
        char c;
        System.out.println("Ingrese el codigo para saber el precio: ");
        s=leer.next();
        c=s.charAt(0);
        evt.CostoIngreso(c);
    
    }
}
