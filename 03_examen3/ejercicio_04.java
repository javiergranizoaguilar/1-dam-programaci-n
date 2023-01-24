package exament3.pkg04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Exament304 {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        List<Integer> c = new ArrayList();

        System.out.println("dime un numero entero");
        a = new Scanner(System.in).nextInt();

        while (b != a + 1) {

            c.add(b);
            System.out.println(c);
            b++;
        }
        while (c.size() > 1) {

            c.remove(c.size() - 1);

            System.out.println(c);

        }
    }

}
