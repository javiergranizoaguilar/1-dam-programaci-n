

package exament3.pkg02;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Exament302 {

    public static void main(String[] args) {
        
        int a=0;
        int b=0;
        
        while(a<10000){
        
            System.out.println("dame un numero");
            
            b=new Scanner(System.in).nextInt();
            
            a=a+b;
        }
        System.out.println("este es el numero: "+a);
    }

}
