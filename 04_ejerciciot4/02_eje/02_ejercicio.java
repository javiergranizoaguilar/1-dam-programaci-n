package ejercicios02t4;
import objeto.Caja;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicios02t4 {

    public static void main(String[] args) {
        
        Caja a=new Caja();
        Caja b=new Caja("asd");
        Caja c=new Caja(true,"asd");
        
        System.out.println(a.getabierto());
        System.out.println(a.getmensaje());
        System.out.println(b.getabierto());
        System.out.println(b.getmensaje());
        System.out.println(c.getabierto());
        System.out.println(c.getmensaje());
    }

}
