package tema03eje05;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema03eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n=new Scanner(System.in).nextInt();
        int a=0;
        
        System.out.println("Cuantas cazas diarias se te permiten");
        
        
        while(a<n){
        
            System.out.println("indica las piezas cazadas");
            
            int m=new Scanner(System.in).nextInt();
            
            a=m+a;
        
        }
        System.out.println("el limite a sido alcanzado");
    }

}
