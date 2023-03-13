package objeto;
import java.util.Map;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Programador extends TrabajadorTecleante{
    
    private Map<String,String> lenguajes;
    
    public Programador(String nombre, int sueldo, int numDNI, char letraDNI, int ppm) {
        super(nombre, sueldo, numDNI, letraDNI, ppm);
    }
    public void aprenderLenguaje(String lenguaje,String holamundo){
    
        this.lenguajes.put(lenguaje, holamundo);
    }
    public String programarHolamundo(String lenguaje) throws IllegalStateException {
    
        if(this.lenguajes.containsKey(lenguaje)==false){
            
            throw new IllegalStateException();
        }
        return this.lenguajes.get(lenguaje);
    }
}
