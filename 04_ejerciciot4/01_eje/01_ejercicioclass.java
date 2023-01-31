package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class DNI {
    
    private int numero;
    private char letra;
    private String frase;
    
    public DNI(int n,char i){
    
        numero=n;
        letra=i;
    
    };
    public DNI(String a){
    
        letra=a.charAt(7);
        numero=Integer.parseInt(a.substring(0, 6)); 
    };
    
}
