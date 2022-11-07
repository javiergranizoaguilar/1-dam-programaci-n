package tema2ejercicio10;
import bpc.daw.objetos.Caja;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Caja c=null;
    c=new Caja( "bienvenido al instituto");
    c.abrirCaja();
    String a=c.getMensaje();
    System.out.println(a);
    c.cambiarMensaje("tu mama es fea");
    String b=c.getMensaje();
    System.out.println(b);
    }
    
}
