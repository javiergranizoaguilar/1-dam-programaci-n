package objetos;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Edificio {

    private String direccion;
    private int numeroPlantas;

    /**
     *
     * @param d direccion de el edificio
     * @param np numero de plantas de el edificio
     */
    public Edificio(String d, int np) {

        this.direccion = d;
        this.numeroPlantas = np;
    }

    /**
     *
     * @return devuelve la direccion
     */
    public String getDireccion() {

        return this.direccion;
    }

    /**
     *
     * @return devuelve el numero de plantas
     */
    public int getNumeroPlantas() {

        return this.numeroPlantas;
    }
}
