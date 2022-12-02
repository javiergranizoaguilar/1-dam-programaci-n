

package tema2ejercicio46;
import java.time.Duration;
import java.time.Instant;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio=(int) (Math.random() * 11);
        
        try{
            Instant a =Instant.now();
            Thread.sleep(aleatorio*1000);
            Instant b =Instant.now();
            
            System.out.println("Instante antes de la pausa: "+a);
            System.out.println("Instante despues de la pausa: "+b);
           
            Duration c = Duration.between(a,b);
            System.out.println("Duracion de la pausa: "+c.getSeconds());
        }catch(InterruptedException e){
            System.out.println(e.getMessage());}
    }

}
