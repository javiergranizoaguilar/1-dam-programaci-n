package ejercicio06.string;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio06String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] linea1={"Hola ", "Caballo ", "Casa "};
        String[] linea2={"teclado ", "cuadro ", "coche"};
        String linea01=(linea1[0]+linea1[1]+linea1[2]);
        String linea02=(linea2[0]+linea2[1]+linea2[2]);
        String resultado=(linea01+linea02);
        System.out.println(resultado);
    }
    
}
