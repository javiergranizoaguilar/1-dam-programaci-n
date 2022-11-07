package tema2eje5;
import bpc.daw.mario.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cañon c1,c2=null;
    c1=new Cañon(1000,0);
    c1.disparar(0, 0);
    c1.disparar(0, 0);
    c2=new Cañon(1000,100);
    c2.disparar(0, 100);
    c2.disparar(0, 100);
    c2.disparar(0, 100);
    double d1=c1.getTotalDisparosRealizados();
    double d2=c2.getTotalDisparosRealizados();
    }
    
}
