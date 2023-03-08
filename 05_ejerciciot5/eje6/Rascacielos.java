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
        if(a<0){
        
            throw new IllegalArgumentException();
        }
        this.altura = 10+(a*3);
    }

    /**
     *
     * @return devuelve la altura del racacielos
     */
    public int getAltura() {

        return this.altura;
    }

}
