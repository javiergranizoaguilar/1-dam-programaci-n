package exament3.pkg01;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Exament301 {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        int c = 5;
        int d = 0;
        int e = 5;
        int f = 0;

        while (b < 10) {

            System.out.println(a);
            a += 5;
            b++;
        }
        do {

            System.out.println(c);
            c += 5;
            d++;

        } while (d < 10);

        for (; f < 10; f++, e += 5) {
            System.out.println(e);
        }

    }

}
