

package tema2ejercicio35;
import bpc.daw.reproductor.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio35 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta1 = "C:/Users/javie/OneDrive/Escritorio/mp3 eje2/CuartetodeNosElhijodeHernández.mp3";
        
        
        
        ArchivoMP3 a = new ArchivoMP3(ruta1);
        ArchivoMP3 a2 = new ArchivoMP3(ruta1);
        
        System.out.println(a==a2);
        
        //Nos dice "false", ya que esta comprobando si son
        //iguales dentro de la memoria del ordenador
        
        System.out.println(a.equals(a2));
        
        //Nos dice "true", esta viendo que es literalmente
        //el mismo archivo
        
        //Hashcode de dichos objetos
        
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
        
        //Coinciden
        
        
         ArchivoMP3 eyeless= new ArchivoMP3(ruta1);
         Reproducible r = eyeless;
         boolean sincrono = true;
         boolean info = false;

        Reproductor b = new Reproductor(r,sincrono,info);
        
        //Metodo toString en Reproductor
        
        System.out.println(b.toString());
        
        //Metodo toString en archivo MP3
        
        System.out.println(a2.toString());
    }

}
