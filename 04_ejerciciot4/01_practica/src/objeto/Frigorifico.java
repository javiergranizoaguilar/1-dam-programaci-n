package objeto;
import java.util.ArrayList;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Frigorifico {
    
    private int grados;
    private String marca;
    private ArrayList<String> articulos;
    
    public Frigorifico(){
    
        grados=0;
        marca="";
    }
    public Frigorifico(int a,String b){
    
        grados=a;
        marca=b;
    }
    
    public void setgrados(int a){
    
        grados=a;
    }
    public void setmarca(String a){
    
        marca=a;
    }
    public void addarticulos(String a){
    
        articulos.add(a);
    }
    public void remove(String a){
    
        articulos.remove(a);
    }
    public String getarticulos(){
    
        return articulos.toString();
    }
    
    public int getgrados(){
    
        return grados;
    }
    public String getmarca(){
    
        return marca;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
    
        String aux;
        aux="El frigorifico tiene una temperatura de: "+grados;
        aux+=" y su marca es: "+marca;
        return aux;
    }
}
