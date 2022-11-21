

package tema3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema3ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] a={"El hijo de Hernandez","I got no time","Mario Neta",
            "Raison d'etre","Enemy"};
        System.out.println("____________________________");
        System.out.println("|   LISTA MUSICAL DIARIA   |");
        System.out.println("|__________________________|");
        System.out.println("|1-  El hijo de Hernandez  |");
        System.out.println("|2-     I got  no time     |");
        System.out.println("|3-       Mario Neta       |");
        System.out.println("|4-     Raison  d'etre     |");
        System.out.println("|5-         Enemy          |");
        System.out.println("|__________________________|");
        
        System.out.println("dame una de las 5 canciones");
        int n=new Scanner(System.in).nextInt();
        switch(n){
        case 1:
            System.out.println("sonando: "+a[n-1]);
            break;
        case 2:
            System.out.println("sonando: "+a[n-1]);
            break;
        case 3:
            System.out.println("sonando: "+a[n-1]);
            break;
        case 4:
            System.out.println("sonando: "+a[n-1]);
            break;
        case 5:
            System.out.println("sonando: "+a[n-1]);
            break;
        }
    }

}
