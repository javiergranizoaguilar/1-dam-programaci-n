

package tema2ejercicio53;
import java.util.TreeMap;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeMap ma = new TreeMap<>();

        ma.put(12535 + "ABC", "Color rojo");
        
        ma.put(98525 + "KWX", "Color amarillo");
        
        ma.put(17632 + "MSE", "Color verde");
        
        ma.put(85321 + "ABC", "Color amarillo");

        System.out.println("El tamaño es: " + ma.size());
        
        System.out.println(ma.toString());
    }

}
