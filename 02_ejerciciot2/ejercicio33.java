

package tema3ejercicio33;
import bpc.daw.reproductor.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema3ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayList a=null;
        a=new PlayList();
        ArchivoMP3 b=new ArchivoMP3("C:\\Users\\javie\\OneDrive"
                + "\\Escritorio\\mp3 eje2\\CuartetodeNosElhijodeHernández.mp3");
        
        ArchivoMP3 c=new ArchivoMP3("C:\\Users\\javie\\OneDrive\\Escritorio"
                + "\\mp3 eje2\\El Cuarteto de Nos - Mario Neta (Official Video).mp3");
        
        ArchivoMP3 d=new ArchivoMP3("C:\\Users\\javie\\OneDrive\\Escritorio\\mp3 "
                + "eje2\\Five Nights at Freddy's 4 Song - I Got No Time (FNAF4)"
                + " - The Living Tombstone.mp3");
        
        a.añadir(b);
        
        a.añadir(c);
        
        a.añadir(d);
        
        a.setTitulo("el musico");
        try {
            a.guardar("C:/Users/javie/OneDrive/Escritorio/music.txt");
            
            Reproductor e=new Reproductor(a,true,false);
            e.play();
        }
        catch (Exception IOException){
        System.out.println("no se a podido realizar");}
        
    }

}
