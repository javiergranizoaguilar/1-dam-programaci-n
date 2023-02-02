package tema2ejercicio26;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
import java.util.Scanner;
import java.lang.*;
public class Tema2ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("numero de segundos a esperar");
        double a=new Scanner(System.in).nextDouble();
        long b=(long) (a*1000);
        try{
        Thread.sleep(b);
        }
        catch(InterruptedException z)
        {
        System.out.println("no se a podido hacer");
        }
        System.out.println("fin del programa");
    }
    
}
