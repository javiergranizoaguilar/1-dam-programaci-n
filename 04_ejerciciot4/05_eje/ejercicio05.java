package ejercicios05t4;
import objeto.Oficina;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicios05t4 {

    public static void main(String[] args) {
        
        Oficina a=new Oficina("hola");
        
        System.out.println(a.getpersonas());
        System.out.println(a.getnameoficina());
        
        Oficina b=new Oficina("n",0);
        
        System.out.println(b.getpersonas());
        System.out.println(b.getnameoficina());
        
        Oficina c=new Oficina("n",1);
        
        System.out.println(c.getpersonas());
        System.out.println(c.getnameoficina());
        
        Oficina d=new Oficina("n",2);
        
        System.out.println(d.getpersonas());
        System.out.println(d.getnameoficina());
        
        Oficina e=new Oficina("n",3);
        
        System.out.println(e.getpersonas());
        System.out.println(e.getnameoficina());
        
        Oficina f=new Oficina();
        
        System.out.println(f.getpersonas());
        System.out.println(f.getnameoficina());
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        
    }
}
