package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class EmpleadoPrimable extends Empleado{
    
    private boolean primado;

    public EmpleadoPrimable(String n, double s) {
        super(n, s);
    }
    public void primar(){
    
        this.primado=true;
    }
    public boolean esPrimado(){
    
        return this.primado;
    }
    
}
