

package tema2ejercicio44;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter dma= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fc = fecha.format(dma);
        System.out.println(fc);
        
        DateTimeFormatter dma2= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fg = fecha.format(dma2);
        System.out.println(fg);
    }

}
