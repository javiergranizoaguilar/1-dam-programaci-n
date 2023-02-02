package tema2ejercicio7;
import bpc.daw.objetos.DepositoAgua;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    DepositoAgua d = null;
    d=new DepositoAgua(15,50);
    d.dibujar();
    double porci=(15*100)/50;
    System.out.println("el porciento es:"+porci);
    }
    
}
