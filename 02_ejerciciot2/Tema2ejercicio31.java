

package tema2ejercicio31;
import bpc.daw.musica.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion a=null;
        a=new Cancion("si");
        NotaMusical DO=null;
        DO=new NotaMusical(0,2);
        NotaMusical SOL=null;
        SOL=new NotaMusical(4,2);
        NotaMusical LA=null;
        LA=new NotaMusical(5,2);
        NotaMusical SOLb=null;
        SOLb=new NotaMusical(4,1);
        NotaMusical FAc=null;
        FAc=new NotaMusical(3,3);
        NotaMusical MIc=null;
        MIc=new NotaMusical(2,3);
        NotaMusical REs=null;
        REs=new NotaMusical(1,4);
        NotaMusical MIs=null;
        MIs=new NotaMusical(2,4);
        NotaMusical FAs=null;
        FAs=new NotaMusical(3,4);
        
        a.añadir(DO);
        a.añadir(DO);
        a.añadir(SOL);
        a.añadir(SOL);
        a.añadir(LA);
        a.añadir(LA);
        a.añadir(SOLb);
        a.añadir(FAc);
        a.añadir(FAc);
        a.añadir(MIc);
        a.añadir(MIc);
        a.añadir(REs);
        a.añadir(MIs);
        a.añadir(FAs);
        a.añadir(REs);
        a.añadir(DO);
        Instrumento p=null;
        p=new Piano();
        p.reproducir(a);
        Instrumento g=null;
        g=new Guitarra();
        g.reproducir(a);
    }

}
