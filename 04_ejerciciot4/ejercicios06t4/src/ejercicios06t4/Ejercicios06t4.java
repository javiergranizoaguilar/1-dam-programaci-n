

package ejercicios06t4;
import objeto.Punto;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicios06t4 {

    public static void main(String[] args) {
        
        Punto a=new Punto();
        Punto b=new Punto(1,3);
        Punto c=new Punto(b);
        Punto d=new Punto(35,20);
        
        
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(b.getX());
        System.out.println(b.getY());
        System.out.println(c.getX());
        System.out.println(c.getY());
        System.out.println(d.getX());
        System.out.println(d.getY());
        a.setx(100);
        a.sety(100);
        System.out.println(a.getX());
        System.out.println(a.getY());
        b.setx(100);
        b.sety(100);
        System.out.println(b.getX());
        System.out.println(b.getY());
        c.setx(100);
        c.sety(100);
        System.out.println(c.getX());
        System.out.println(c.getY());
        d.setx(100);
        d.sety(100);
        System.out.println(d.getX());
        System.out.println(d.getY());
        
        
    }

}
