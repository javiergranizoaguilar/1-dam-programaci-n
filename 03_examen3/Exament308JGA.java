package exament3.pkg08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Exament308 {

    public static void main(String[] args) {

        String a[] = {"", "", "", "", "", ""};
        List<Integer> c = new ArrayList();
        List<String> g = new ArrayList();
        int d=0;
        int f=1;

        for (int b = 0; b < 6; b++) {

            System.out.println("dame una palabra");
            a[b] = new Scanner(System.in).nextLine();

        }
        System.out.println(Arrays.toString(a));
        for (int b = 0; b < 6; b++) {

            if(a[b].toLowerCase().contains("a")){
                d++;
                c.add(b);
                g.add(a[b]);
                
            }
            
        }
        
        System.out.println("hay "+d+" palabras con a");
        for(int b=0;c.size()>b;b++){
        
            System.out.println("en la posicion "+(c.get(b)+1)+" se encuentra la palabra con a "+g.get(b));
        }
        
    }

}
