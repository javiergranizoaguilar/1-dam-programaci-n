package tema2.ejercicio08;
import bpc.daw.objetos.DepositoAgua;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    DepositoAgua d1,d2=null;
    d1=new DepositoAgua(15,20);
    d2=new DepositoAgua(5,20);
    d1.dibujar();
    d2.dibujar();
    d1.retirarLitro();
    d1.retirarLitro();
    d1.retirarLitro();
    d1.retirarLitro();
    d1.retirarLitro();
    d2.añadirLitro();
    d2.añadirLitro();
    d2.añadirLitro();
    d2.añadirLitro();
    d2.añadirLitro();
    d1.dibujar();
    d2.dibujar();
    }
    
}
