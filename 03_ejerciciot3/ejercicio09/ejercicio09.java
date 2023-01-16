package tema03eje09;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema03eje09 {

    public static void main(String[] args) {

        double s = 1;
        double a = 1;
        double n = 0;
        double z = 0;
        boolean x = true;

        System.out.println("dame un numero positivo");

        n = new Scanner(System.in).nextDouble();
        while (x) {

            s = 1 / 2 * (a + (n / a));

            z = s - a;
            if (z < 0.000001) {
                System.out.println("la solucion es aproximadamente" + s);
                x = false;
            } else {
                a = s;
            }
        }
    }

}
