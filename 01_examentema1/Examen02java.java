/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen02java;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Examen02java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("****************************************");
    System.out.println("*        javier granizo aguilar        *");
    System.out.println("****************************************");
    System.out.println("dime un int");
    int intt=new Scanner(System.in).nextInt();
    System.out.println("dime un long");
    long lon=new Scanner(System.in).nextLong();
    System.out.println("dime un double");
    double dou=new Scanner(System.in).nextDouble();
    System.out.println("dime un boolean");
    boolean boo=new Scanner(System.in).nextBoolean();
    System.out.println("dime una frase");
    String stri=new Scanner(System.in).nextLine();
    System.out.println("este es el int: "+intt);
    System.out.println("este es el long: "+lon);
    System.out.println("este es el double: "+dou);
    System.out.println("este es el boolean: "+boo);
    System.out.println("este es el string: "+stri);
    
    }
    
}
