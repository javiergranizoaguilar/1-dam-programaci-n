package t2ejercicio23;
import bpc.daw.objetos.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class T2ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    TarjetaCredito a= null;
    a = new TarjetaCredito(1000,2222);
    try{
    int b = a.getSaldo(2222);
    System.out.println("el saldo es de: "+b);
    } 
    catch (Exception e){
    System.out.println("e");
    }
    
    
    a.ingresarDinero(100);
    
    
    try{
       int b=a.getSaldo(2222);
       System.out.println("el saldo es de: "+b);
    }
    catch(Exception e){
        System.out.println("no a funcionado");
    }
    
    
    try{
       boolean c=a.sacarDinero(2800, 2222);
       
       if(c=true){
           int b=a.getSaldo(2222);
           System.out.println("el saldo es de: "+b);
       }
       else {
           System.out.println("no se puede realizar esta accion");
            }
    }
    catch(Exception e){
        System.out.println("no a funcionado");
    }
    
    }
}
