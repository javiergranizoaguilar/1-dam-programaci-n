package tema2ejercicio22;
import bpc.daw.objetos.*;
import java.lang.Exception;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio22 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    TarjetaCredito a= null;
    a = new TarjetaCredito(5000,1111);
    try{
    int b = a.getSaldo(1111);
    System.out.println("el saldo es de: "+b);
    } 
    catch (Exception e){
    System.out.println("e");
    }
    try{
       boolean c=a.sacarDinero(2000, 1111);
       int b=a.getSaldo(1111);
       System.out.println("el saldo es de: "+b);
    }
    catch(Exception e){
        System.out.println("no a funcionado");
    }
    
    }
    
}
