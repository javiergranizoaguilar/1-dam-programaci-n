package tema2ejercicio14;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String texto;
        System.out.println("Ponga una frase");
        texto=teclado.next();
        int numero=(texto.length()/2);
        System.out.println("El texto que hay a la mitad es: " +texto.charAt(numero));
    }
    
}
