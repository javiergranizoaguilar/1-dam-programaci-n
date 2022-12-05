

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
        Map<String,Color> mapa = new HashMap<>();
        mapa.put("12535ABC", Color.RED);
        mapa.put("98525KWX",Color.YELLOW);
        mapa.put("17632MSE", Color.GREEN);
        mapa.put("85321ABC", Color.YELLOW);

        System.out.println("Tamano del map: "+mapa.size());
        System.out.println(mapa.toString());

        System.out.println("Dime la matricula del coche");
        String matricula = new Scanner(System.in).nextLine();

        if(mapa.containsKey(matricula)){
        System.out.println("Color del coche: "+mapa.get(matricula));
        }else{
            System.out.println("Esta matricula no existe");
        }
    }

}
