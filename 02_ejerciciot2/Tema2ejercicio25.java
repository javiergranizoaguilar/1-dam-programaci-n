package tema2ejercicio25;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio25 {

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
    try{
    File f= new File("C:/Users/javie/OneDrive/Escritorio/Frases.txt");
    Scanner e=new Scanner(f);
    System.out.println(e.nextLine());
    System.out.println(e.nextLine());
    }
    catch(FileNotFoundException z){
    System.out.println("no se a podido realizar");
    }
    }
    
}
