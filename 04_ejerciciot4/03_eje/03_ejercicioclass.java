package objeto;
import java.time.LocalDate;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Marcador {
    
    private String nombrelocal;
    private String nombrevisitante;
    private int puntoslocal;
    private int puntosvisitantes;
    private LocalDate fecha;
    
    public Marcador(String v, String l){
        
        nombrelocal=l;
        nombrevisitante=v;
        puntoslocal=0;
        puntosvisitantes=0;
        fecha= LocalDate.now();
    }
    public Marcador(String v, String l,LocalDate d){
        
        nombrelocal=l;
        nombrevisitante=v;
        puntoslocal=0;
        puntosvisitantes=0;
        fecha=d;
    }
    public Marcador(String v, String l,LocalDate d,int pl,int pv){
        
        nombrelocal=l;
        nombrevisitante=v;
        puntoslocal=pl;
        puntosvisitantes=pv;
        fecha= d;
    }
    
}
