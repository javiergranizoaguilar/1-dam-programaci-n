

package tema2ejercicio45;
import java.time.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate a= LocalDate.of(2100,2,28);
        DayOfWeek b =a.getDayOfWeek();
        System.out.println(b);
    }

}
