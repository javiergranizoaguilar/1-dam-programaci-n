

package exament3.pkg07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Exament307 {

    public static void main(String[] args) {
        
        List<Integer> a = new ArrayList();
        int c=0;
        int b=0;
        int d=0;
        int e []=null;
        
        while(b<5){
            System.out.println("dame un numero");
            c=new Scanner(System.in).nextInt();
            a.add(c);
            b++;
        }
        
            
            System.out.println(a.toString());
            
            System.out.println(a);
            
            a.toArray();
            
    }

}
