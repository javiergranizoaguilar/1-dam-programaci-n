package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Caja {
    
    private boolean abierto;
    private String mensaje;
    
    public Caja(){
    
        abierto=false;
        mensaje="Viva el tema 7";
    }
    public Caja(String a){
    
        mensaje=a;
    }
    public Caja(boolean a,String b){
    
        abierto=a;
        mensaje=b;
    }
    
    public boolean getabierto(){
    
        return abierto;
    }
    public String getmensaje(){
    
        return mensaje;
    }
    public void setabierto(boolean a){
    
        abierto=a;
    }
    public void setmensaje(String a){
    
        mensaje=a;
    }
    
}
