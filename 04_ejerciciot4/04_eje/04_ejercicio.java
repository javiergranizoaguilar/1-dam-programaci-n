package ejercicios04t4;
import objeto.Persona;
import java.time.LocalDate;
import java.time.Month;
import objeto.DNI;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicios04t4 {

    public static void main(String[] args) {
        
        LocalDate z=LocalDate.of(10, Month.MARCH, 11);
        DNI w=new DNI(12345678,'a');
        
        Persona a=new Persona("a",w,12,z);
        Persona b=new Persona("a",w);
        Persona c=new Persona("a",12,z,12345678,'a');
        Persona d=new Persona("a",12345678,'b');
        
        System.out.println(a.getdate());
        System.out.println(a.getdniletra());
        System.out.println(a.getdninum());
        System.out.println(a.getnombre());
        System.out.println(a.getsueldo());
        System.out.println(b.getdate());
        System.out.println(b.getdniletra());
        System.out.println(b.getdninum());
        System.out.println(b.getnombre());
        System.out.println(b.getsueldo());
        System.out.println(c.getdate());
        System.out.println(c.getdniletra());
        System.out.println(c.getdninum());
        System.out.println(c.getnombre());
        System.out.println(c.getsueldo());
        System.out.println(d.getdate());
        System.out.println(d.getdniletra());
        System.out.println(c.getdninum());
        System.out.println(d.getnombre());
        System.out.println(d.getsueldo());
    }

}
