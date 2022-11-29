

package tema2ejercicio36;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raiz = Math.sqrt(150);
        
        System.out.println(raiz);
        
        //2 elevado a 9, y se divide entre el logaritmo neperiano de 6
        
        
        double r = Math.pow(2,9)/Math.log(6);

        System.out.println(r);
        
        //Coseno de 0.16 radianes. 

        double cos = Math.cos(0.16);
        
        System.out.println(cos);
        
        //Seno de 45 grados (utiliza la clase Math para pasar de grados a 
        //radianes) 

        double rad = Math.toRadians(45);
        
        double sen = Math.sin(rad);
        
        System.out.println(sen);
    }

}
