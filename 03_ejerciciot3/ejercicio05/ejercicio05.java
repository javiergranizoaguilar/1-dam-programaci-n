package tema03eje05;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema03eje05 {
    
    public static void main(String[] args) {
        
        int n=new Scanner(System.in).nextInt();
        int a=0;
        int m=0;
        System.out.println("Cuantas cazas diarias se te permiten");
        
        
        while(a<n){
        
            System.out.println("indica las piezas cazadas");
            
            m=new Scanner(System.in).nextInt();
            
            a=m+a;
        
        }
        System.out.println("el limite a sido alcanzado");
    }

}
