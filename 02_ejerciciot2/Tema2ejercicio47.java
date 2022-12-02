

package tema2ejercicio47;
import java.awt.Desktop;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce la ruta");
        String a = new Scanner(System.in).nextLine();
        File b = new File(a);
        
        Desktop c = Desktop.getDesktop();
        try{
        c.open(b);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
