package tema2ejercicio24;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dame la frase");
    String a=new Scanner(System.in).nextLine();
    System.out.println("dame la otra frase");
    String b=new Scanner(System.in).nextLine();
    PrintWriter c =null;
    try{
    PrintWriter d=new PrintWriter("C:/Users/javie/OneDrive/Escritorio/Frases.txt");
    d.println(a);
    d.println(b);
    d.close();
        }
    catch(FileNotFoundException z){
    System.out.println("no se a podido realizar");
        }
    }
    
}
