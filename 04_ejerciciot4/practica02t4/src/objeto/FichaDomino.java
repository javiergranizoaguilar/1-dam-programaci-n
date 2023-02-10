package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class FichaDomino {
    
    private int ca;
    private int cb;
    private int cc;
    private boolean encaja;
    
    
    
    public FichaDomino(int a,int b){
    
        ca=a;
        cb=b;
    
    }
    public String voltea(){
    
        cc=cb;
        cb=ca;
        ca=cc;
        String aux;
        aux=ca+" | "+cb;
        return aux;
    }
    public int getca(){
    
        return ca;
    }
    public int getcb(){
    
        return cb;
    }
    public Boolean encaja(FichaDomino a){
        if(a.getca()==cb){
        
            encaja=true;
        }
        else{
            if(a.getcb()==cb){
        
                encaja=true;
            }
            else{
                
                if(a.getca()==ca){
        
                    encaja=true;
                }
                else{
                    encaja=false;
                }
            }
        }
        
        
        
        return encaja;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String aux;
        aux=ca+" | "+cb;
        return aux;
    }
    
}
