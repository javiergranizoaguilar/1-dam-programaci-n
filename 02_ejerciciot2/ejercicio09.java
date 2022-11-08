package tema2ejercicio09;
import bpc.daw.objetos.Caja;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Caja c=null;
    c=new Caja( "bienvenido al instituto");
    c.cerrarCaja();
    String b=c.getMensaje();
    System.out.println(b);
    c.abrirCaja();
    String a=c.getMensaje();
    System.out.println(a);
    }
    
}
