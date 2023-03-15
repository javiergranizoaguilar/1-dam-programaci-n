

package pkg01_practica;
import objeto.Frigorifico;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
        
        Frigorifico f1=new Frigorifico(20,"aaaa");
        
        f1.addarticulos("fd");
        f1.addarticulos("eee");
        
        
        System.out.println(f1.getarticulos());
    }

}
