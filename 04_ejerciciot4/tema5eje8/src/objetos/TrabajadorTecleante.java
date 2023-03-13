package objetos;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class TrabajadorTecleante extends Trabajador {

    private int pulsacionesMinuto;
    protected Teclado teclado;

    /**
     *
     * @param nombre
     * @param sueldo
     * @param numDNI
     * @param letraDNI
     * @param ppm
     */
    public TrabajadorTecleante(String nombre, int sueldo, int numDNI, char letraDNI, int ppm) {
        super(nombre, sueldo, numDNI, letraDNI);
        this.pulsacionesMinuto = ppm;
    }

    public void setTeclado(Teclado t){
    
        this.teclado=t;
    }
    
    public Teclado getTeclado(){
    
        return this.teclado;
    }
    
    /**
     *
     * @return
     */
    public int getPulsacionesMinuto() {

        return this.pulsacionesMinuto;
    }

}
