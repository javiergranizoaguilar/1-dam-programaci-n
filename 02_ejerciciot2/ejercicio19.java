package tema2ejercicio19;

import java.util.Scanner;
import java.io.File;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dime la ruta");
    String a=new Scanner(System.in).nextLine(); 
    File b=new File(a);
    double c=b.length();
    System.out.println((c*1000)+"Bytes");
    System.out.println((c/1000)+"MegaBytes");
    }
    
}
