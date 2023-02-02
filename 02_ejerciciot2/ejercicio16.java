package tema2.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("texto 1");
        String t1=new Scanner(System.in).nextLine();
    System.out.println("texto 2");
        String t2=new Scanner(System.in).nextLine();
        boolean t12 = t1.contains(t2);
    System.out.println("el texto 2 esta en el texto 1"+t12);
    }
    
}
