package objetos;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Rascacielos extends Edificio {

    private int altura;

    /**
     *
     * @param d direccion del rascacielos
     * @param np numero de plantas del racacielos
     * @param a altura del rascacielos
     */
    public Rascacielos(String d, int np, int a) {
        super(d, np);
        this.altura = a;
    }

    /**
     *
     * @return debuellve la altura del racacielos
     */
    public int getAltura() {

        return this.altura;
    }

}
