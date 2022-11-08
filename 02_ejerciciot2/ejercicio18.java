package tema2ejercicio18;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Cuál es su correo?");
        String correo = new Scanner(System.in).nextLine();
        
        int posicion = correo.indexOf("@");
        
        String substract1 = correo.substring(0, posicion);
        String substract2 = correo.substring(posicion+1, correo.length());
        
        System.out.println("-Tu nombre de usuario es: "+substract1);
        System.out.println(".Tu dominio es: "+substract2);
    }
    
}
