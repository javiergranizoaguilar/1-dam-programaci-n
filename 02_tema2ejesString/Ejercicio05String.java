package ejercicio05.string;
import java.lang.StringBuilder;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio05String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("dame la frase");
        String a=new Scanner(System.in).nextLine();
        String b =a.replace(" ", "");
        StringBuilder c=new StringBuilder(b);
        String d= c.reverse().toString();
        System.out.println(d);
        System.out.println(b);
        if(b.equals(d))
        {
            System.out.println("es un palindromo");
        }
        else {
            System.out.println("no es un palindromo");
        }
        
    }
    
}
