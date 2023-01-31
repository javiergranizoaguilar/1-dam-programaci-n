package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class DNI {
    
    private int numero;
    private char letra;
    
    public DNI(){
    
        numero=11111111;
        letra='s';
    }
    
    public DNI(int n,char i){
    
        numero=n;
        letra=i;
    
    }
    public DNI(String a){
    
        letra=a.charAt(8);
        numero=Integer.parseInt(a.substring(0, 7)); 
    }
    
    public int getnum(){
    
        return numero;
    }
    public char getletra(){
    
        return letra;
    }
    public void setnum(int a){
    
        numero=a;
    }
    public void setletra(char a){
    
        letra=a;
    }
}
