package tema2ejercicio11;
import bpc.daw.objetos.Caja;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Caja c1,c2=null;
    c1=new Caja("tu madre tiene una polla que lla la quisiera yo");
    c2=new Caja("me dio pena por tu padre el dia en que se entero");
    
        String m1=c1.getMensaje();
        String m2=c2.getMensaje();
        
        System.out.println(m1);
        System.out.println(m2);
        
    c1.cambiarMensaje(m2);
    c2.cambiarMensaje(m1);
    
        System.out.println(m2);
        System.out.println(m1);
    }
    
}
