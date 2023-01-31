package ejercicios01t4;
import objeto.DNI;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicios01t4 {

    public static void main(String[] args) {
        
        DNI a=new DNI(12,'a');
        DNI b=new DNI("1234567A");
        
        System.out.println(a.getletra());
        System.out.println(a.getnum());
        System.out.println(b.getletra());
        System.out.println(b.getnum());
    }

}
