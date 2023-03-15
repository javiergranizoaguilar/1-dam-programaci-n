package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class CuerpoTecnico extends Empleado{
    private String puesto;

    public CuerpoTecnico(String n, double s,String p) {
        super(n, s);
        this.puesto=p;
    }
    
    public String getPuesto(){
    
        return this.puesto;
    }
}
