package ejemplo1t4;
import objeto.cafetera;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejemplo1t4 {

    public static void main(String[] args) {
        
        cafetera a=new cafetera();
        
        cafetera b=new cafetera(10);
        
        cafetera c=new cafetera(100,1);
        
        System.out.println("norma");
        System.out.println("a max= "+a.getmax());
        System.out.println("a actual= "+a.getactual());
        System.out.println("b max= "+b.getmax());
        System.out.println("c max= "+c.getmax());
        System.out.println("b actual= "+b.getactual());
        System.out.println("c actual= "+c.getactual());
        
        a.setmax(100);
        a.setactual(10);
        b.setmax(1);
        b.setactual(130);
        c.setmax(33333);
        c.setactual(103);
        
        System.out.println("canvios en max y en actual");
        System.out.println("a max= "+a.getmax());
        System.out.println("a actual= "+a.getactual());
        System.out.println("b max= "+b.getmax());
        System.out.println("c max= "+c.getmax());
        System.out.println("b actual= "+b.getactual());
        System.out.println("c actual= "+c.getactual());
        
        a.llenarcafetera();
        b.llenarcafetera();
        c.llenarcafetera();
        
        System.out.println("llenar");
        System.out.println("a max= "+a.getmax());
        System.out.println("a actual= "+a.getactual());
        System.out.println("b max= "+b.getmax());
        System.out.println("c max= "+c.getmax());
        System.out.println("b actual= "+b.getactual());
        System.out.println("c actual= "+c.getactual());
        
        a.servirtaza(20);
        b.servirtaza(10);
        c.servirtaza(10);
        
        System.out.println("servir");
        System.out.println("a max= "+a.getmax());
        System.out.println("a actual= "+a.getactual());
        System.out.println("b max= "+b.getmax());
        System.out.println("c max= "+c.getmax());
        System.out.println("b actual= "+b.getactual());
        System.out.println("c actual= "+c.getactual());
        
        a.vaciar();
        b.vaciar();
        c.vaciar();
        
        System.out.println("vaciar");
        System.out.println("a max= "+a.getmax());
        System.out.println("a actual= "+a.getactual());
        System.out.println("b max= "+b.getmax());
        System.out.println("c max= "+c.getmax());
        System.out.println("b actual= "+b.getactual());
        System.out.println("c actual= "+c.getactual());
        
        a.agregarcafe(1000);
        b.agregarcafe(1000);
        c.agregarcafe(20);
        
        System.out.println("agregar");
        System.out.println("a max= "+a.getmax());
        System.out.println("a actual= "+a.getactual());
        System.out.println("b max= "+b.getmax());
        System.out.println("c max= "+c.getmax());
        System.out.println("b actual= "+b.getactual());
        System.out.println("c actual= "+c.getactual());
       
    }

}

