

package tema2ejercicio50;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList a=null;
        
        a=new ArrayList();
        
        System.out.println("dame una palabra");
        
        String b=new Scanner(System.in).nextLine();
        
        System.out.println("dame una palabra");
        
        String c=new Scanner(System.in).nextLine();
        
        System.out.println("dame una palabra");
        
        String d=new Scanner(System.in).nextLine();
        
        System.out.println("dame una palabra");
        
        String e1=new Scanner(System.in).nextLine();
        
        System.out.println("dame una palabra");
        
        String f=new Scanner(System.in).nextLine();
        
        a.add(b);
        
        a.add(c);
        
        a.add(d);
        
        a.add(e1);
        
        a.add(f);
        
        System.out.println("Tiene "+a.size()+" palabras");
        
        System.out.println("La palabra en la posicion 3 es: "+a.get(2));
        
        System.out.println("Lo que pasa si llamamos a un toString:"+a.toString());
        
        System.out.println("Elimino el primer puesto de la lista:"+a.remove(0));
        
        System.out.println("Tiene "+a.size()+" palabras");
        
        System.out.println("La palabra en la posicion 3 es: "+a.get(2));
        
        System.out.println("Lo que pasa si llamo al toString otra vez:"+a.toString());
    }

}
