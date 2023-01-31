package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class caja {
    
    private boolean abierto;
    private String mensaje;
    
    public caja(String a){
    
        mensaje=a;
    };
    public caja(boolean a,String b){
    
        abierto=a;
        mensaje=b;
    };
    public caja(){
    
        abierto=false;
        mensaje="Viva el tema 7";
    };
    
}
