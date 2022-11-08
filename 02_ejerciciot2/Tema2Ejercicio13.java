package tema.pkg2.ejercicio13;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String nombre;
        System.out.println("Escribe tu nombre:");
        nombre=teclado.next();
        System.out.println("Texto en mayuscula: " +nombre.toUpperCase());
        System.out.println("Texto en minuscula: " +nombre.toLowerCase());
        System.out.println("Su numero de caracteres es: " +nombre.length());
    }
    
}
