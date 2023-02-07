package ejercicio07t4;
import objeto.CuentaCorriente;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio07t4 {

    public static void main(String[] args) {
        
        CuentaCorriente a=new CuentaCorriente();
        CuentaCorriente b=new CuentaCorriente(12);
        CuentaCorriente c=new CuentaCorriente(233,4.3);
        
        System.out.println(a.getnumero());
        System.out.println(a.getsaldo());
        System.out.println(b.getnumero());
        System.out.println(b.getsaldo());
        System.out.println(c.getnumero());
        System.out.println(c.getsaldo());
        
        a.setnumero(155);
        a.setsaldo(10000);
        
        System.out.println(a.getsaldo());
        
        a.añadirDinero(10000);
        
        System.out.println(a.getsaldo());
        
        a.sacarDinero(1111111);
        
        System.out.println(a.getsaldo());
        
    }

}
