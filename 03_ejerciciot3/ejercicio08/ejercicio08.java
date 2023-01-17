package tema03eje08;

import java.util.*;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema03eje08 {

    public static void main(String[] args) {

        StringTokenizer b = null;

        boolean c = true;

        String d = null;

        boolean e = true;

        System.out.println("Dame una frase");

        String a = new Scanner(System.in).nextLine();

        b = new StringTokenizer(a, " ");

        while (c) {

            d = b.nextToken();

            System.out.println(d);

            c = b.hasMoreTokens();

        }

    }
}
