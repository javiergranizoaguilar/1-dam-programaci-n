

package tema3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
import bpc.daw.reproductor.*;
public class Tema3ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] a={"El hijo de Hernandez","I got no time","Mario Neta",
            "Raison d'etre","Enemy"};
        
        ArchivoMP3 c=new ArchivoMP3("c:/Users/javie/OneDrive/Escritorio/mp3 eje2/El Cuarteto de Nos - Mario Neta (Official Video).mp3");
        ArchivoMP3 d=new ArchivoMP3("c:/Users/javie/OneDrive/Escritorio/mp3 eje2/Five Nights at Freddy's 4 Song - I Got No Time (FNAF4) - The Living Tombstone.mp3");
        ArchivoMP3 f=new ArchivoMP3("c:/Users/javie/OneDrive/Escritorio/mp3 eje2/Imagine Dragons x J.I.D - Enemy (from the series Arcane League of Legends).mp3");
        ArchivoMP3 e=new ArchivoMP3("c:/Users/javie/OneDrive/Escritorio/mp3 eje2/レーゾンデートル - Eve MV.mp3");
        
        System.out.println("____________________________");
        System.out.println("|   LISTA MUSICAL DIARIA   |");
        System.out.println("|__________________________|");
        System.out.println("|1-  El hijo de Hernandez  |");
        System.out.println("|2-     I got  no time     |");
        System.out.println("|3-       Mario Neta       |");
        System.out.println("|4-     Raison  d'etre     |");
        System.out.println("|5-         Enemy          |");
        System.out.println("|__________________________|");
        
        System.out.println("dame una de las 5 canciones");
        int n=new Scanner(System.in).nextInt();
        switch(n){
        case 1:
            System.out.println("sonando: "+a[n-1]);
            ArchivoMP3 b=new ArchivoMP3("c:/Users/javie/OneDrive/Escritorio/mp3 eje2/CuartetodeNosElhijodeHernández(Video).mp3");
            Reproductor g=new Reproductor(b,false,false);
            g.play();
            break;
        case 2:
            System.out.println("sonando: "+a[n-1]);
            Reproductor h=new Reproductor(c,false,false);
            h.play();
            break;
        case 3:
            System.out.println("sonando: "+a[n-1]);
            Reproductor i=new Reproductor(d,false,false);
            i.play();
            break;
        case 4:
            System.out.println("sonando: "+a[n-1]);
            Reproductor j=new Reproductor(e,false,false);
            j.play();
            break;
        case 5:
            System.out.println("sonando: "+a[n-1]);
            Reproductor k=new Reproductor(f,false,false);
            k.play();
            break;
        }

    }

}
