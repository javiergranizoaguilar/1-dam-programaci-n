package tema2ejercicio20;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dime la ruta");
    String a=new Scanner(System.in).nextLine(); 
    File b=new File(a);
    boolean c =b.isDirectory();
    if(c =true){
        System.out.println("Es un directorio");
    }
    else {
        System.out.println("No es un directorio");
    }; 
    }
}
