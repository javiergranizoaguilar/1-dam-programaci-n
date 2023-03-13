package objetos;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Trabajador {
    
     private String dni;
    private String nombre;
    protected int sueldo;
    /**
     * 
     * @param nombre
     * @param sueldo
     * @param numDNI
     * @param letraDNI 
     */
    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI) {

        String aux;
        aux = (String) nombre;
        aux += letraDNI;
        this.dni = aux;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return 
     */
    public int getSueldo() {

        return this.sueldo;
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {

        return this.nombre;
    }
    /**
     * 
     * @return 
     */
    public String getDNI() {

        return this.dni;
    }
}
