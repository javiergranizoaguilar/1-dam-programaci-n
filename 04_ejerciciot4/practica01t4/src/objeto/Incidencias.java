package objeto;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Incidencias {
    
    private String incidencia;
    private Integer nº;
    private String solucion;
    private String pendientes;
    private static int  posicion;
    private int  posicionr;
    private static int nºp;
    
    public Incidencias(int a,String b){
    
        incidencia=b;
        nº=a;
        pendientes="pendientes";
        nºp=nºp+1;
        posicion=posicion+1;
        posicionr=posicion;
    }
    
    public void resuelve(String a){
    
       pendientes=a;
       nºp=nºp-1;
       
    }
    public int getPendientes(){
    
      return nºp;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String aux;
        
        aux="Incidencia "+posicionr+" - puesto :"+nº+" - "+incidencia+" - "+pendientes;
        return aux;
    };
    
}
