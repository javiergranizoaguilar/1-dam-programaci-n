package exament3.pkg03;

import java.util.*;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Exament303 {

    public static void main(String[] args) {

        List<String> a = new ArrayList();
        int b = 0;

        while (b != 8) {

            a.add("*");
            b++;
        }
        while (b != 0) {

            System.out.println(a);

            a.remove(b - 1);

            b--;
        }
    }

}
