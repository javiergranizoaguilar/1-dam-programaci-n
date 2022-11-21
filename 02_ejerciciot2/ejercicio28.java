

package tema2ejercicio28;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una IP o enlace a una pagina");
        String enlace = teclado.next();
        try{
        InetAddress ip=InetAddress.getByName(enlace);
        System.out.println("Nombre Host: "+ip.getHostName());
        System.out.println("La IP de su pagina es: "+ip.getHostAddress());

        } catch (Exception e) {System.out.println(e);}
    }
}
