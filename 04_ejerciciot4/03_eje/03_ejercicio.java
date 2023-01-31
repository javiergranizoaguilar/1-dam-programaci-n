package ejercicios03t4;
import objeto.Marcador;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicios03t4 {
   

    public static void main(String[] args) {
        
        LocalDate c=LocalDate.of(10, Month.MARCH, 10);
        Marcador a=new Marcador("a","b");
        Marcador b=new Marcador("z","b",c,10,10);
        Marcador d=new Marcador("v","a",c);
        
        System.out.println(a.getfecha());
        System.out.println(a.getnamel());
        System.out.println(a.getnamev());
        System.out.println(a.getpuntosl());
        System.out.println(a.getpuntosv());
        System.out.println(b.getfecha());
        System.out.println(b.getnamel());
        System.out.println(b.getnamev());
        System.out.println(b.getpuntosl());
        System.out.println(b.getpuntosv());
        System.out.println(d.getfecha());
        System.out.println(d.getnamel());
        System.out.println(d.getnamev());
        System.out.println(d.getpuntosl());
        System.out.println(d.getpuntosv());
    }

}
