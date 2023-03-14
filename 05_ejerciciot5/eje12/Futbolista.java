package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Futbolista extends EmpleadoPrimable{
    
    private int dorsal;
    
    public Futbolista(String n, double s,int d) {
        super(n, s);
        this.dorsal=d;
    }
    
}
