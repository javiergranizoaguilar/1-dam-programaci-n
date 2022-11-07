package ejercicio1.tem.pkg2;
import bpc.daw.mario.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio1Tem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mario m1,m2,m3,m4=null;
    Luigi l1,l2=null;
    Seta s1,s2=null;
    Cañon c1,c2=null;
    Disparo d1,d2=null;
    Planta p1,p2,p3,p4=null;
    
    //metodo constructor
    m1=new Mario();
    l1=new Luigi();
    s1=new Seta(0,0);
    c1=new Cañon(100,0);
    d1=new Disparo(50,0,0,0);
    p1=new Planta(1000,1000);
    
    //constructor de parmetros
    m2=new Mario(100,100);
    m3=new Mario(640,320);
    m4=new Mario(250,250);
    l2=new Luigi(200,200);
    s2=new Seta(0,825);
    c2=new Cañon(100,320);
    d2=new Disparo(66000,33000,0,33000);
    p2=new Planta(400,500);
    p3=new Planta(450,500);
    p4=new Planta(500,500);
    
    }
    
}
