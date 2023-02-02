package tema2.eje3;
import bpc.daw.mario.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mario m1=null;
    Luigi l1=null;
    Seta s1=null;
    Cañon c1=null;
    Disparo d1=null;
    Planta p1,p2,p3=null;
    
    
    m1=new Mario(0,500);
    m1.saltar();
    l1=new Luigi(1000,500);
    l1.correrHacia(0, 500);
    s1=new Seta(100,100);
    s1.andarHacia(0, 0);
    c1=new Cañon(1000,500);
    p1=new Planta(100,100);
    p2=new Planta(200,100);
    p3=new Planta(300,100);
    p1.comer(true);
    p2.comer(true);
    p3.comer(true);
    
    
    }
    
}
