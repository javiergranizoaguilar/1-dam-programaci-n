

package tema2ejercicio52;
import java.awt.*;
import java.util.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String,Color> a = new HashMap<>();
        a.put("12535ABC", Color.RED);
        a.put("98525KWX",Color.YELLOW);
        a.put("17632MSE", Color.GREEN);
        a.put("85321ABC", Color.YELLOW);

        System.out.println("Tamano del map: "+a.size());
        
        System.out.println(a.toString());

        System.out.println("Dime la matricula del coche");
        
        String b = new Scanner(System.in).nextLine();

        if(a.containsKey(matricula)){
        System.out.println("Color del coche: "+a.get(b));
        }else{
            System.out.println("Esta matricula no existe");
        }
    }

}
