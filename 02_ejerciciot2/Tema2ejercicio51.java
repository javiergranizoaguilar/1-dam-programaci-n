

package tema2ejercicio51;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set mensajes = new HashSet<>();
        
        mensajes.add("silla");
        
        mensajes.add("mesa");
        
        mensajes.add("niño");
        
        mensajes.add("mesa");
        
        mensajes.add("casa");
        
        mensajes.add("silla");
        
        mensajes.add("lápiz");

        System.out.println(mensajes.size());

        System.out.println(mensajes.toString());
    }

}
