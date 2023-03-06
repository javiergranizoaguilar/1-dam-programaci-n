package objeto;

import java.util.List;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Compras {

    private double presuspuesto;
    private List<Double> precios;

    public Compras(double presuspuesto) {

        this.presuspuesto = presuspuesto;

    }

    public void registrarCompra(double dinero) throws Exception {

        int n = 0;
        double precio = 0;
        while (n <= precios.size()) {
            precio = +this.precios.get(n);
        }
        if ((precio + dinero) > this.presuspuesto) {

            throw new Exception("el articulo que desea añadir supera "
                    + "el presuspuesto por exceso de " + ((precio + dinero) 
                            - this.presuspuesto));
        } else {
            this.precios.add(dinero);
        }
    }
}
