package tema2ejercicio15;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String clave,contrasena;
        System.out.println("Ponga una clave");
        clave=teclado.next();
        System.out.println("Confirme contrasena");
        contrasena=teclado.next();
        boolean resultado=clave.equals(contrasena);
        System.out.println(resultado);
    }
    
}
