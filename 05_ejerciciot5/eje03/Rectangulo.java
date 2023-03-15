package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Rectangulo {

    private int base;
    private int altura;
    private int area;
    /**
     * 
     * @param base base del rectangulo
     * @param altura altura del rectangulo
     */
    public Rectangulo(int base, int altura) {

        this.base = base;
        this.altura = altura;
        this.area=this.base*this.altura;
    }
    /**
     * 
     * @param base base de el rectangulo
     */
    public void setBase(int base) {

        this.base = base;
    }
    /**
     * 
     * @param altura altura del rectangulo
     */
    public void setAltura(int altura) {

        this.altura = altura;
    }
    /**
     * 
     * @return devuelve la base
     */
    public int getBase() {

        return this.base;
    }
    /**
     * 
     * @return devuelve la altura 
     */
    public int getAltura() {

        return this.altura;
    }
    /**
     * 
     * @return devuelve el area
     */
    public int getArea() {

        return this.area;
    }
}
