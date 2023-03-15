package objetos;

import java.util.*;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class GeneradorContrasenias {

    private Random random;

    public GeneradorContrasenias() {
        this.random = new Random();
    }

    public GeneradorContrasenias(Random r) {
        this.random = r;
    }

    public String generarContrasenia(int longitud) {
        StringBuilder contraseña = new StringBuilder();
        char letra;
        for (int x = 0; x < longitud; x++) {
            //Este metodo coge un numero del 0 al 2 aleatoriamente
            switch ((int) (Math.random() * (2 - 0 + 1) + 0)) {

                case 0:
                    //Ese metodo coge un numero al azar
                    letra = (char) ((int) (Math.random() * (57 - 48 + 1) + 48));
                    contraseña.append(letra);
                    break;

                case 1:
                    //Ese metodo se usa para coger una letra mayuscula
                    letra = (char) ((int) (Math.random() * (90 - 65 + 1) + 65));
                    contraseña.append(letra);
                    break;

                case 2:
                    //Ese metodo es para coger una letra minuscula
                    letra = (char) ((int) (Math.random() * (122 - 97 + 1) + 97));
                    contraseña.append(letra);
                    break;

                default:
                    break;
            }
        }
        return contraseña.toString();
    }

    public String generarContrasenia() {
        return this.generarContrasenia(8);
    }

}
