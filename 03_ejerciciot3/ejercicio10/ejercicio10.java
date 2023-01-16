package tema3eje10;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema3eje10 {

    public static void main(String[] args) {

        String a = "";
        FileInputStream b = null;
        InputStreamReader c = null;
        BufferedReader d = null;
        String e = "";
        boolean f = true;

        System.out.println("dame la ruta del archivo .txt");

        a = new Scanner(System.in).nextLine();

        try {

            b = new FileInputStream(a);

            c = new InputStreamReader(b);
            d = new BufferedReader(c);
            while (f) {

                e = d.readLine();
                System.out.println(e);
                if (e == null) {

                    f = false;
                }
            }
            b.close();
            c.close();
        } catch (Exception IOException) {

            System.out.println("hubo un problema con la ruta intentelo de nuevo");

        }
    }

}
