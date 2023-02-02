package ejercicio09.string;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio09String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc=new Scanner(System.in);
	int contador1=0;
	String palabra1="";
	String palabra2="";
	System.out.print("Dame una palabra: ");
	palabra1=sc.nextLine().trim();
	do {
            System.out.print("Dame una segunda palabra (Tiene que tener la misma longitud): ");
            palabra2=sc.nextLine().trim();
	} while (!(palabra1.length()==palabra2.length()));
	 for(int contador=0;contador<palabra1.length();contador++) {
	 for(int contador0=0;contador0<palabra1.length();contador0++) {
             if(palabra1.charAt(contador)==palabra2.charAt(contador0)) {
             ++contador1;
             }
        }
    }
    if(contador1==palabra1.length()) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
        }
    }
    
}
