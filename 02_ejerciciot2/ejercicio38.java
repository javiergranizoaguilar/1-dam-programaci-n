

package tema2ejercicio38;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=1;
        double b=-5;
        double c=6;
        
        System.out.println("1º Solucion");
        
        double s1 = (b + Math.sqrt(Math.pow(-b,2)-4*(a*c)))/(2*a);
        
        System.out.println("Solucion 1 = "+s1);
        
        
        System.out.println("2º Solucion");
        
        double s2 = (b - Math.sqrt(Math.pow(-b,2)-4*(a*c)))/(2*a);
        
        System.out.println("Solución 2 = "+s2);
    }

}
