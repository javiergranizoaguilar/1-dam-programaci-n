

package tema2ejercicio34;
import bpc.daw.reproductor.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{PlayList a=null;
            a=new PlayList("C:/Users/javie/OneDrive/Escritorio/music.txt");
            Reproductor b= new Reproductor(a,true,false);
            b.play();
        }
        catch(Exception IOException){
            System.out.println("no se a podido realizar");
        }
        
    }

}
